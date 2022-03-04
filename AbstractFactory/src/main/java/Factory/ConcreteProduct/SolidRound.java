package Factory.ConcreteProduct;

import Factory.AbstractProduct.Round;

import java.awt.*;

public class SolidRound extends Round {
    public SolidRound(){
        System.out.println("创建实心圆");
    };

    @Override
    public void setData(int []data){
        if(data.length!=3){
            System.out.println("UnsupportedShapeException");
            return;
        }
        this.x=data[0];
        this.y=data[1];
        this.r=data[2];
    }
    @Override
    public void draw(Graphics g) {
        if(g!=null)  System.out.println("绘制实心圆");
        g.setColor(Color.blue);
        g.drawOval(x, y, r, r);
        g.fillOval(x, y, r, r);
    }
    @Override
    public void erase(Graphics g) {
        g.setColor(Color.white);
        g.drawOval(x, y, r, r);
        g.fillOval(x, y, r, r);
        System.out.println("擦除实心圆");
    }
}
