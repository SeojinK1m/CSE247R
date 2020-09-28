import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        int lowR=0;
        int hiR= array.length-1;
        int lowC=0;
        int hiC=array[0].length-1;
        int target = 18;
        int correctRow=-1;

        while(hiR-lowR>=0){
            int medium = (hiR+lowR)/2;
            if(target>=array[medium][0] && target<=array[medium][hiC]){
                correctRow=medium;
                break;
            }else if(target<array[medium][0]){
                hiR=medium-1;
            }else if(target>array[medium][hiC]){
                lowR=medium+1;
            }
        }

        if(correctRow==-1){
            System.out.println("Not in array");
            System.exit(-1);
        }

        boolean found = false;
        while(hiC-lowC>=0){
            int medium = (hiC+lowC)/2;
            if(array[correctRow][medium]==target){
                found = true;
                break;
            }else if(target<array[correctRow][medium]){
                hiC=medium-1;
            }else{
                lowC=medium+1;
            }
        }

        System.out.println("Found: "+found);
    }
}