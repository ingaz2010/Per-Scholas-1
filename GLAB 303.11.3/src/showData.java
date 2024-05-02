//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class showData {
    public static void main(String[] args) {

    //instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue : mybooklist) {
            // ---- invoking getter method for getting Data ----------
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " "
            + showValue.getCategory() + " " + showValue.getAuthor());
        }
    }
}