package Implementation;

import Sorting.SelectionSort;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {


        SelectionSort testSort = new SelectionSort();

        ArrayList<Integer> array = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i<10000; i++) {
            array.add(random.nextInt());
        }

        testSort.sort(array);

        for (int j : array) {
            System.out.println(j);
        }

        for(int i = 1; i<array.size(); i++) {
            if(array.get(i) > array.get(i-1)){
                System.out.println(true);
            }
            else System.out.println("Wrong algo" + "\n");
        }
    }
}
