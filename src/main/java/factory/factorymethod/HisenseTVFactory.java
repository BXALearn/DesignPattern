package factory.factorymethod;

/**
 * Create by ������
 * 2019/8/4 10:58
 */
public class HisenseTVFactory implements TVFactory{

    public TV produceTV()
    {
        System.out.println("���ŵ��ӻ������������ŵ��ӻ���");
        return new HisenseTV();
    }
}
