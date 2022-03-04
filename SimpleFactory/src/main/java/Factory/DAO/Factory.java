package Factory.DAO;
import Factory.Utils.XMLUtil;

public class Factory {
    private Factory(){};
    public static Product DrawShape(){ // 静态工厂方法
        Product product = (Product) XMLUtil.getShapeType();
        int[]data = XMLUtil.getShapeData();
        product.setData(data);
        return product;
    }
}
