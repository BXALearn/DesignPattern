package java.adapter.type1;

/**
 * Create by ������
 * 2019/8/8 11:10
 */
public class DogAdapter extends Dog implements Robot
{
    public void cry()
    {
        System.out.print("������ģ�£�");
        super.wang();
    }

    public void move()
    {
        System.out.print("������ģ�£�");
        super.run();
    }
}