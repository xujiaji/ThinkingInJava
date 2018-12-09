package com.xujiaji.thingking._15;

public class BinarySearch
{
    public static int search(int[] arr, int item)
    {
        int low = 0;
        int high = arr.length;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] == item)
            {
                return mid;
            } else if (arr[mid] > item)
            {
                high = mid - 1;
            } else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 5, 7, 9};
        System.out.println(search(arr,  3));
        System.out.println(search(arr, -1));
    }
}
