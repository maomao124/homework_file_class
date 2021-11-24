package t3;

import java.io.File;
import java.util.Arrays;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): PACKAGE_NAME
 * Class(类名): t3.Task
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Task
{
    /********** Begin **********/
    public void showDirStructure(File file)
    {
        System.out.println("+--" + file.getName());
        showDirTree(file, " ");
    }

    public static void showDirTree(File dir, String interval)
    {
        File[] files = dir.listFiles();
        Arrays.sort(files);
        interval += " ";

        for (File file : files)
        {
            if (!file.isDirectory())
            {
                System.out.println(interval + "--" + file.getName());
            }
            else
            {
                System.out.println(interval + "+--" + file.getName());
                showDirTree(file, interval + " ");
            }
        }
    }
    /********** End **********/
}
