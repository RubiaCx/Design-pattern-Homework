package Factory.AbstractProduct;

import java.awt.*;
public abstract class Triangle {
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected int x3;
    protected int y3;

    public abstract void setData(int []data);
    public abstract void draw(Graphics g);          //绘制
    public abstract void erase(Graphics g);         //擦除
}

