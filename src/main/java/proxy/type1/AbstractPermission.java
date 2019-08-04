package proxy.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:37
 */
public interface AbstractPermission {

    public void modifyUserInfo();
    public void viewNote();
    public void publishNote();
    public void modifyNote();
    public void setLevel(int level);
}
