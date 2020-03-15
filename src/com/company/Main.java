package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int temp=0;
        int[] arr = {20,35,-15,7,55,1,-22};
        for(int i=arr.length-1;i>0;i--){

            for(int j=1;j<=i;j++){
                if(arr[j]>arr[temp]){
                    temp = j;

                }

            }
            swap(arr,temp,i);

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }




    }

    public static void swap(int[] array,int i,int j) {
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
