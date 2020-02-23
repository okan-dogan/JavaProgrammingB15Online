package day61;

public class Akbar_Notes_02182020 {
}
/*
LinkedList VS ArrayList
	Internally
		ArrayList is backed by array
		LinkedList is backed by Node
		Node : an object that contains value
			plus the pointer to its neighbour
	getting random item by index
			ArrayList is better
	adding removing items
			LinkedList is better
Big O(read as oh) Notation :
	this is a way programmers describe
	the performace of an algorithm
	time complexity
	O(1) means the more elements you have
	in the list , it does not change
	the performance
	O(N) means the more elements you have
	in the list , it takes more time
	performance-wise
--------------------
Please create Job class
	location
	salary
	companyName
	encapsulate all the fields
	add constructor to set all the fileds value
	add toStirng method
Let this class implements Comparable interface
	and add comparing logic of by salary
Create a class called JobHunter with main method
Create a LinkedList of Jobs
and store your favorite 5 Jobs
assign it to jobList varibale with List<Job> reference
sort them and print out before and after
How do you Compare 2 Person objects with name and age
by both age and name :
{Hasan , 34 }
{Nelishan , 18 }
{Fatih , 34 }
{Mohammed , 21 }
lets sort them by age asc then by name asc
{Nelishan , 18 }
{Mohammed , 21 }
{Fatih , 34 }
{Hasan , 34 }
lets sort them by name desc then by age asc
{Nelishan , 18 }
{Mohammed , 21 }
{Hasan , 34 }
{Fatih , 34 }
 */
