package java.prototype.type1;

/**
 * Create by ������
 * 2019/8/8 10:53
 */
public class Email implements Cloneable
{
    private Attachment attachment=null;

    public Email()
    {
        this.attachment=new Attachment();
    }

    public Object clone()
    {
        Email clone=null;
        try
        {
            clone=(Email)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("Clone failure!");
        }
        return clone;
    }

    public Attachment getAttachment()
    {
        return this.attachment;
    }

    public void display()
    {
        System.out.println("�鿴�ʼ�");
    }

}