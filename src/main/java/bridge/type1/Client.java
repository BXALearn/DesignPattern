package bridge.type1;

/**
 * Create by ������
 * 2019/8/8 11:16
 */
public class Client {

    public static void main(String a[])
    {
        Color color;
        Pen pen;

        color=(Color)XMLUtilPen.getBean("color");
        pen=(Pen)XMLUtilPen.getBean("pen");

        pen.setColor(color);
        pen.draw("�ʻ�");
    }
}
