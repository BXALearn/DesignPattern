package java.adapter.type1;

/**
 * Create by ������
 * 2019/8/8 11:09
 */
public class BirdAdapter extends Bird implements Robot
{
    public void cry()
    {
        System.out.print("������ģ�£�");
        super.tweedle();
    }

    public void move()
    {
        System.out.print("������ģ�£�");
        super.fly();
    }
}