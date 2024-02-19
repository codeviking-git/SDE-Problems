package Sorting;

import java.util.ArrayList;

public class SelectionSort {

    public int small(int p, int q, ArrayList<Integer> array){
        int smallest = Integer.MAX_VALUE;
        int smallIndex = 0;

        for(int i = p; i<=q; i++) {
            if(array.get(i) < smallest) {
                smallest = array.get(i);
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> array) {
        for(int i = 0; i<array.size(); i++) {
            swap(i, small(i, array.size() - 1, array), array);
        }

        return array;
    }

    private void swap(int i, int j, ArrayList<Integer> array) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
        return;
    }
}
