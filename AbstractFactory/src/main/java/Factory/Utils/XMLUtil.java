package Factory.Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    private static Document doc = null;
    public static void init(){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            doc = builder.parse(new File("src//main//resources//config.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object getShapeType() {
        if(doc == null) init();
        try{
            //获取文本结点
            NodeList nl = doc.getElementsByTagName("shapeType");
            Node classNode = nl.item(0).getFirstChild();
            String shapeType = classNode.getNodeValue().trim();
            //创建实例
            Class c = Class.forName(shapeType);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int[] getRoundData(){
        try{
            //获取文本结点
            NodeList nl = doc.getElementsByTagName("RoundData");
            int[] data = new int[3];
            Node node = null;
            for(int i=0; i<nl.getLength(); i++){
                node = nl.item(i).getFirstChild();
                data[i] = Integer.parseInt(node.getNodeValue());
            }
            return data;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int[] getRectangleData(){
        try{
            //获取文本结点
            NodeList nl = doc.getElementsByTagName("RectangleData");
            int[] data = new int[4];
            Node node = null;
            for(int i=0; i<nl.getLength(); i++){
                node = nl.item(i).getFirstChild();
                data[i] = Integer.parseInt(node.getNodeValue());
            }
            return data;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int[] getTriangleData(){
        try{
            //获取文本结点
            NodeList nl = doc.getElementsByTagName("TriangleData");
            int[] data = new int[6];
            Node node = null;
            for(int i=0; i<nl.getLength(); i++){
                node = nl.item(i).getFirstChild();
                data[i] = Integer.parseInt(node.getNodeValue());
            }
            return data;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
