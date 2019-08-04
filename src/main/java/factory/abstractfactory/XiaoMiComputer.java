package factory.abstractfactory;

/**
 * Create by 摆欣安
 * 2019/8/4 11:04
 * 具体产品-小米笔记本
 */
public class XiaoMiComputer implements Computer
{
    public void starting() {
        System.out.println("小米笔记本开机中......");
    }
}

