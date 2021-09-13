package com.formatta.rc.mathapi.service;

import java.util.LinkedList;
import java.util.List;

//Imports:
import org.springframework.stereotype.Service;

@Service
public class MathService {
    //Attributes:
   
    //Methods:
    /** 
     * Given a value n, it determines recursively and returns the n-th 
     * value of the Fibonacci sequence calculated by the following formula.
     * 
     * F[n] = F[n - 1] + F[n - 2].
     * 
     * @param n The n value. It must be greater than zero (n > 0).
     * @return The n-th value of the Fibonacci sequence.
     */
    public int getNFibonacci(int n) {
        switch(n) {
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return getNFibonacci(n - 1) + getNFibonacci(n - 2);
        }
    }

     /** 
     * Given a value n, it determines and returns a list of the first n-th 
     * elements of the Fibonacci sequence calculated by the following formula.
     * 
     * F[n] = F[n - 1] + F[n - 2].
     * 
     * @param n The n value. It must be greater than zero (n > 0).
     * @return A list of the first n-th elements of the Fibonacci sequence. 
     */
    public List<Integer> getAllFibonacci(int n) {
        //Variables:
        int n1 = 0;
        int n2 = 1;
        int n3;

        //Objects:
        List<Integer> fibonacci = new LinkedList<>();

        switch(n) {
            case 1:
                fibonacci.add(n1);
            case 2:
                fibonacci.add(n1);
                fibonacci.add(n2);
            default:
                fibonacci.add(n1);
                fibonacci.add(n2);

                for(int i = 2; i < n; ++i) {   
                    n3 = n1 + n2;    
                    fibonacci.add(n3);
                    n1 = n2;    
                    n2 = n3;    
                };
        }

        return fibonacci;
    }
}