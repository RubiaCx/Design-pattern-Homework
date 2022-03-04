package Factory.ConcreteFactory;


import Factory.ConcreteProduct.Rectangle;
import Factory.DAO.Factory;
import Factory.DAO.Product;
import Factory.Utils.XMLUtil;

public class RectangleFactory extends Factory {

    @Override
    public Product DrawShape(){
        Rectangle product = new Rectangle();
        int[]data = XMLUtil.getShapeData();
        product.setData(data);
        return product;
    }
}
