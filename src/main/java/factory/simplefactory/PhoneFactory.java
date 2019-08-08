package java.factory.simplefactory;

/**
 * Create by 摆欣安
 * 2019/8/4 10:43
 * 产品工厂
 */
public class PhoneFactory {

    public static Phone produceTV(String brand) throws Exception
    {
        if(brand.equalsIgnoreCase("HuaWei"))
        {
            System.out.println("手机工厂生产华为手机！");
            return new HuaWeiPhone();
        }
        else if(brand.equalsIgnoreCase("XiaoMi"))
        {
            System.out.println("手机工厂生产小米手机！");
            return new XiaoMiPhone();
        }
        else
        {
            throw new Exception("对不起，暂不能生产该品牌手机！");
        }
    }

}
