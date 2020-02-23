package day43;

import day03.StringDataType;

public class Coffee {

    private String typeCof;
    private int caffeineLev;
    private double priceCof;
//    private int cofcof;

    public Coffee(){
        System.out.println("No arg constructor ");
    }

//    public Coffee(String typeCof, int caffeineLev){
//        this.typeCof=typeCof;
//        this.caffeineLev=caffeineLev;
//    }
//
//    public Coffee(String typeCof, int cofcof){
//
//    }

    public Coffee (String typeCof, int caffeineLev, double priceCof){
        this.typeCof=typeCof;
        this.caffeineLev=caffeineLev;
        setPriceCof(priceCof);
    }

    public String getTypeCof() {
        return typeCof;
    }

    public void setTypeCof(String typeCof) {
        this.typeCof = typeCof;
    }

    public int getCaffeineLev() {
        return caffeineLev;
    }

    public void setCaffeineLev(int caffeineLev) {
        this.caffeineLev = caffeineLev;
    }

    public double getPriceCof() {
        return priceCof;
    }

    public void setPriceCof(double priceCof) {
        if(priceCof>0){
            this.priceCof=priceCof;
        }else{
            this.priceCof=1;
        }
    }

    @Override
    public String toString() {
        return "type of Coffee is = " + typeCof +", Caffeine Level is = " + caffeineLev + ", Price of Coffee is = " + priceCof;
    }
}
