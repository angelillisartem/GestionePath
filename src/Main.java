import java.io.*;
import java.util.*;

public class Main {
    public static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);

        File file;

        if (args.length == 1) {
            file = new File(args[0]);
        } else {
            System.out.print("\nInserisci il Path: ");
            file = new File(in.next());
        }

        if (file.isDirectory()) {
            for (File elem : Objects.requireNonNull(file.listFiles()))
                if (elem.isFile()) {
                    System.out.print("\nF " + elem.getName());
                } else {
                    System.out.print("\nD " + elem.getName());
                }
        } else {
            System.out.print("\nPath non esistente!");
        }
    }
}