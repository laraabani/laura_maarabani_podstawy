import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("buzz");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizz buzz");
            } else {
                System.out.println(i);}
            }
            }
        }
