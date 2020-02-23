package day43;

public class Akbars_Notes_01182020 {
}
/*
TV
   attributes :
	brand , isOn , currentChannel
	Stirng , boolean , int   (range from 1-50)
   behaviours :
   	turnOn
   	turnOff
   	getcurrentChannel
   	setcurrentChannel (newChannelNumber)
   	moveForward
	moveBackward
----------------------
Class and Object
Class is a template for Object
it can define what kind of attribute and behaviour an object should have
attrinute : -->> instance variables | fields
behaviour : -->> instance methods
Object is the actual thing created out of this template
and any object created out of same template will have the attribute and behaviours defined in the template
Protecting the data|attribute of the object
we can encapsulate the instance field by making it private and provide public getters and setters
we have 4 access modifier :
	public , protected , default , private
(IGNORE protected for now until inheritance topic comes in )
public -->> accessible anywhere
default -->> no access modifer
		--> only within the package , also known as package private
private -->> only accessible within the same class
outside of the class when we create object we can give a object any name we want , like p1, p2  or any other name
if we want to refer the object in the template itself , we can use the keyword -->> this --> the current object we are working on
so outside the template it would look like  :
	Person p1 = new Person() ;
	p1.age = 18 ;
	p1.eat() ;
inside your template it would look like  :
	this.age -->> to point to the instance field age
	this.name -->> to point to the instance field name
	this.eat();  // optional , usually it will just work without
public class Person{
	private int age ;
	private String name;
	public int getAge(){
		return age ; // return this.age;
	}
	public void setAge(int newAge){
		// YOU HAVE OPTION HERE TO ADD BUNCH OF VALIDATION OR COED
		// TO MAKE SURE WE DONT HAVE INVALID AGE HERE
		age = newAge ;
	}
	public String getName(){
		return name; // return this.name;
	}
	public void setName(String name){
		// BUNCH OF VALIADITON I CAN USE HERE ....
		this.name = name ;
	}
	public void eat(){
		print(name + "eating") ;
	}
}
Computer
	attributes:  make it private
		brand, ram (1-128) , price
	behaviour
		runProgram
			--> print brand is running program with the ram  (size)
		calculate
			-->> print brand is calculating
		add getters and setters to all the fields
		ram can not be less than 1 more than 128
		price can not be less than 20
		toString method
Scanner scan = new Scanner(System.in);
String str = new String("abc");
Integer i1 = new Integer("12");
Integer i2 = new Integer(12);
Computer c1 = new Computer() ;
--- Constructor Review ---
Integer i1 = new Integer(12);
// how the constructor for Integer might look like
public Integer(int num){
	// some code here
}
Integer i1 = new Integer("12");
public Integer(String num){
	// some code here
}
Constructor is a block of code that run when object is being created
	it has same name as class name
	and has no return type
	it can be overloaded
Most use case of constructor is
	to provide inititial state (attribute values)
	for the object while being created
public Coffee {
	private String type;
	private int caffeineLevel
	private double price;
	// getters and setters here omitted
	// no arg constructor
	public Coffee(){
		//print("no arg constructor")
	}
	// 2 args constructor to set type and caffine level
	public Coffee(String type, int caffeineLevel){
		this.type = type;
		this.caffeineLevel = caffeineLevel ;
	}
	// WAKE UP TASK TO CREATE 3 ARGS CONSTRUCTOR
	// DO NOT LET THE PRICE GO BELOW 0
	// IF IT's less than 0 make it 1$
}
 */
