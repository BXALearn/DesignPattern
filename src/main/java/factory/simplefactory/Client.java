package factory.simplefactory;

public class Client
{
	public static void main(String args[])
	{
         try
         {
         	Phone phone;
         	// �������ļ���ȡ�ֻ�����
         	String brandName= XMLUtil.getBrandName();
			 // �ӹ�������ʵ�����Ķ���
         	phone = PhoneFactory.produceTV(brandName);
         	phone.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
