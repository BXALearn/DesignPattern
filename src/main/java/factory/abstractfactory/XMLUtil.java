package factory.abstractfactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Create by ������
 * 2019/8/4 11:05
 */
public class XMLUtil {

    //�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
    public static Object getBean()
    {
        try
        {
            //�����ĵ�����
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("Factoryconfig.xml"));

            //��ȡ�����������ı��ڵ�
            NodeList nl = doc.getElementsByTagName("abstractFactoryClassName");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //ͨ����������ʵ�����󲢽��䷵��
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
