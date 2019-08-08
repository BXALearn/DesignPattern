package java.prototype.type2;

/**
 * Create by 摆欣安
 * 2019/8/8 10:09
 * 类型二-深复制的原型模式
 */
public class Client {

    public static void main(String a[])
    {
        Email email,copyEmail=null;

        email=new Email();

        try{
            copyEmail=(Email)email.deepClone();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        System.out.println("email==copyEmail?");
        System.out.println(email==copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }

}
