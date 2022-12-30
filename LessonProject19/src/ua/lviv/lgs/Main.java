package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    private static final String BINARY_FILE1 = "Employee1.bin";
    private static final String BINARY_FILE2 = "Employee2.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(BINARY_FILE2);
        Employee employee = new Employee("Igor", 331, 2300);

        System.out.println("Deserealize from: " + BINARY_FILE1);
        Methods.serialize(employee, BINARY_FILE1);

        System.out.println(Methods.deserialize(BINARY_FILE1));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sema", 332, 3300));
        employees.add(new Employee("Andrew", 333, 2100));
        employees.add(new Employee("Irina", 343, 4000));
        employees.add(new Employee("Oleg", 234, 5000));
        employees.add(new Employee("Dima", 123, 5400));
        employees.add(new Employee("Grisha", 432, 6500));
        employees.add(new Employee("Rita", 323, 3400));

        System.out.println("\nDeserealize from: " + BINARY_FILE2);

        Methods.serialize(employees, BINARY_FILE2);
        
        ArrayList<Employee> employees2 = null;
        employees2 = (ArrayList<Employee>) Methods.deserialize(BINARY_FILE2);
 
        for (Employee empl : employees2) {
            System.out.println(empl);
        }


    }

}
