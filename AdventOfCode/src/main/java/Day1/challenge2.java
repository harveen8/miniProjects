package Day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class challenge2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("real.txt"));
            // keep track of the maximum
            int max = 0;
            // keep track of sum of current elf:
            int sum = 0;

            int max1=0;
            int max2=0;
            int max3=0;
            while(scanner.hasNext()) {
                String current = scanner.nextLine();
                if(current.equals("")) {
                    // do some logic to move on to the next elf
                    if(sum>max1){
                        max3=max2;
                        max2=max1;
                        max1=sum;
                    }else if(sum<max1 && sum>max2){
                        max3=max2;
                        max2=sum;
                    }else if(sum<max1 && sum<max2 && sum>max3){
                        max3=sum;
                    }
                    // this happens even if we have a new max (reset sum to 0 because we move on to a new elf)
                    sum = 0;
                }
                else {
                    // parse the current number:
                    int currentInt = Integer.parseInt(current);
                    // add the current to the sum of the current elf:
                    sum += currentInt;
                }
            }


            System.out.println("Final answer: " +max1 + " + " + max2 + " + " + max3+ " = " + (max1+max2+max3));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
        // Challenge, Refactor this solution to use less memory/less time
    }
}

