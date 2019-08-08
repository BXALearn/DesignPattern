package java.proxy.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:34
 * 代理模式客户端
 */
public class Client {

    public static void main(String args[])
    {
        AbstractPermission permission;
        permission=(AbstractPermission)XMLUtil.getBean();

        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
        System.out.println("----------------------------");
        permission.setLevel(1);
        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
    }
}
