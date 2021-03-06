package com.clr.common;

public class ArrayUtil {

    public static  byte[] copyOf(byte[] original,int newLength){
        byte[] copy = new byte[newLength];
        System.arraycopy(original,0,copy,0,Math.min(original.length,newLength));;
        return  copy;
    }

    public static  byte[] copyOfRange(byte[] original,int from,int to){
        int newLength = to - from;
        if(newLength < 0){
            throw new IllegalArgumentException(from + ">" +to);
        }
        byte[] copy = new byte[newLength];
        System.arraycopy(original,from,copy,0,Math.min(original.length-from,newLength));
        return  copy;
    }

}
