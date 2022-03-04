package Factory.Service;
import Factory.DAO.Product;

import java.awt.Color;
import java.awt.Graphics;

public class Round extends Product {
    private int x;
    private int y;
    private int r;

    public Round(){
        System.out.println("创建圆");
    };

    @Override
    public void setData(int []data){
        if(data.length!=3){
            System.out.println("UnsupportedShapeException");
        }
        this.x=data[0];
        this.y=data[1];
        this.r=data[2];
    }

    @Override
    public void draw(Graphics g) {
        if(g!=null)  System.out.println("绘制圆");
        g.setColor(Color.blue);
        g.drawOval(x, y, r, r);
        g.fillOval(x, y, r, r);
    }

    @Override
    public void erase(Graphics g) {
        g.setColor(Color.white);
        g.drawOval(x, y, r, r);
        g.fillOval(x, y, r, r);
        System.out.println("擦除圆");
    }
}
