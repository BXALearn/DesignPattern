package java.prototype.type1;

/**
 * Create by 摆欣安
 * 2019/8/8 10:09
 * 类型一-浅复制的原型模式
 */
public class Client {

    public static void main(String a[])
    {
        Email email,copyEmail;

        email=new Email();

        copyEmail=(Email)email.clone();

        System.out.println("email==copyEmail?");
        System.out.println(email==copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }
}
