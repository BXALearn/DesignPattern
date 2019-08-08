package java.bridge;

/**
 * Create by °ÚÐÀ°²
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
        pen.draw("ÏÊ»¨");
    }
}
