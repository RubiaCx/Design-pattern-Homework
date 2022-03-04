package Factory.AbstractFactory;

import Factory.AbstractProduct.Rectangle;
import Factory.AbstractProduct.Round;
import Factory.AbstractProduct.Triangle;
import java.awt.*;

/**
 ** 抽象工厂
 **/
public abstract class Factory {
    public abstract Round DrawRound();
    public abstract Rectangle DrawRectangle();
    public abstract Triangle DrawTriangle();
    public abstract void DrawShape(Graphics g);
    public abstract void EraseShape(Graphics g);
}
