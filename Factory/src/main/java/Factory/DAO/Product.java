package Factory.DAO;
import java.awt.Graphics;
/**
 ** 抽象产品
 **/
public abstract class Product {
    public abstract void setData(int []data);
    public abstract void draw(Graphics g);          //绘制
    public abstract void erase(Graphics g);         //擦除
}

//Graphics类可以理解就是画笔，为我们提供了各种绘制图形的方法：
//1、画直线 drawLine(int x1, int y1, int x2, int y2);
//2、画矩形边框 drawRect(int x, int y, int width, int height);
//3、画椭圆边框 drawOval(int x, int y, int width, int height);
//4、填充矩形 fillRect(int x, int y, int width, int height);
//5、填充椭圆 fillOval(int x, int y, int width, int height);
//6、画图片 drawImage(Image img, int x, int y,…);
//7、画字符串 drawString(String str, int x, int y);
//8、设置画笔的字体 setFont(Font font);
//9、设置画笔的颜色 setColor(Color c);
