package java.factory.abstractfactory;

/**
 * Create by 摆欣安
 * 2019/8/4 11:03
 * 具体产品-华为笔记本
 */
public class HuaWeiComputer implements Computer
{
    public void starting() {
        System.out.println("华为笔记本开机中......");
    }
}
