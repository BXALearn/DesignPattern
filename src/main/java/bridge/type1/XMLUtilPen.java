package bridge.type1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Create by ������
 * 2019/8/8 11:22
 */
public class XMLUtilPen
{
    //�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
    public static Object getBean(String args)
    {
        try
        {
            //�����ĵ�����
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("BridgeconfigPen.xml"));
            NodeList nl=null;
            Node classNode=null;
            String cName=null;
            nl = doc.getElementsByTagName("className");

            if(args.equals("color"))
            {
                //��ȡ�����������ı��ڵ�
                classNode=nl.item(0).getFirstChild();

            }
            else if(args.equals("pen"))
            {
                //��ȡ�����������ı��ڵ�
                classNode=nl.item(1).getFirstChild();
            }

            cName=classNode.getNodeValue();
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
