package day31;
/*
Once Array is created with certain size , it can not be changed.
So there is no adding or removing items when it comes to Array.
In order to stimulate such actions,
We need to create new array with correct size then copy what’s needed.
For example : “adding” one item at the end of an array  will look like this
since you are adding 1 so you will need an new array with size one more than original one.
copy everything into new array and assign the value you want to add to last item
{2, 6, 5, 4, 17, 8}       // assume this is original array
 |  |  |  |   |  |        // copy item by item into new array below
{2, 6, 5, 4, 17, 8 , 9 }  // then assign the value you want to add to last item
For example : “removing” one item at the end of an array  will look like this
since you are removing 1 so you will need an new array with size one less than original one.
copy everything into new array other than the last value to new array
{2, 6, 5, 4, 17, 8}   // assume this is original array
 |  |  |  |   |       // copy item by item into new array other than the last item
{2, 6, 5, 4, 17 }     // then we will get new array with one less item
-----------------------
With this in mind,  OPTIONALLY
Create a program that stimulate “inserting” an item into certain index
      (Hint : everything after will shift to next location).
Create a program that stimulate “removing” an item at certain index.
      (Hint : everything after will shift to previous location).
Create a program that stimulate “removing” all items equal to certain value.(or certain condition)
      (Hint : everything right after will shift to previous location).
We will learn ArrayList that does this out of the box.
And yet this will be good practice for your logical thinking skill.
Anyway, Looks like you are already removing Ahmed in one of your repl
 */
public class Task1_RemoveOrAddAnIndexIntoAnArray {
}
