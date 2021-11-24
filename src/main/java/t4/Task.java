package t4;

import java.io.File;
import java.util.Arrays;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): t4
 * Class(类名): Task
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Task
{
    /********** Begin **********/
    public void showDirStructure(File file)
    {
        if (file.isDirectory())
        {
            System.out.println("+--" + file.getName());
        }
        int a = 2;
        showDirTree(a, file);
    }

    public void showDirTree(int a, File file)
    {

        File[] files = file.listFiles();
        Arrays.sort(files);
        for (File value : files)
        {
            if (value.isDirectory())
            {
                for (int j = 0; j < a; j++)
                {
                    System.out.print(" ");
                }
                System.out.println("+--" + value.getName());
                showDirTree(a + 2, value);
            }
            else
            {
                String fileName = value.getName().toLowerCase();
                if (fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".bmp"))
                {
                    for (int j = 0; j < a; j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("--" + value.getName());
                }
            }
        }
    }
}
