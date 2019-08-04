package proxy.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:37
 */
public class PermissionProxy implements AbstractPermission
{
    private RealPermission permission=new RealPermission();
    private int level=0;

    public void modifyUserInfo()
    {
        if(0==level)
        {
            System.out.println("对不起，你没有该权限!");
        }
        else if(1==level)
        {
            permission.modifyUserInfo();
        }
    }

    public void viewNote()
    {
        permission.viewNote();
    }

    public void publishNote()
    {
        if(0==level)
        {
            System.out.println("对不起，你没有该权限!");
        }
        else if(1==level)
        {
            permission.publishNote();
        }
    }

    public void modifyNote()
    {
        if(0==level)
        {
            System.out.println("对不起，你没有该权限!");
        }
        else if(1==level)
        {
            permission.modifyNote();
        }
    }

    public void setLevel(int level)
    {
        this.level=level;
    }
}
