package org.example;

public class Main {
    public static void main(String[] args) {
//        Task 1

        multiply();
//        ------------------------------------
//        Task 2

        checkOddEven("2  v v ");
//        ------------------------------------
//        Task 3
//        mushaobs int array-s gadacemisas, radgan es metodi int tipis parametrebs igebs

        int[] numberList = {1, 54, -516, 5454, 855, 222, 487851};
        printArray(numberList);
//        ------------------------------------
//        Task 4
//        mushaobs mxolod inglisur anbanze

        countVowel("ksjdbflksldksjdvnwuehflk dscl");
//        ------------------------------------
//        Task 5
//        mushaobs mxolod inglisur anbanze


        countConsonants("Hello World!!!");
    }

    static void multiply(){
        int count=1;
        while (count<=10){
            System.out.println("3*"+count+"="+3*count);
            count++;
        }
    }
    static void checkOddEven(String text){

        int textLength=text.length();
        int lengthTrimmed=text.trim().length();
        if(textLength==0 || lengthTrimmed==0){
            System.out.println("გთხოვთ შეიყვანეთ ტექსტი <3");}
        else if (textLength%2==0){
            System.out.println("ლუწი");
        }else{
            System.out.println( "კენტი");}
    }
    static void printArray(int [] arr){
        for (int i=0; i<arr.length;i++){
            if(i==5) continue;
            System.out.println("პოზიცია"+" "+i+"-ზეა"+" "+arr[i]);
        }
    }
    static void countVowel(String text){
        int count=0;
        for(int i=0; i<text.length();i++){
            if(text.charAt(i)=='a'||
                    text.charAt(i)=='e'||
                    text.charAt(i)=='i'||
                    text.charAt(i)=='o'||
                    text.charAt(i)=='u') {
                count++;
            };
        }
        System.out.println("ტექსტში" +" "+ count + " "+"ხმოვანია");


    }
    static void countConsonants(String text){
        int count=0;
        int i=0;
        while(i<text.length()){
            if(Character.isLetter(text.charAt(i))){
                if(!(text.charAt(i)=='a'||
                        text.charAt(i)=='e'||
                        text.charAt(i)=='i'||
                        text.charAt(i)=='o'||
                        text.charAt(i)=='u')) {
                    count++;
                };
            }
            i++;
        }
        System.out.println("ტექსტში" +" "+ count+ " "+"თანხმოვანია");

    }
}