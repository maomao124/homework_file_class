package t4;

import java.io.File;
import java.util.Scanner;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): t4
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Task task = new Task();
        Scanner sc = new Scanner(System.in);
        String dir = sc.next();
        File file = new File(dir);
        task.showDirStructure(file);
    }
}
