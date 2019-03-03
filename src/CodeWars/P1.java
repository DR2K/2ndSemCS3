package CodeWars;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("P1.out"));
        Scanner in = new Scanner(new File("P1.in"));
        if (in.nextLine().equals("Wilbur"))
            output.write("Salutations, Wilbur! We are the Fighting Sandcrabs from Port Lavaca HS!");
        output.close();
        in.close();
    }
}
