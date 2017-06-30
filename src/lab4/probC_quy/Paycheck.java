package lab4.probC_quy;

/**
 * Created by Bi on 6/29/17.
 */
final public class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    Paycheck(double grossPay) {
        this.grossPay = grossPay;
        fica = 23;
        state = 5;
        local = 1;
        medicare = 3;
        socialSecurity = 7.5;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public String print() {
        return "Gross pay: " + getGrossPay() + " Net pay: " + getNetPay();
    }

    public double getNetPay() {
        double totalTaxPercent = (getFica() + getState() + getLocal() + getMedicare() + getSocialSecurity()) / 100;
        return getGrossPay() - getGrossPay() * totalTaxPercent;
    }
}
