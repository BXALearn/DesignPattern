package factory.simplefactory;

public class Client
{
	public static void main(String args[])
	{
         try
         {
         	Phone phone;
         	// 从配置文件获取手机名称
         	String brandName= XMLUtil.getBrandName();
			 // 从工厂返回实例化的对象
         	phone = PhoneFactory.produceTV(brandName);
         	phone.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
