package main.day2;


import java .util.Scanner;
public class Gradecalc{
    public  static void main(String arg []){
        Scanner scanner = new Scanner(System.in);
        double mark = -1.0;

        System.out.println("=======================================");
        System.out.println("Grade calculating web");
        System.out.println("========================================");

        do{
            System.out.println("Enter mark the grade must be[0 - 100]:  ");
            if(scanner.hasNextDouble()){
                mark= scanner.nextDouble();
            }
            if(mark < 0 || mark > 100 ){
                System.out.println("the not write type of grade");
            }else {
                System.out.println("The mark u enterd is invalid");
            }
        }while(mark < 0 || mark >100 );

        char letterGrade;
        if (mark >= 90.0) {
            letterGrade = 'A';
        } else if (mark >= 80.0) {
            letterGrade = 'B';
        } else if (mark >= 70.0) {
            letterGrade = 'C';
        } else if (mark >= 60.0) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }


        String remark = switch (letterGrade){
            case 'A' -> "Distinction! Outstanding academic performance.";
            case 'B' -> "Very Good! Upper division pass.";
            case 'C' -> "Satisfactory Pass.";
            case 'D' -> "Conditional Pass. Support recommended.";
            case 'F' -> "Unsatisfactory. Academic re-evaluation required.";
            default -> "Unknown Grade";
        };
        boolean isPassed = (letterGrade != 'F');
        System.out.println("\n-----------------------------------------");
        System.out.println(" FINAL EVALUATION RESULT ");
        System.out.println("-----------------------------------------");
        System.out.printf(" Exam Mark Score : %.2f / 100.00%n", mark);
        System.out.println(" Letter Grade : " + letterGrade);
        System.out.println(" Academic Status : " + (isPassed ? "PASSED ✅" : "FAILED ❌"));
        System.out.println(" Instructor Remark: " + remark);
        System.out.println("=========================================");



    }

}


