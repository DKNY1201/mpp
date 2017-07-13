package lab9.part1.prob5;

import java.util.Objects;

/**
 * Created by Bi on 7/13/17.
 */
public class Pair {
    SortMethod sortMethod;
    Pair(SortMethod sortMethod ) {
        this.sortMethod = sortMethod;
    }

    public SortMethod getSortMethod() {
        return sortMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Pair p = (Pair) o;

        return getSortMethod().equals(p.getSortMethod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSortMethod());
    }
}
