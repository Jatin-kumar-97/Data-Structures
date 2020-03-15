package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = {20,35,-15,7,55,1,-22};

        //int temp = intArray[0];
        for (int i=1;i<intArray.length;i++){
            int j;
            int temp = intArray[i];
            for (j = i; j > 0 && intArray[j - 1] > temp;j--){
                intArray[j]  = intArray[j-1];
            }
            intArray[j] = temp;
        }




        for (int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}
