package Factory.ConcreteProduct;

import Factory.DAO.Product;

import java.awt.*;

public class Rectangle extends Product {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(){
        System.out.println("创建矩形");
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
        System.out.printf("%s,%s,%s,%s\n",x,y,width,height);
    }

    @Override
    public void draw(Graphics g) {
        if(g!=null)  System.out.println("绘制矩形");
        g.setColor(Color.blue);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
    }

    @Override
    public void erase(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
        System.out.println("擦除矩形");
    }
}
