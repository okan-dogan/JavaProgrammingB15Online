package day44;

public class Akbars_Notes_01192020 {
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
	// DO NOT LET THE PRICE GO BELOW O
	// IF IT's less than 0 make it 1$
}
Method review : the 3 categories
Paramter :
	method that has parameter or does not have paramter
return type :
	void method or method with return type
need an object to be called ?
	static method
	instance method
Everytime you create a class , it will be type
all these classes you created
Movie , Coffee , Car , Bike , TV , Person
Can be a data type
	What you can do with the data type  ???
	You can create object out of it --
	in the meantime , it can be your variable data type
	How many places we used data type other creating object
	you used it for local variable data type
	TV t1 = a tv object ;
	it can be used for method paramter just like string
	public static void printString(String str) {}
	public static void repairTVparts(TV yourTvObj ){ }
	it can be method return type just like String
	public static String giveMeYourName(){ return "java"}
	public static TV giveMeYourTV(){
		//return any TV Object
		return new TV();
	}
	// WHERE ELSE DID WE SEE VARIABLE ?
	// this is a engine class , blueprint of engine object
	public class Engine{
	}
	// this is a Car class , blueprint of engine object
	public class Car {
		String make;
		Engine e ;
	}
	String[] myArray ;
	Car[] myCars ;
	List<Car> myCarsLst ;
Pet
  attributes  : encapsulate your fields
		type
		name
  constructor :
  		no arg constructor
  			set the type to "unknown"
  			set the name to "no-name"
  		2 args constructor
  			set the name and type to what the caller passed
 behaviours
 		getters , setters , toString
 		speak  : void method with no arg
 			accept no parameter
 			according to the type speak following
 				cat --> meow
 				dog --> woof
 				cow --> mooo
 				horse --> neinei
Create another class called PetStore with main method
	Create 8 Pet objects with initial value
	Store them into a List<Pet>
	1, print out all info
	2, print out only name
	3, print out only cats
Class -- blue print for an object
	attributes of object
		instance fields
	behaviour of object
		instance methods
	constructor
		a spacial block of code that run while object is being created
		it has same as class name
		no return type
		It can be overloaded (different param list)
static members should be accessed in STATIC WAY!!!
ClassName.staticMethodName(...)
	static members
		 static method
		 	a method with static keyword
		 	can be called in static way
		 	call directly in main (if in same class)
		 	ClassName.staticMethodName(...)
		 		Pet.showGeneralPetInfo();
		 static field
-----------
ONCE you create a class , it can a type for :
	reference variable
		 Pet mypet ;
	it can show up in couple places
		 local variable : variable inside your method
		 method parameter data type:
		 field  : outside method , under the class
    it can also be a return type for your method
------  Constructor VS Setters --------
constructor :
	good when you want to create object with initial state (attribute values given)
setter :
	good when you want to change the value of existing object fields
 How to create a class that generate only immutable objects :
 create a class with private instance filed
 add a constructor to set the value while object is being created
 	 only provide getters for private fields
 	 but do not provide setters for private fields
 	 public class Person{
 	 	private String name ;
 	 	private int age ;
 	 	public Person(String name, int age){
 	 		this.name = name;
 	 		this.age = age;
 	 	}
 	 	public String getName(){
 	 		return name;
 	 	}
 	 	public int getAge(){
 	 		return age;
 	 	}
 	 }
 	 Person p1 = new Person("Jon Snow",27);
any data type that not primitive type
	its called reference type
	any reference variable store :
		 reference to the object in the heap
		 pointer to the object in the heap
		 address of the object in the heap
		 just like leash of the dog
		 just like remote of the tv
Variable categories :
by its type
	primitive | reference variable
by its location
	local variable
	method parameter
	field
----------
CyberHouse
	instance fields : int houseNum, String design
	private static field : String neighbourhoodName
	add 2 args constructor
		to set the houseNum, design
	instance method
		void showAllInfo()
			just print the houseNum, design neighbourhoodName in one line
	static void method showNeighborhood
		print the neighbourhoodName only
		// try to access houseNum, design and see what happen


--- acces modifer completed ----
public -->> accessible anywhere
protected -->>
			same package -->> accessible
			different package inside sub class -->> acessible
			Only place it can not be reached is
			unrelated class under different package
default -->> no access modifer
		--> only within the package , also known as package private
private -->> only accessible within the same class





*/


}
