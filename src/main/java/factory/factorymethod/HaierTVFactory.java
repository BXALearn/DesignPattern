package factory.factorymethod;

/**
 * Create by ������
 * 2019/8/4 10:57
 */
public class HaierTVFactory implements TVFactory{

    public TV produceTV()
    {
        System.out.println("�������ӻ����������������ӻ���");
        return new HaierTV();
    }
}
