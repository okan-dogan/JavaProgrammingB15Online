package day35;

public class StringToIntegerParsing {

    public static void main(String[] args) {
        // I have an employee ID : "FB-457"
        // give me the employee number and store it into a number

        String strNum="100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);
        
        String empID = "FB-457";
        // int id = Integer.parseInt(empID); cannot be used as the empID contains
        // some character not being numerical(FB-)
        //int id = Integer.parseInt(empID.substring(empID.indexOf("-")+1));
        /*
        String[] empIDSplit = empID.split("-");
        String idStr = empIDSplit[1];
        int id = Integer.parseInt(idStr);
        */
        int id = Integer.parseInt(empID.split("-")[1]);
        System.out.println("id = " + id);

        // I have a String called twoNumbers
        String twoNums = "100,600";
        // I want you to add them and give the result
        int fNum = Integer.parseInt(twoNums.split(",")[0]);
        int sNum = Integer.parseInt(twoNums.split(",")[1]);
        System.out.println("the total of the first and the second nums= " + (fNum+sNum));

    }
}
