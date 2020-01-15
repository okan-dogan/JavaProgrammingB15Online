package repl_it;
/*The Utopian Tree grows exactly 1 cm for the first three years,
and after that it grows by 2 cm every year, this is a simple implementation of the algorithm.
You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10

 */
public class Repl_It_123_UtopianTree {

    public static void main(String[] args) {

        int counter = 0;
        int treeSize = 0;

        for (int i = 1; i <=10 ; i++) {
            if(counter>=3){
                treeSize+=2;
                System.out.println("year "+i+" - growth 2 cm\n"+"tree size: "+treeSize+"cm");
                continue;
            }
            treeSize+=1;
            System.out.println("year "+i+" - growth 1 cm\n"+"tree size: "+treeSize+"cm");
            counter++;

        }

    }
}
