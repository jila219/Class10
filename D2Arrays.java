package class10;

import java.util.Arrays;
import java.util.Scanner;

public class D2Arrays {
    public static void main(String[] args) {
        String[][]thomasTrain=new String[3][3];
        String[] cabin0= {"Adam","zafar","sam"};
        String[] cabin1= {"nabi","saud","anees"};
        String[] cabin2= {"safi","abeera","zahra"};
        thomasTrain[0]=cabin0;
        thomasTrain[1]=cabin1;
        thomasTrain[2]=cabin2;
        //in the first [] we specify the address of 1 d ARRAY
        System.out.println(thomasTrain[2][1]);
        System.out.println(Arrays.toString(thomasTrain[0]));
































    }
}
