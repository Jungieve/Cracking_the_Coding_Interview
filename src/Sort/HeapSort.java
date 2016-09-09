package Sort;

import java.util.Arrays;

/**
 * Created by ZihanCong on 16/9/9.
 */
public class HeapSort {
    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        hs.heapSort(new int[]{1,3,5,4,7,2,9});
    }
    public void heapSort(int[] data) {
        int arrayLength = data.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            //构建最大堆
            buildMaxHeap(data, arrayLength - i - 1);
            swap(data, 0, arrayLength - i - 1);
            System.out.println(Arrays.toString(data));
        }
    }

    public void buildMaxHeap(int[] data, int lastIndex) {
        //从lastIndexc处的父节点开始
        for (int i = (lastIndex - 1) / 2; i >=0 ; i--) {
            int k = i;
            while (k * 2 + 1 <= lastIndex) {
                int bigger = k * 2 + 1;
                //如果右节点较大,bigger引用总是指向较大的对象
                if (bigger  < lastIndex && data[bigger] < data[bigger + 1])
                    bigger++;
                if(data[k] < data[bigger]){
                    swap(data,k,bigger);
                    //开始遍历下层的k
                    k = bigger;
                }
                else
                    break;
            }
        }
    }

    public void swap(int[] data, int begin, int end) {
        int temp = data[begin];
        data[begin] = data[end];
        data[end] = temp;
    }
}
