package Factory.ConcreteProduct;
import Factory.AbstractProduct.Rectangle;
import java.awt.*;

public class HollowRectangle extends Rectangle{
    public HollowRectangle(){
        System.out.println("创建空心矩形");
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
        if(g!=null)  System.out.println("绘制空心矩形");
        g.setColor(Color.blue);
        g.drawRect(x, y, width, height);
    }

    @Override
    public void erase(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(x, y, width, height);
        System.out.println("擦除空心矩形");
    }
}
