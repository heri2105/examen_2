/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_2;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
class Solution {
    private static long N;
    private static long A;
    private static long B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           N = sc.nextInt();
        for (long i = 0; i < N; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            ArrayList<Integer> houses = new ArrayList<Integer>();
            for (long j = 0; j < A; j++) {
            houses.add(sc.nextInt());
            }
            long no_of_houses = findTheHouses(houses,B);
            System.out.println("Case #"+ (i+1) +": "+no_of_houses);

        }

        sc.close();
    }

    private static long findTheHouses(ArrayList<Integer> houses, long max_cost) {
        Collections.sort(houses);
        long count_budget =0;
        int houses_count=0;
        do{
                count_budget = count_budget +houses.get(houses_count);
            if(count_budget<=max_cost)
                houses_count++;
                else
                break;
        }while(houses.size()>houses_count);
        
    return houses_count;    
    }
}
