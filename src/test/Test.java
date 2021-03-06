package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Optional.of;

/**
 * Created by Bi on 7/12/17.
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
//        Integer[] intArr = {1,2,3,4,5};
//        Stream<Integer> integerStream = Stream.of(intArr);
//        System.out.println(integerStream.collect(Collectors.toList()));
//
//        // can not create Stream from int[]
//        int[] intArrPri = {1,2,3,4,5};
//        Stream<int[]> integerStream1 = Stream.of(intArrPri);
//        int a = integerStream1.collect(Collectors.toList()).size();
//        System.out.println(a);
//
//        Stream<String> names = Stream.of("Tran", "Van", "Quy");
//        System.out.println(names.collect(Collectors.toList()));
//
//        Stream<String> echoes = Stream.generate(() -> "Echo");
//        echoes.limit(10).collect(Collectors.toList()).forEach(System.out::println);

//        String str = new String["Quy"];

//        Optional<String> str = toUpper("tran van quy");
//        if (str.isPresent()) {
//            System.out.println(str.get());
//        }
//        System.out.println(str.orElse("Empty string"));
//        str.ifPresent(s -> System.out.println(s));

//        int sum = Arrays.asList(2,1,4,3).parallelStream()
//                .reduce(0, (x, y) -> x + y);
//
//        int product = Arrays.asList(2,1,4,3).parallelStream()
//                .reduce(1, (x, y) -> x * y);
//
//
//        System.out.println(sum);
//        System.out.println(product);

        List<String> stringList = Arrays.asList("Tran", "Van", "Quy", "Kim", "Long");
        Stream<Stream<Character>> streamStream = stringList.stream().map(s -> stringToStreamOfCharacter(s));
        List<Stream<Character>> streamList = streamStream.collect(Collectors.toList());

        streamList.forEach(stream -> {
            List<Character> listChar = stream.collect(Collectors.toList());
            System.out.println(listChar);
        });

        Stream<Character> characterStream = stringList.stream().flatMap(s -> stringToStreamOfCharacter(s));
        System.out.println(characterStream.collect(Collectors.toList()));



        System.out.println(test.stringToStreamOfCharacter("Quy").collect(Collectors.toList()));

    }

    static public Stream<Character> stringToStreamOfCharacter(String str) {
        List<Character> list = new ArrayList<>();

        for (char c: str.toCharArray()) {
            list.add(c);
        }

        return list.stream();
    }

    static public Optional<String> toUpper(String s) {
        return s.isEmpty() ? Optional.empty() : Optional.of(s.toUpperCase());
    }
}
