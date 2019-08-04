package factory.simplefactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Create by 摆欣安
 * 2019/8/4 10:45
 */
public class XMLUtil {

    //该方法用于从XML配置文件中提取品牌名称，并返回该品牌名称
    public static String getBrandName()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("DesignPattern.xml"));

            //获取包含品牌名称的文本节点
            NodeList nl = doc.getElementsByTagName("simpleFactory");
            Node classNode=nl.item(0).getFirstChild();
            String brandName=classNode.getNodeValue().trim();
            return brandName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

}
