package java.adapter.type1;

/**
 * Create by 摆欣安
 * 2019/8/8 11:04
 * 类型一适配器模式
 */
public class Client {

    public static void main(String args[])
    {
        Robot robot=(Robot)XMLUtil.getBean();
        robot.cry();
        robot.move();
    }

}
