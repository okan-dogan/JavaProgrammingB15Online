package day41;
/*
Make this Product a well encapsulated
make all the instance fields private so it can oanly be accessible in same class
provide public getters and setters method
 */
public class Product {

    private String name;
    private double price;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        if(newPrice>0){
            price=newPrice;
        }

    }

    // you can use right click-->> generate-->>getter and setter
    // select the fields you want to create get and set instances
    // thats all


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
}
