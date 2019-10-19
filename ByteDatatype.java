package com.company;

import java.util.ArrayList;
import java.util.List;

public class ByteDatatype {

    public static void main(String[] args) {
	// write your code here
        byte x = 10;
        byte y = -10;

        System.out.println(255&x);
        System.out.println(255&y);
	System.out.println(~x+1);

        d2b(255&x);
        d2b(255&y);
	d2b(255&(~x+1));

    }

    //For 8 bit or 1 byte decimal
    public static void d2b(int x){
        int[] binary = {0,0,0,0,0,0,0,0};
        int index = 7;
        int remainder = 0;
        while (x>0){
            remainder = x%2;
            x = (x/2);
            binary[index] = remainder;
            index --;
        }

        for (int i =0 ; i< binary.length; i++){
            System.out.print(binary[i]);
        }
        System.out.println("");
    }
}
