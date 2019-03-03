package CodeWars;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Function;

public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("P2.out"));
        Scanner in = new Scanner(new File("P2.in"));
        Function<double[], Double> dist = a -> a[0] * a[2] + (a[1] * Math.pow(a[2], 2)) / 2.0;
        while (true) {
            double[] vals = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
            if (vals[0]==0&&vals[1]==0&&vals[2]==0)
                break;
            output.write("" + dist.apply(vals));
            output.newLine();
            if (in.hasNextLine())
                in.nextLine();

        }
        in.close();
        output.close();
    }
}
