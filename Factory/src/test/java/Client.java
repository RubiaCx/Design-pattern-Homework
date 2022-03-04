import Factory.DAO.Factory;
import Factory.DAO.Product;
import Factory.Utils.Print;
import Factory.Utils.XMLUtil;
import org.junit.Test;

public class Client {
    @Test
    public void test1(){
        Factory factory = (Factory) XMLUtil.getShapeType();//得到具体工厂实例
        Product product = factory.DrawShape();//利用工厂生产产品
        Print p = new Print();
        product.draw(p.getGraph());
        try {
            Thread.sleep(4000); //休眠4s后擦去图像
            product.erase(p.getGraph());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
