//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class myRunner {
    public static void main(String[] args) {

        //initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25); //passing int
        dObj.genericsMethod("Per Scholas"); //passing String
        dObj.genericsMethod(2563.5); //passing float
        dObj.genericsMethod('H'); //passing Char

        //initialize generic class
        //with String and Integer Data
        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        //initialize generic class
        //with String and String data
        GMultipleDatatype<String, String> mobj2 =  new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}