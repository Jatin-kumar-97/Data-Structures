package com.company;

public class Main {

    public static void main(String[] args) {

            // write your code here
            int[] dBase = new int[7];
            int num=0;
            dBase[0] = 20;
            dBase[1] = -15;
            dBase[2] = 7;
            dBase[3] = 35;
            dBase[4] = 1;
            dBase[5] = -22;
            dBase[6] = 55;

            //System.out.print(dBase.length);

            for(int lastIndex = dBase.length-1;lastIndex>0;lastIndex--){
                for(int i=0;i<lastIndex;i++)
                    if (dBase[i] > dBase[i + 1]) {
                        swap(dBase,i,i+1);
                    }
            }

            for(int i=0;i<dBase.length;i++){
                System.out.println(dBase[i]);
            }
  }

    public static void swap(int[] array,int i, int j) {
            if(i==j){
                return;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }
