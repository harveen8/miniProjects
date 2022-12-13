package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        try {
            challenge2 challenge=new challenge2();
            Scanner scanner = new Scanner(new File("day3.txt"));
            // keep track of points
            int prioritySum = 0;
            //the first row
            HashSet<Character> characterHashSet= new HashSet<Character>();
            //similar values between them
            HashSet<Character> similars=new HashSet<Character>();
            //keep track of group
            int group=0;
            while(scanner.hasNext()) {
                String current = scanner.nextLine();
                //line to string to parse
                if(group==1) { //second row
                    for (int i = 0; i < current.length(); i++) {
                        if(characterHashSet.contains(current.charAt(i))){
                            similars.add(current.charAt(i));
                        }
                    }
                    group++;
                }else if(group==2) { //last row
                    for (int i = 0; i < current.length(); i++) {
                        if(similars.contains(current.charAt(i))){
                            prioritySum+=challenge.charToInt(current.charAt(i));
                            group=0;
                            characterHashSet.clear();
                            similars.clear();
                           break;
                        }
                    }
                }else {//first row
                    for (int i = 0; i < current.length(); i++) {
                        characterHashSet.add(current.charAt(i));
                    }
                    group++;
                }
            }
           System.out.println(prioritySum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
    }
    public int charToInt(char c){
        if(c=='a'){
            return 1;
        }else if(c=='b'){
            return 2;
        }else if(c=='c'){
            return 3;
        }else if(c=='d'){
            return 4;
        }else if(c=='e'){
            return 5;
        }else if(c=='f'){
            return 6;
        }else if(c=='g'){
            return 7;
        }else if(c=='h'){
            return 8;
        }else if(c=='i'){
            return 9;
        }else if(c=='j'){
            return 10;
        }else if(c=='k'){
            return 11;
        }else if(c=='l'){
            return 12;
        }else if(c=='m'){
            return 13;
        }else if(c=='n'){
            return 14;
        }else if(c=='o'){
            return 15;
        }else if(c=='p'){
            return 16;
        }else if(c=='q'){
            return 17;
        }else if(c=='r'){
            return 18;
        }else if(c=='s'){
            return 19;
        }else if(c=='t'){
            return 20;
        }else if(c=='u'){
            return 21;
        }else if(c=='v'){
            return 22;
        }else if(c=='w'){
            return 23;
        }else if(c=='x'){
            return 24;
        }else if(c=='y'){
            return 25;
        }else if(c=='z'){
            return 26;
        }else if(c=='A'){
            return 27;
        }else if(c=='B'){
            return 28;
        }else if(c=='C'){
            return 29;
        }else if(c=='D'){
            return 30;
        }else if(c=='E'){
            return 31;
        }else if(c=='F'){
            return 32;
        }else if(c=='G'){
            return 33;
        }else if(c=='H'){
            return 34;
        }else if(c=='I'){
            return 35;
        }else if(c=='J'){
            return 36;
        }else if(c=='K'){
            return 37;
        }else if(c=='L'){
            return 38;
        }else if(c=='M'){
            return 39;
        }else if(c=='N'){
            return 40;
        }else if(c=='O'){
            return 41;
        }else if(c=='P'){
            return 42;
        }else if(c=='Q'){
            return 43;
        }else if(c=='R'){
            return 44;
        }else if(c=='S'){
            return 45;
        }else if(c=='T'){
            return 46;
        }else if(c=='U'){
            return 47;
        }else if(c=='V'){
            return 48;
        }else if(c=='W'){
            return 49;
        }else if(c=='X'){
            return 50;
        }else if(c=='Y'){
            return 51;
        }else {
            return 52;
        }
    }

}

