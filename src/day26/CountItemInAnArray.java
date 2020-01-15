package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man", "Captain America", "Spiderman",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Capitan America", "Spiderman",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = "+sizeOfArray);


        String itemToSearch="Iron Man";
        int countOfItem = 0;

        for (String eachHero : marvelHeroes) {
            if(eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }
        System.out.println("Count Of Iron Man = " + countOfItem);

        // count the hero with the name contains black
        int countOfBlack=0;
        for (String eachHero : marvelHeroes) {
            if(eachHero.toUpperCase().contains("BLACK")){
                countOfBlack++;
            }
        }
        System.out.println("Count Of Heroes contains Black = " + countOfBlack);


    }
}
