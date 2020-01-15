package day35;

public class WrapperTyoePrimitiveType {

    public static void main(String[] args) {

        Integer num1 = 100;

        int num2 = Integer.valueOf("200");
        
        String str = "IPR2012-00001";
        int year1 = Integer.parseInt(str.substring(str.indexOf("-")-4,str.indexOf("-")));
        System.out.println("year1 = " + year1);

        int year2 = Integer.valueOf("IPR2012-00001".substring(3,7));
        System.out.println("year2 = " + year2);

        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("PGR2009-00034"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133"));
        System.out.println(getYearOutOfCaseNumber("AAA2001-10133"));
        System.out.println(getYearOutOfCaseNumber("PGR2018-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR12-00034"));


    }

    public static int getYearOutOfCaseNumber (String caseNumber){

        if(!(caseNumber.startsWith("CBM")||caseNumber.startsWith("DER")||
           caseNumber.startsWith("PGR")||caseNumber.startsWith("IPR"))){
            System.out.print("INVALID INPUT = ");
            return 0;
        }else if(caseNumber.split("-")[0].length()!=7){
            System.out.print("INVALID INPUT = ");
            return 0;
        }else if(caseNumber.split("-")[1].length()!=5){
            System.out.print("INVALID INPUT = ");
            return 0;
        }else{
            return Integer.parseInt(caseNumber.substring(3,7));
        }

    }
}
