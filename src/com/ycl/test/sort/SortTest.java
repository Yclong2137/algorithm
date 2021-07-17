package com.ycl.test.sort;

import java.util.Arrays;

/**
 * 排序算法学习
 */
public class SortTest {


    public static void main(String[] args) {

         int[] a={4,5,7,3,2,1,6,8,5,4,7,9,54,3,7,3,45,2,89};

        System.out.println("原始数组："+Arrays.toString(a));

        //冒泡排序
        bubbleSort(a,a.length);
        System.out.println("冒泡排序后数组："+ Arrays.toString(a));
        //插入排序
        insertionSort(a,a.length);
        System.out.println("插入排序后数组："+ Arrays.toString(a));
        //选择排序
        selectionSort(a,a.length);
        System.out.println("选择排序后数组："+ Arrays.toString(a));
         

        
       

    }

    

    /**
     * 冒泡排序
     *
     * 整个冒泡排序过程包含多躺冒泡排序。每一趟冒泡操作都会遍历整个数组，
     * 依次对数组中相邻元素进行比较，看是否满足大小关系要求，如果不满足，就将他们互换位置。
     * 一趟冒泡操作会至少让一个元素移动到它应该在的位置，重复n次，就完成n个数据的排序工作。
     *
     * 原地
     * 稳定（具体和实现有关）
     *
     * 有序度：冒泡排序过程中国有两个操作：比较和交换。因为冒泡排序只会交换相邻两个元素，
     * 所以，每进行依次交换，有序度就增加1、所以，冒泡排序执行过程中，总的交换次数是确定的，即为逆序度。
     *
     * 逆序度=满有序度-有序度
     *
     * 时间复杂度 最好O(n)  最坏O(n*n)
     * 空间复杂度 O(1)
     * 平均交换次数 k1=n*(n-1)/4
     * 平均比较次数 k2<n^2 && k2>k1
     * 平均时间复杂度 O(k1+k2)=O(n^2)
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

    /**
     * 插入排序
     *
     * 将数组中数据分为两个区间：已排序区间和未排序区间。
     * 初始已排序区间只有一个元素，就是数组中的第一个元素。
     * 插入算法核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，
     * 保证已排序区间数据一直有序
     * 重复这个过程，知道未排序区间元素为空，算法结束
     *
     * 稳定
     * 空间复杂度 O(1)
     * 时间复杂度 最好O(n) 最坏O(n^2)
     * 平均复杂度 O(n^2 )
     */
    static void insertionSort(int[] a,int n  ){
    if (n<=1)return;
        for (int i = 1; i < n; i++) {//[0,i)已排序
            int value=a[i];
            int j=i-1;
             for(;j>=0;--j){// 查找插入的位置
                 if (a[j]>value){
                     a[j+1]=a[j];// 数据移动
                 }else{
                     break;
                 }
             }
             a[j+1]=value;//插入数据
        }
     }

    /**
     *  选择排序
     *
     *  选择排序算法的实现思路类似插入排序，也将整个数组划分为已排序区间和
     *  未排序区间。但不同点在于：选择排序算法每次从未排序区间中，找到最小的元素，
     *  将其放到已排序区间的末尾。
     *
     *  空间复杂度 O(1)
     *  时间复杂度O(n^2)
     *  原地
     *  不稳定
     */
     static void selectionSort(int [] a,int n){
            if (n<=1)return;
         for (int i = 0; i < n - 1; i++) {// 循环n-1次
             int minPos=i;
             for (int j=i;j<n;j++){//查找min
                 if (a[j]<a[minPos]){
                     minPos=j;
                 }
             }
             //交换元素
             int tmp=a[i];
             a[i]=a[minPos];
             a[minPos]=tmp;
         }
     }

}
