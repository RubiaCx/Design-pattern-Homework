package Factory.ConcreteFactory;
import Factory.AbstractFactory.Factory;
import Factory.AbstractProduct.Rectangle;
import Factory.AbstractProduct.Round;
import Factory.AbstractProduct.Triangle;
import Factory.ConcreteProduct.HollowRectangle;
import Factory.ConcreteProduct.HollowRound;
import Factory.ConcreteProduct.HollowTriangle;
import Factory.Utils.XMLUtil;

import java.awt.*;

public class HollowFactory extends Factory {

    private HollowRound rd;
    private HollowRectangle rt;
    private HollowTriangle tg;

    @Override
    public Round DrawRound() {
        rd =new HollowRound();
        int[]data = XMLUtil.getRoundData();
        rd.setData(data);
        return rd;
    }

    @Override
    public Rectangle DrawRectangle() {
        rt =new HollowRectangle();
        int[]data = XMLUtil.getRectangleData();
        rt.setData(data);
        return rt;
    }

    @Override
    public Triangle DrawTriangle() {
        tg = new HollowTriangle();
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
        System.out.println("绘制空心图形");
    }

    @Override
    public void EraseShape(Graphics g) {
        DrawRound();
        DrawRectangle();
        DrawTriangle();
        rd.erase(g);
        rt.erase(g);
        tg.erase(g);
        System.out.println("擦除空心图形");
    }
}