package task8_1_Worker;

import java.util.Arrays;
import java.util.Scanner;
import java. util.*;

/**
 * Created by lion on 01.02.17.
 */
public class Main {
    static int temp;
    public static void main(String[] args) {
        Worker[] w = new Worker[5];
        Scanner in = new Scanner(System.in);
        String name;
        String pozition;
        int year;

        for (int i = 0; i < w.length; i++) {
            System.out.println("Enter " + (i + 1) + " worker: " + "1.Surname(initial): ");
            name = in.nextLine();//не можу ввести значення при другому проході
            System.out.println("2.Pozition: ");
            pozition = in.next();
            try {
                System.out.println("3.Year working: ");

                if (!in.hasNextInt()) {
                    throw new Exception("Wrong format");
                } else {
                    year = in.nextInt();
                    w[i] = new Worker(name, pozition, year);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                /*System.out.println("Enter the year again: ");

                    if(!in.hasNextInt()) {
                        throw new Exception("Wrong format");
                    }else{
                    year = in.nextInt();
                    //w[i] = new Worker(name, pozition, year);
                }

                }*/

            }
        }

        Arrays.sort(w, new Comparator<Worker>() {
            public int compare(Worker w1, Worker w2) {
                return w1.getName().compareTo(w2.getName());
            }
        });
        System.out.println(Arrays.toString(w));

        System.out.println("Enter number: ");
        temp = in.nextInt();
         f(w, temp);

    }
    static void f(Worker[] worker, int temp){
        int currentYear = 2016;
        for(int i = 0; i < worker.length; i++) {
            int experience = 2016 - worker[i].getYear();
                if(experience > temp){
                    System.out.println(worker[i].getName());
                }
        }


    }
}
