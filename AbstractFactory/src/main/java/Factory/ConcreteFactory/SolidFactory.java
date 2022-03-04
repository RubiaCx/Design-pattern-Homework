package Factory.ConcreteFactory;
import Factory.AbstractFactory.Factory;
import Factory.AbstractProduct.Rectangle;
import Factory.AbstractProduct.Round;
import Factory.AbstractProduct.Triangle;
import Factory.ConcreteProduct.SolidRectangle;
import Factory.ConcreteProduct.SolidRound;
import Factory.ConcreteProduct.SolidTriangle;
import Factory.Utils.XMLUtil;

import java.awt.*;

public class SolidFactory extends Factory {

    private SolidRound rd;
    private SolidRectangle rt;
    private SolidTriangle tg;

    @Override
    public Round DrawRound() {
        rd =new SolidRound();
        int[]data = XMLUtil.getRoundData();
        rd.setData(data);
        return rd;
    }

    @Override
    public Rectangle DrawRectangle() {
        rt =new SolidRectangle();
        int[]data = XMLUtil.getRectangleData();
        rt.setData(data);
        return rt;
    }

    @Override
    public Triangle DrawTriangle() {
        tg = new SolidTriangle();
        int[]data = XMLUtil.getTriangleData();
        tg.setData(data);
        return tg;
    }

    @Override
    public void DrawShape(Graphics g) {
        DrawRound();
        DrawRectangle();
        DrawTriangle();
        rd.draw(g);
        rt.draw(g);
        tg.draw(g);
        System.out.println("绘制实心图形");
    }

    @Override
    public void EraseShape(Graphics g) {
        DrawRound();
        DrawRectangle();
        DrawTriangle();
        rd.erase(g);
        rt.erase(g);
        tg.erase(g);
        System.out.println("擦除实心图形");
    }
}