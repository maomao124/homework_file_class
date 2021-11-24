package t1;

import java.io.File;
import java.io.IOException;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): t1
 * Class(类名): t3.Task
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:21
 * Version(版本): 1.0
 * Description(描述)：
 * 在src/output目录下创建hello.txt，test.txt文件。
 * 需要先创建test.txt，后创建hello.txt。
 */

public class Task
{
    /********* Begin *********/
    public void solution()
    {
        File file1=new File("src/output/hello.txt");
        try
        {
            file1.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        File file2=new File("src/output/test.txt");
        try
        {
            file2.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        /********* End *********/
    }
}
