package at.ac.fhcampuswien;


import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        float a;
        float b = 0;
        int count=1;
        int breaker=0;
        int trigger=0;

        DecimalFormat df = new DecimalFormat("0.00");  //https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/

        do {
            System.out.print("Number "+count+": ");
            a = scanner.nextFloat();
            //System.out.println("a: "+a);

            if (a <= 0 && count < 2){
                System.out.println("No number entered.");
                breaker = 1;
                trigger = 1;
            }
            if (a <= 0 && count >= 2) {
                breaker = 1;
            }

            if(a > b){
                b = a;
            }

            count++;
            //System.out.println("Counter: "+count);
        }while(breaker != 1);

        if(trigger != 1) {
            System.out.println("The largest number is " + df.format(b));
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        int a;
        int b = 1;

        System.out.print("n: ");
        a = scanner.nextInt();

        if (a <= 0){
            System.out.println("Invalid number!");
        }

        for (int n = 1; n <= a; n++) { // count to size a
            for (int i = 1; i <= n; i++){
                System.out.print(b+" ");
                b++;                                                    //Help for thinking used from https://stackoverflow.com/questions/45505748/number-staircase-nested-loop
            }                                                           //Playing with this killed my braincells
            System.out.print(System.lineSeparator());                   //Until I found out this is the area I needed to use to get the new lines right...
        }                                                               //https://www.geeksforgeeks.org/system-lineseparator-method-in-java-with-examples/
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int b = 6;      //Spalten(a), Zeilen(b)
        String c = "*";
        String d = "*";

        for (int i=0;i<b;i++){                  //https://www.programiz.com/java-programming/examples/pyramid-pattern
            for (int j=b-i;j>1;j--){            //https://www.educative.io/answers/how-to-concatenate-strings-in-java
                System.out.print(" ");          //Diese Aufgabe wurde letztendlich durch logisches Denken vervollständige mit ein paar Verluste an Gehirnzellen
            }
            for (int k=0;k<1;k++){
                System.out.print(c);
                c = c + (d+d);
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int h;
        char c;

        System.out.print("h: ");
        h = sc.nextInt();

        System.out.print("c: ");
        c = sc.next().charAt(0);            //https://www.javatpoint.com/how-to-read-character-in-java
        c = (char)(c + 1);

        /*for(int p = 65;p <= 122;p++) {
            if (c == b){
                c = b;
                break;          TESTING PURPOSES
            }
           b++;
            System.out.print(c);
            System.out.println(b);
        }*/
                                            //https://blog.nerdmind.de/page/ascii-tabelle/
                                            //https://javarevisited.blogspot.com/2016/12/how-to-print-pyramid-pattern-of-alphabets-in-java.html#axzz7hhyoREvk

        if (h % 2 == 0){
            System.out.println("Invalid number!");
            //System.exit(0);                    //https://linuxhint.com/end-java-program/
        }else {
            h = h / 2;

            for (int i = 1; i <= h + 1; i++) {
                for (int j = h - i; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print((char) (c - k));
                }
                for (int g = 2; g <= i; g++) {
                    System.out.print((char) (c - g));
                }
                System.out.println();
            }

            for (int i = h; i > 0; i--) {
                for (int j = i; j <= h; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print((char) (c - k));
                }
                for (int g = 2; g <= i; g++) {
                    System.out.print((char) (c - g));
                }
                System.out.println();
            }
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        float a;
        float b=0;
        float average;
        int check = 0;
        int counter = 1;
        int mark = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        do {
            System.out.print("Mark "+counter+": ");
            a = sc.nextFloat();

            if (a < 1 || a > 5){
                if (a == 0 && counter > 2){
                    counter--;
                    check = 1;
                }else {
                    System.out.println("Invalid mark!");
                    b = b - a;
                    counter--;
                    mark++;
                }
            }
            if (counter >= 4 && a == 0){
                mark++;
            }

            b += a;

            counter++;
        }while(check != 1);
        sc.close();

        average = b / (counter-1);
        System.out.println("Average: "+df.format(average));
        System.out.println("Negative marks: "+mark);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);                        //https://www.educba.com/happy-numbers-in-java/

        int n;
        int r;
        int num;
        int sum = 0;                    //Stop this torture please xd
                                        // I will definitely not be a programmer
        System.out.print("n: ");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy number!");
        }
        else
        {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}