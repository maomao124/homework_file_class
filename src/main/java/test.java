import java.io.IOException;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:55
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        System.out.println("t1:");
        try
        {
            t1.Test.main(null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("t2:");
        try
        {
            t2.Test.main(null);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("t3:");
        t3.Test.main(null);
        System.out.println();
        System.out.println("t4:");
        t4.Test.main(null);
    }
}
