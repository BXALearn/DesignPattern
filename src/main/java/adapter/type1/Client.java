package java.adapter.type1;

/**
 * Create by ������
 * 2019/8/8 11:04
 * ����һ������ģʽ
 */
public class Client {

    public static void main(String args[])
    {
        Robot robot=(Robot)XMLUtil.getBean();
        robot.cry();
        robot.move();
    }

}
