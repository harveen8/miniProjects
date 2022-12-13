package Day2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("rockpaper.txt"));
            // keep track of points
            int gamePoints = 0;
            while(scanner.hasNext()) {
                String current = scanner.nextLine();
                //line to string to parse
                String strategy=current.toString();
                //rock=1, paper=2, scissors=3, win=6, tie=3
                //elf strategy is charAt(0) and ours is charAt(2)
                if(strategy.charAt(0)=='A' && strategy.charAt(2)=='X'){//r-r
                    gamePoints+=4; //tie+rock=3+1;
                }else if(strategy.charAt(0)=='A' && strategy.charAt(2)=='Y'){//r-p
                    gamePoints+=8;  //win+paper=6+2;
                }else if(strategy.charAt(0)=='A' && strategy.charAt(2)=='Z'){//r-s
                    gamePoints+=3;  //loss+s=3;
                }else if(strategy.charAt(0)=='B' && strategy.charAt(2)=='X'){//p-r
                    gamePoints+=1;  //loss+rock=1;
                }else if(strategy.charAt(0)=='B' && strategy.charAt(2)=='Y'){//p-p
                    gamePoints+=5;  //tie+paper=3+2;
                }else if(strategy.charAt(0)=='B' && strategy.charAt(2)=='Z'){//p-s
                    gamePoints+=9;  //win+s=6+3;
                }else if(strategy.charAt(0)=='C' && strategy.charAt(2)=='X'){//s-r
                    gamePoints+=7;  //win+rock=6+1;
                }else if(strategy.charAt(0)=='C' && strategy.charAt(2)=='Y'){//s-p
                    gamePoints+=2;  //loss+paper=2;
                }else {//s-s
                    gamePoints+=6;  //tie+s=3+3;
                }
            }
            System.out.println(gamePoints);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
    }
}
