package day45;

public class Akbar_Notes_01212020 {
}
/*
----------- note class 1/21/2020
static VS instance field
static field : a field marked as static
	it has only one copy for each and every object from this template|blueprint
	and if the value change , everyone get affected.
	We don't need an object to use static field
	we use static way to access static members
	ClassName.staticMemberName
	can we use object to access static field?
	assuming House a is class , neighbourhoodName is a static field
	House.neighbourhoodName
	NOT RECOMMENDED BUT STILL COMPILE
	assuming h1 is pointing to valid House object
	h1.neighbourhoodName
instance field :
	each and every object get their own value
	and changing one objects field value
	does not affect other objects
what can we access in static method :
		only static members (field, methods)
what can we access in instance method :
		everything
what can we access in constructor :
		everything
--------Inheritance -----------
access modifier
private -- default -- protected -- public
default : only same package
protected :
		default +
		acccessible subclasses outside package
what is inherited from super class
all the visible fields
all the visible methods
CONSTRUCTOR IS NOT INHERITED `
------
sub class constructor can call
the super class constructor
to reuse the functionality it has
we use super(args if needed) to call.
each and every constructor of any class
will implicitly call super()
as first statement of the constructor
unless other constructors are called explicitly
so in order to avoid error because of this implicit call,
always add no arg constructor in super class
even though it is not required
practical usage of super(..) functionality is
to reuse the functionality of setting the field values
comes from super class by calling super(field1,field2,field3..)
--- overriding
Sub class can provide
its own implementation of
inherited super class instance methods
This is called overriding.
We can optionally use @Override to make it clear
once being used it will enforce overriding rule
or bookish definition below :
Overriding is a feature that
allows a subclass or child class to
provide a specific implementation of a method
that is already provided by
one of its super-classes or parent classes.
When a method in a subclass has
the same name, same parameters or signature
and same return type(or sub-type)
as a method in its super-class,
then the method in the subclass
is said to override the method in the super-class.
 */
