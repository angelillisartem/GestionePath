import java.io.*;
import java.util.*;

public class Main {
    public static Scanner in;
    public static File file;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        if (args.length == 1) {
            file = new File(args[0]);
        } else {
            System.out.print("\nInserisci il Path: ");
            file = new File(in.next());
        }

        if (file.isDirectory()) {
            for (File elem : Objects.requireNonNull(file.listFiles()))
                if (elem.isFile()) {
                    System.out.print("\nFile: " + elem.getName());
                } else {
                    System.out.print("\nDirectory: " + scorriFile());
                }
        } else {
            System.err.print("\nErrore: Path non esistente! ");
        }
    }

    public static String scorriFile() {
        String[] args = new String[0];

        if (args.length == 1) {
            file = new File(args[0]);
        } else {
            System.out.print("\nInserisci directory: ");
            file = new File(in.next());
        }

        if (file.isDirectory()) {
            for (File elem : Objects.requireNonNull(file.listFiles()))
                if (elem.isFile()) {
                    System.out.print("\nFile: " + elem.getName());
                } else {
                    System.out.print("\nDirectory: " + elem.getName());
                }
        } else {
            System.err.print("\nErrore: Path non esistente! ");
        }
        return scorriFile();
    }
}