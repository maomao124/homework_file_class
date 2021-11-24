package t2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): t2
 * Class(类名): t3.Task
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:27
 * Version(版本): 1.0
 * Description(描述)：
 * 在src/下创建文件夹test2文件夹；
 * <p>
 * 删除src/output/下的test2.txt文件；
 * <p>
 * 在src/test2/目录下创建helloworld.txt文件和step2.txt文件；
 * <p>
 * 将src/output/目录和src/test2/目录下所有文件的文件名按升序排序并打印至控制台。
 * output目录结构为：
 * a.txt
 * b.txt
 * c.txt
 * hello.txt
 * test.txt
 * test2目录结构为：
 * helloworld.txt
 * step2.txt
 */

public class Task
{
    public static void dcFile() throws IOException
    {
        /********* Begin *********/
        File file = new File("src/test2");
        file.mkdirs();
        File file1 = new File("src/output/test2.txt");
        file1.delete();
        File file3 = new File("src/test2/helloworld.txt");
        try
        {
            file3.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        File file2 = new File("src/test2/step2.txt");
        try
        {
            file2.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        System.out.println("output目录结构为：");
        File dir = new File("src/output/");
        File[] files = dir.listFiles();
        String[] file5 = new String[files.length];

        for (int i = 0; i < files.length; i++)
        {
            file5[i] = files[i].getName();
        }
        Arrays.sort(file5);
        for (String s : file5)
        {
            System.out.println(s);
        }


        System.out.println("test2目录结构为：");
        File dir1 = new File("src/test2/");
        File[] files1 = dir1.listFiles();
        String[] file51 = new String[files1.length];

        for (int i = 0; i < files1.length; i++)
        {
            file51[i] = files1[i].getName();
        }
        Arrays.sort(file51);
        for (String s : file51)
        {
            System.out.println(s);
        }

        /********* End *********/
    }
}
