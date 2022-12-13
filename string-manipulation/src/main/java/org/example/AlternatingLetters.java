package org.example;

public class AlternatingLetters {
    public static void main(String[] args) {
        String s1 = "Spongebob";
        String s2 = "spongebob";
        System.out.println(s1+" -> "+alternate(s1));
        System.out.println(s2+" -> "+alternate(s2));

    }

    // Exercise, fill out this method
    // ex: input -> Spongebob, output -> SpOnGeBoB
    // ex: input -> spongebob, output -> sPoNgEbOb
    public static String alternate(String s) {
        String ans="";
        //if uppercase
        if(Character.toUpperCase((s.charAt(0)))==s.charAt(0)){
            for(int i=0; i< s.length(); i++){
                if(i%2==0){//even character will be uppercase
                    ans+=Character.toUpperCase((s.charAt(i)));
                }else{
                    ans+=Character.toLowerCase((s.charAt(i)));
                }
            }
        }else{
            //if lowercase
            for(int i=0; i< s.length(); i++){
                if(i%2==0){ //even characters will be lowercase
                    ans+=Character.toLowerCase((s.charAt(i)));
                }else{
                    ans+=Character.toUpperCase((s.charAt(i)));
                }
            }
        }
        return ans;
    }
}
