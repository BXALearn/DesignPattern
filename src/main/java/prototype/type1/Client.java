package java.prototype.type1;

/**
 * Create by ������
 * 2019/8/8 10:09
 * ����һ-ǳ���Ƶ�ԭ��ģʽ
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
