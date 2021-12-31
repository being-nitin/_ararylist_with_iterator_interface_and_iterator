package com.codechef;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) {
	/*
	Use of iterator interface in arraylist to proceed iteration :
	 */
        Scanner sc = new Scanner(System.in);
    ArrayList <String> s1 = new ArrayList<>(5);
    for(int i=0;i<3;i++){
        s1.add(sc.next());
    }
    Iterator itr = s1.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}
// iterator interface has three methods
