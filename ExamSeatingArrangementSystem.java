import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExamSeatingArrangementSystem {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<String>();
        System.out.println("Enter the filename containing the list of students:");
        String filename = scanner.nextLine();
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            students.add(line.trim());
        }
        br.close();
        
    }

}
