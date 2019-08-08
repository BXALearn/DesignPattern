package java.templatemethod.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:55
 * 模板方法客户端
 */
public class Client {

    public static void main(String a[])
    {
        BankTemplateMethod bank;
        bank=(BankTemplateMethod)XMLUtil.getBean();
        bank.process();
        System.out.println("---------------------------------------");
    }
}
