package java.strategy.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:40
 */
public class BubbleSort implements Sort
{
    public int[] sort(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                int temp;
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("冒泡排序");
        return arr;
    }
}
