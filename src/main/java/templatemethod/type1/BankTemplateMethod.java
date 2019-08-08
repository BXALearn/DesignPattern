package java.templatemethod.type1;

/**
 * Create by 摆欣安
 * 2019/8/4 17:56
 */
public abstract class BankTemplateMethod
{
    public void takeNumber()
    {
        System.out.println("取号排队。");
    }

    public abstract void transact();

    public void evaluate()
    {
        System.out.println("反馈评分。");
    }

    public void process()
    {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
