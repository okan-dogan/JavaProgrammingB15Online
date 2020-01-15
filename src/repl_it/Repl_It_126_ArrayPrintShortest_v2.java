package repl_it;
/*
Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings.  Print array with Arrays.toString() method. Sort array before printing.
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */
import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_126_ArrayPrintShortest_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arrStr1 = str.split(", ");

        String shortestWord = arrStr1[0];
        String shortestWords = "";

        for (String eachWord1 : arrStr1) {
            if(eachWord1.length()<shortestWord.length()){
                shortestWord=eachWord1;
            }
        }
        for (String eachWord2 : arrStr1) {
            if(eachWord2.length()==shortestWord.length()){
                shortestWords+=eachWord2+",";
            }
        }
        String[] arrStr2 = shortestWords.split(",");
        Arrays.sort(arrStr2);
        System.out.println(Arrays.toString(arrStr2));

    }
}
