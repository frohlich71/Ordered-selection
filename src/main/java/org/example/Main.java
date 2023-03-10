package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();

        int[] numbers = {3, 1, 2, 4};

        System.out.println(solution.order(numbers));
    }
}

class Solution {

    public ArrayList<Integer> order (int[] numbers) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int number : numbers) {
            temp.add(number);
        }

       for (int i = 0; i < numbers.length; i++) {
           int smaller = findSmallerIndex(temp);

           ans.add(temp.get(smaller));
           temp.remove(smaller);
       }

        return ans;
    }

    public int findSmallerIndex (ArrayList<Integer> numbers) {
         int smaller = numbers.get(0);
         int smaller_idx = 0;

         for (int i = 0; i < numbers.size(); i++) {
             if (numbers.get(i) < smaller) {
                 smaller = numbers.get(i);
                 smaller_idx = i;
             }
         }
         return smaller_idx;
    }

}