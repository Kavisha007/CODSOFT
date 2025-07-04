import java.util.*;

class marks {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of subjects");
        int s=in.nextInt();
        int marks=0;
        for(int i=1;i<=s;i++){
            System.out.println("Enter your marks in the subject out of 100");
            int a=in.nextInt();
            marks=marks+a;
        }
        int avg=marks/s;
        System.out.println("Total marks = "+marks);
        System.out.println("Average percentage = "+avg);
        if (avg>=90 && avg <= 100) {
        System.out.println("Grade : A+");
        }
        else if(avg>=80 && avg <= 90){
        System.out.println("Grade : A");
        }
        else if(avg>=70 && avg <= 80){
        System.out.println("Grade : B");
        }
        else if(avg>=60 && avg <= 70){
        System.out.println("Grade : C");
        }
        else if(avg>=50 && avg <= 60){
        System.out.println("Grade : D");
        }
        else{
        System.out.println("Grade : F");
        }
       
    }
}
