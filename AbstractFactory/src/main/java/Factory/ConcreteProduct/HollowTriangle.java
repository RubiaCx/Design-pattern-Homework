package Factory.ConcreteProduct;

import Factory.AbstractProduct.Triangle;

import java.awt.*;

public class HollowTriangle extends Triangle {
    public HollowTriangle(){
        System.out.println("创建空心三角形");
    };

    @Override
    public void setData(int []data){
        if(data.length!=6){
            System.out.println("UnsupportedShapeException");
            return;
        }
        this.x1=data[0];
        this.y1=data[1];
        this.x2=data[2];
        this.y2=data[3];
        this.x3=data[4];
        this.y3=data[5];
    }

    @Override
    public void draw(Graphics g) {
        if(g!=null)  System.out.println("绘制空心三角形");
        Polygon triangle=new Polygon();
        g.setColor(Color.blue);
        triangle.addPoint(x1,y1);
        triangle.addPoint(x2,y2);
        triangle.addPoint(x3,y3);
        g.drawPolygon(triangle); // 绘制由指定的 Polygon 对象定义的多边形边框。
    }
    @Override
    public void erase(Graphics g) {
        Polygon triangle=new Polygon();
        g.setColor(Color.white);
        triangle.addPoint(x1,y1);
        triangle.addPoint(x2,y2);
        triangle.addPoint(x3,y3);
        g.drawPolygon(triangle); // 绘制由指定的 Polygon 对象定义的多边形边框。
        System.out.println("擦除空心三角形");
    }
}
