package office_hour;

import java.util.ArrayList;
/*
Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
* print pass if its more than 60 fail if not
* count how many score are more than 90
* get the average score
* update the values with score-grade pair
  for example
79C , 54F, 100A, 65D, 44F , 89B , 95A
Optionally create 4 methods according to above criteria
 */
public class Practice_01_08_2020_Task2 {

    public static void main(String[] args) {

        ArrayList<String> grades = new ArrayList<>();
        grades.add("79");
        grades.add("54");
        grades.add("100");
        grades.add("65");
        grades.add("44");
        grades.add("95");
        grades.add("83");
        grades.add("55");
        grades.add("68");
        grades.add("70");

        int counter90 = 0;
        int countAv = 0;

        for (int i = 0; i <grades.size() ; i++) {
            if(Integer.valueOf(grades.get(i))>=60){
                System.out.println(grades.get(i)+" PASS");
            }else{
                System.out.println(grades.get(i)+" FAIL");
            }

            if(Integer.valueOf(grades.get(i))>=90){
                counter90++;
            }
            countAv+=Integer.valueOf(grades.get(i));

            if(Integer.valueOf(grades.get(i))>=90){
                grades.set(i,grades.get(i)+"A");
            }else if(Integer.valueOf(grades.get(i))>=80){
                grades.set(i,grades.get(i)+"B");
            }else if(Integer.valueOf(grades.get(i))>=70){
                grades.set(i,grades.get(i)+"C");
            }else if(Integer.valueOf(grades.get(i))>=60){
                grades.set(i,grades.get(i)+"D");
            }else if(Integer.valueOf(grades.get(i))<60){
                grades.set(i,grades.get(i)+"F");
            }
        }

        System.out.println("\n"+counter90+" note(s) is/are more than 90");
        System.out.println("\nThe Average score is = "+countAv/grades.size());
        System.out.println("\n"+grades);

    }


}
