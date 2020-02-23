package day60;

public class Akbar_Notes_02162020 {
}
/*
Exception :

	scan.nextInt() -->> expect number
	if we pass String --->> execption at run time
	str.charAt(100)  --->> execption at run time

	String str2 = null
	str2.charAt(0)  --->> execption at run time

	int[] arr = {1,2,4} ;
	print( arr[100]  ) -->> execption at run time
String str = "a" ;

	print(9/0) ;  -->> execption at run time



	Shape a1 = new Circle();
	Rectangle r1 = (Rectangle) a1 ;
	// above code compile but Throw ClassCastException at run time
	// Because Circle is NOT-A Rectangle


	The process of dealing with the unexpected event is called
	Exception Handling


	All different types of exceptions have its own class
	to be the blueprint for the exceptions object happen at run time

	Throwable is the super class type of all the exceptions classes


	Just like everything else :
	Exceptions are object !!!!!!!

	Exceptions in Java is categorized using Exception Hierarchy
		try to recover from it
		or report it
		dignose it / debug

	How do you handle exceptins :

		try catch block

		try{

			// code that might throw an exception

		}catch(Exception e){

			// just like method parameter :
			// Exception e  is a variable with type Exception
			// when java throw exception at run time
			// it will assign the exception object to variable e
			// for example if StringIndexOutOfBoundException happen in try block
			// it will do below
			// Exception e = new StringIndexOutOfBoundException("some message here");
			// if it's NullPointerException it will do below
			// Exception e = new NullPointerException(...);

			// since it's an object , we can call a method just like any other object
			// getMessage is useful method from Exception class
					// to get some more information about the exception object
					// created at run time

			// if the exception happen the flow of program will come here
			// take action to recover or just report or notify

		}
		// some more code
		// by handling the exception might occure during the program
		// our program will not shut down abruptly
		// we can end or continue the program gracefully.





		or delcare it










--- WHAT ABOUT COMPILER ERROR ????   NO ----
THIS IS SYNTAX ERROR THAT DOES NOT LET YOUR CODE COMPILER





Exception :
	abnormal or non-typical event
	to cause alteration of program flow

Exceptions are object just like everything else in Java

when exception occure in the program ,
an specific type of exception object that contains information
will be created according to what happen
and thrown to runtime system

9/0  --> 	this is what happen behind the scene
	throw new ArithmeticException( some message)

"abc".charAt(100) -->> this is what happen behind the scene
	throw new StringIndexOutOfBoundsException(....)


Since exceptions are object ,
It has its own class to be the blue print for the exception obejct

Exceptions are categorized by Inheritance relationship

 Exception Hierarchy :

 					Throwable

 		Error 					Exception


 						RuntimeException    Everything else


RuntimeException is sub class of Exception class.
Anything IS-A RuntimeException is regarded as Unchecked Exception
We are not forced to handle the exception at compile time.
Usually happen due incorrect usage of the method or library
for example : passing incorrect index for charAt method


Any Sub class of the Exception class other than RuntimeException
	is regarded as Checked Exception
	and We MUST (are forced to) handle or declare at compile time
Most of the time File related actions are checked exception
for example IOException , FileNotFoundException and so on


Whats the easiest way if I do not want to google to know its checked of Unchecked
just try to throw it using throw keyword
if compiler complains it means its checked if not unchecked


------ Most importantly Someone has to handle the exception obejct that created
       during the program run.

       try catch
       try catch catch catch
       try catch .... finally

       try{

       		cliffDiving();
       		gettingTheSleepingKidFromTheCar();

       }catch(DiveTooDeepException e){

       		hang on to the wire , told you so

       }catch(CryingOutOfBoundException e){

       		You cry too , ignore , pick the kid up , try to calm down
       		rock him to sleep again

       }catch( Exception e  ){

       		if anything else happen , come here !!!!

       } finally {

       		// no matter exception happen or caught or not happen at all
       		// this is the place that always run

       }


 ----------------   throw VS thorws --------------


throws keyword is used to document a method might throw that type of exception


public static void playWithFire throws GetBurnedException{
	// some code here
}

this is the only place you will see throws keywrod
in (any) method declareation and is not used anywhere else.
we will not use new keyword after throws

Since throws are used to document it might throw an exception
can i documemnt more than one type?

// assuming these exceptions actually exists
public void skyDiving() throws DiveTooDeepException, TooScareException,
								ParachuteNotWorkingException {

								}


throw keyword
Its used to actually programaitically throw the exception to the runtime system
just like actually breaking the glass rather than telling it might break

for example :  throw new AnyTypeOfException( optional message here) .

	What can you throw ?????
	ANYTHING IS-A Throwable ,
	any object created from Throwable class or Sub class of Throwable class
	even the Error (DO NOT TRY AT HOME!!!!!)

------ How to create custom Exception ? -----
 */
