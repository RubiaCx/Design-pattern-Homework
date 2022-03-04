package Factory.ConcreteFactory;

import Factory.ConcreteProduct.Line;
import Factory.DAO.Factory;
import Factory.DAO.Product;
import Factory.Utils.XMLUtil;

public class LineFactory extends Factory {

    @Override
    public Product DrawShape(){
        Line product = new Line();
        int[]data = XMLUtil.getShapeData();
        product.setData(data);
        return product;
    }
}
