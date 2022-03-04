package Factory.ConcreteProduct;

import Factory.DAO.Product;

import java.awt.*;

public class Dot extends Product {
    private int x;
    private int y;

    public Dot(){
        System.out.println("创建点");
    };

    @Override
    public void setData(int []data){
        if(data.length!=2){
            System.out.println("UnsupportedShapeException");
        }
        this.x=data[0];
        this.y=data[1];
    }

    @Override
    public void draw(Graphics g) {
        if(g!=null)  System.out.println("绘制点");
        g.setColor(Color.blue);
        g.drawOval(x, y, 5, 5);
        g.fillOval(x, y, 5, 5);
    }

    @Override
    public void erase(Graphics g) {
        g.setColor(Color.white);
        g.drawOval(x, y, 5, 5);
        g.fillOval(x, y, 5, 5);
        System.out.println("擦除点");
    }
}
