package com.corejavaproject.dsa;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n/2;i<=n;i++){
            System.out.println(i);
        }
        for(int i=n/2;i>=1;i--){
            System.out.println(i);
        }
    }

}
