package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class SeventhDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    //title:abstract
    fastLog("折半查找:");


    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};


    int index = harlf_search(array, 3);

    //	print_arr(array);
    fastLog("需要查找数的下标为:"+index);

  }
  public int harlf_search(int[]arr,int target)
  {
    int max = arr.length - 1;
    int min = 0;
    int mid = (max + min)/2;



    while (max > min)
    {

      if(arr[min] == target)
        return min;
      if(arr[max] == target)
        return max;

      if(arr[mid] < target)
        min = mid + 1;
      else if(arr[mid] > target)
        max = mid - 1;
      else
        return mid;

      mid = (max + min) >>1;
    }

    return -1;
  }
}
