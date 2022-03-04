package Factory.AbstractProduct;

import java.awt.*;
public abstract class Rectangle {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    public abstract void setData(int []data);
    public abstract void draw(Graphics g);          //绘制
    public abstract void erase(Graphics g);         //擦除
}
