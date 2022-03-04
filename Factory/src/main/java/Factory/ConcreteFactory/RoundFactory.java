package Factory.ConcreteFactory;


import Factory.ConcreteProduct.Round;
import Factory.DAO.Factory;
import Factory.DAO.Product;
import Factory.Utils.XMLUtil;

public class RoundFactory extends Factory {

    @Override
    public Product DrawShape(){
        Round product = new Round();
        int[]data = XMLUtil.getShapeData();
        product.setData(data);
        return product;
    }
}
