package java.strategy.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:39
 */
public class ArrayHandler
{
    private Sort sortObj;

    public int[] sort(int arr[])
    {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }
}
