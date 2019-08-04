package strategy.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:40
 * 策略模式客户端
 */
public class Client {
    public static void main(String args[])
    {
        int arr[]={1,4,6,2,5,3,7,10,9};
        int result[];
        ArrayHandler ah=new ArrayHandler();

        Sort sort;
        sort=(Sort)XMLUtil.getBean();

        ah.setSortObj(sort); //设置具体策略
        result=ah.sort(arr);

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + ",");
        }
    }
}