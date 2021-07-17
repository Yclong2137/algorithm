package com.ycl.test.sort;

import java.util.Arrays;

/**
 * 排序算法学习
 */
public class SortTest {


    public static void main(String[] args) {

         int[] a={4,5,7,3,2,1,6};

        System.out.println("原始数组："+Arrays.toString(a));

        //冒泡排序
         bubbleSort(a,a.length);

         
        System.out.println("排序后数组："+ Arrays.toString(a));
        
        
       

    }

    

    /**
     * 冒泡排序（比较和交换）
     * 原地
     * 稳定（具体和实现有关）
     * 时间复杂度 最好O(n)  最坏O(n*n)
     * 空间复杂度 O(1)
     * 有序度
     * 逆序度=满有序度-有序度
     * @param a
     * @param n
     *
     */
     static  void bubbleSort(int[] a,int n){
        if (n<=1)return;
         for (int i = 0; i < n; i++) {//第几次冒泡
             boolean flag=false;//提前退出冒泡的标志位
             for (int j = 0; j < n -i- 1; j++) {
                 //交换相邻的两个元素（稳定的）
                 if (a[j]>a[j+1]){
                     int tmp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=tmp;
                     flag=true;
                 }
             }
             //如果没有数据交换，提前退出
             if (!flag)break;
         }
     }

}
