 package Day4;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("day4.txt"));
            // keep track of sum of fully contained
            int sum = 0;
            while(scanner.hasNext()) {
                String current = scanner.nextLine();

                //sample input: 2 - 4 , 6 - 8
                String[] bothRanges= current.split(",");
                String[] range1 = bothRanges[0].split("-");
                String[] range2 = bothRanges[1].split("-");
                int min1=Integer.parseInt(range1[0]);
                int max1=Integer.parseInt(range1[1]);
                int min2=Integer.parseInt(range2[0]);
                int max2=Integer.parseInt(range2[1]);
                //check if 1st range in 2nd
                if(min1<min2 && max1<min2){ //2nd is larger than 1st

                }else if(min2<min1 && max2<min1){ //1st is larger than 2nd

                }else{
                    sum++;
                }
            }
            System.out.println("Final answer: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
    }
}