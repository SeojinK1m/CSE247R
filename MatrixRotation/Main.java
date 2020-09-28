package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {1,2,9},
                {3,1,7},
                {4,5,3}
        };

        for(int i=0,j= array.length-1; i<array.length/2; i++,j--){
            array = swap(array, i, j);
        }

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                array = diagonallyMirror(array, i, j);
            }
        }

        for(int i=0; i<array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }

    }
    public static int[][] swap(int[][] array, int index1, int index2){
        int[] placeHolder = array[index1];
        array[index1]=array[index2];
        array[index2]=placeHolder;
        return array;
    }
    public static int[][] diagonallyMirror(int[][] array, int i, int j){
        int p = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = p;
        return array;
    }
}
