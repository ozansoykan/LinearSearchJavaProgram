package com.company;

public class Main {

    public static void main(String[] args) {
	    int number = 4;
	    int[] numbers = {1,2,3,4,5,6,7,8};
	    int size = numbers.length;
        System.out.println("index of number : "+linearSearch(number,size,numbers));
    }
    static int linearSearch(int number , int size , int[] numbers){
        for (int i=0;i<size;i++){
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
