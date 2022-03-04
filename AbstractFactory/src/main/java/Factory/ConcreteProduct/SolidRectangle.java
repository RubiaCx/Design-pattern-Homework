package Factory.ConcreteProduct;

import Factory.AbstractProduct.Rectangle;

import java.awt.*;

public class SolidRectangle extends Rectangle{
    public SolidRectangle(){
        System.out.println("创建实心矩形");
    };

    @Override
    public void setData(int []data){
        System.out.println("获取矩形数据");
        if(data.length!=4){
            System.out.println("UnsupportedShapeException");
        }
        this.x=data[0];
        this.y=data[1];
        this.width=data[2];
        this.height=data[3];
    }

    @Override
    public void draw(Graphics g) {
        if(g!=null)  System.out.println("绘制实心矩形");
        g.setColor(Color.blue);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
    }

    @Override
    public void erase(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
        System.out.println("擦除实心矩形");
    }
}
