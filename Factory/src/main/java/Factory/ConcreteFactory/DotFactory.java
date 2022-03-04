package Factory.ConcreteFactory;

import Factory.ConcreteProduct.Dot;
import Factory.DAO.Factory;
import Factory.DAO.Product;
import Factory.Utils.XMLUtil;

public class DotFactory extends Factory {
    @Override
    public Product DrawShape(){
        Dot product = new Dot();
        int[]data = XMLUtil.getShapeData();
        product.setData(data);
        return product;
    }
}
