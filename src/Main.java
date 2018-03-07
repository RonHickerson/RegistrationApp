import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("\n\nHello, RegistrationApp!\n");

    // Read Curriculum into ArrayList
        ArrayList<Course> curriculum = new ArrayList<Course>();

        BufferedReader reader = null;

        try {
            File file = new File("curriculum.dat");
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                String courseName = reader.readLine();
                int courseNum = reader.read();
                int courseHours = reader.read();
                Course course = new Course(courseName, courseNum, courseHours);
                curriculum.add(course);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(curriculum);
    }
}
