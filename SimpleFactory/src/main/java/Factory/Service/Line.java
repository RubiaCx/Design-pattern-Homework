package Factory.Service;
import Factory.DAO.Product;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Product {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(){
        System.out.println("创建线");
    };

    @Override
    public void setData(int []data){
        if(data.length!=4){
            System.out.println("UnsupportedShapeException");
        }
        this.x1=data[0];
        this.y1=data[1];
        this.x2=data[2];
        this.y2=data[3];
    }

    @Override
    public void draw(Graphics g) {
        if(g!=null)  System.out.println("绘制线");
        g.setColor(Color.blue);
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void erase(Graphics g) {
        g.setColor(Color.white);
        g.drawLine(x1, y1, x2, y2);
        System.out.println("擦除线");
    }
}
