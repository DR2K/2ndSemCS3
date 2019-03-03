package CodeWars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P0 {
    public static void main(String[]args) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("P0.out"));
        output.write("Hello, Dave. You're looking well today.");
        output.close();
    }
}
