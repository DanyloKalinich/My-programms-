package Homework1;
import java.util.Scanner;
public class Calcul {
    static int numb;
    static char []mas={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    static int a;

    static String DecimalConvert(int value,int pot){
        String b ="";
        while (value>0){
            a = value % pot ;
            b=mas[a] + "" +b;
            value = value / pot;
        }
        return b;
    }
    static void show(){
        System.out.print("2 система:"+DecimalConvert(numb,2)+"\n"
                +"8 система:"+DecimalConvert(numb,8)+"\n"
                +"16 система:"+DecimalConvert(numb,16)+"\n");
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Your number:");
        numb= scanner.nextInt();
        show();
    }
}
