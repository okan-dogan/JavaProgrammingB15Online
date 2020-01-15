package repl_it;
/*
An array inhabitants represents cities and their respective populations.
For example, the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 1]
Some cities have a population of 0 due to a pandemic zombie disease
that is wiping away the human lives.
After each day, any city that is adjacent to a zombie-ridden city will lose
half of its population.

Write a program to loop though each city population and
make it lose half of its population if it is adjacent(right or left)
to a city with zero people until all cities have no humans left.
Make updates to each element in the array And print the array like below
for each day:
Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities,
above was just an example numbers to follow.

Hint:
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 0]

Code:
System.out.println(Arrays.toString(inhabitants)));
 */
import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_170_ArraysZombieAttack2_withoutTempCanGiveError {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line


        for (int i = 0;  ; i++) {
            System.out.println("Day "+i+" "+Arrays.toString(inhabitants));
            for (int j=0 ; j<8 ;j++) {
                if(inhabitants[j]==0){
                    if(j==0){
                        inhabitants[j+1]/=2;
                        if(inhabitants[1]==0){
                            j++;
                        }
                    }else if(j==7){
                        inhabitants[j-1]/=2;
                        if(inhabitants[6]==0){
                            j++;
                        }
                    }else{
                        inhabitants[j-1]/=2;
                        inhabitants[j+1]/=2;
                        if(inhabitants[j+1]==0||inhabitants[j-1]==0){
                            j++;
                        }
                    }

                }

            }
            if(Arrays.toString(inhabitants).equals("[0, 0, 0, 0, 0, 0, 0, 0]")){
                System.out.println("Day "+(i+1)+" "+Arrays.toString(inhabitants));
                System.out.println("---- EXTINCT ----");
                break;
            }
        }


    }
}




