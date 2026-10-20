package Case_Study_3;

import java.util.ArrayList;
import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students.add(sc.nextLine());
        }

        System.out.println("Students present:");
        for (String name : students) {
            System.out.println(name);
        }

        System.out.print("Enter name to search: ");
        String search = sc.nextLine();

        if (students.contains(search)) {
            System.out.println("Student is present");
        } else {
            System.out.println("Student is not present");
        }

        System.out.print("Enter name to remove: ");
        String remove = sc.nextLine();

        students.remove(remove);

        System.out.println("Students after removal:");
        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Number of students present: " + students.size());

        sc.close();
    }
}
