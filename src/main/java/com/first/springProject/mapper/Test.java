package com.first.springProject.mapper;

import java.util.ArrayList;
import java.util.Collections;

class InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int i2 = i + 1; i2 > 0; i2--) {
                if (dataList.get(i2) < dataList.get(i2 - 1)) {
                    Collections.swap(dataList, i2, i2 - 1);
                } else {
                    break;
                }
            }
        }
        return dataList;
    }
}

class Factorial {
    public int factorialFunc(int n) {
        if (n > 1) {
            return n * this.factorialFunc(n - 1);
        } else {
            return 1;
        }
    }
}

public class Test {
	public static void main(String[] args) {
		
		
	}
}


