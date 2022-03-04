import Factory.AbstractFactory.Factory;
import Factory.Utils.Print;
import Factory.Utils.XMLUtil;
import org.junit.Test;

public class Client {
    @Test
    public void test1(){
        Factory factory = (Factory) XMLUtil.getShapeType();//得到具体工厂实例
        Print p = new Print();
        factory.DrawShape(p.getGraph());
        try {
            Thread.sleep(2000); //休眠4s后擦去图像
            factory.EraseShape(p.getGraph());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
