import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) throws IOException {
        try{
            String location = "C:\\Users\\Inga Israr\\Downloads\\CourseData.csv";
            File file = new File(location);
            Scanner inpute = new Scanner(file);
            ArrayList<course> data = new ArrayList<>();

            while(inpute.hasNextLine()){
                String line = inpute.nextLine();
                String[] splitedLine = line.split(",");

                // course cObj1 = new course(splitedLine[0], splitedLine[1], splitedLine[2]);
                course cObj = new course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourse_name(splitedLine[1]);
                cObj.setInstructor_name((splitedLine[2]));

                data.add(cObj);
            }

            for(course c : data){
                System.out.println(c.getCode() + " | " + c.getCourse_name() + " | " + c.getInstructor_name());
                System.out.println("=================================");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
