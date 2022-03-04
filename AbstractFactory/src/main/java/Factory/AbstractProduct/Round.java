package Factory.AbstractProduct;

import java.awt.*;
public abstract class Round {
    protected int x;
    protected int y;
    protected int r;
    public abstract void setData(int []data);
    public abstract void draw(Graphics g);          //绘制
    public abstract void erase(Graphics g);         //擦除
}