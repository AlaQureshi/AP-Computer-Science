import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Type an integer: ");
        int integers = read.nextInt();
        int y = integers * 2;
        System.out.println(integers + " times 2 = " + y);

}

}


