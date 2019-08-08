package java.bridge;

/**
 * Create by °ÚÐÀ°²
 * 2019/8/8 11:17
 */
public abstract class Pen
{
    protected Color color;
    public void setColor(Color color)
    {
        this.color=color;
    }
    public abstract void draw(String name);
}