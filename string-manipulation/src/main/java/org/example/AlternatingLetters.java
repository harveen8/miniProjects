package org.example;

public class AlternatingLetters {
    public static void main(String[] args) {
        String s = "Spongebob";
        String t = "spongebob";
        AlternatingLetters al =new AlternatingLetters();
        System.out.println(al.alternate(s));
        System.out.println(al.alternate(t));

    }

    // Exercise, fill out this method
    // ex: input -> Spongebob, output -> SpOnGeBoB
    // ex: input -> spongebob, output -> sPoNgEbOb
    public static String alternate(String s) {
        String ans="";
        if(Character.toUpperCase((s.charAt(0)))==s.charAt(0)){
            for(int i=0; i< s.length(); i++){
                if(i%2==0){
                    ans+=Character.toUpperCase((s.charAt(i)));
                }else{
                    ans+=Character.toLowerCase((s.charAt(i)));
                }
            }
        }else{
            for(int i=0; i< s.length(); i++){
                if(i%2==0){
                    ans+=Character.toLowerCase((s.charAt(i)));
                }else{
                    ans+=Character.toUpperCase((s.charAt(i)));
                }
            }
        }
        return ans;
    }
}
