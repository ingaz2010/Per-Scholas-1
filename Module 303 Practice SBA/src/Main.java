//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();

        String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
        methods.randomizeList(names);

        methods.combination();

        String numbers = "3746373811111111";
        methods.stringArithmetic(numbers);

        String s = "597";
        methods.printing(s);

        String n = "824";
        methods.division(n);
        methods.subtraction(n);

    }
}