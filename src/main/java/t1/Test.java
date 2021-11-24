package t1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    static final List<String> strings = new ArrayList<String>()
    {{
        add("a.txt");
        add("b.txt");
        add("c.txt");
        add("test2.txt");
    }};

    public static void main(String[] args) throws Exception
    {
        String path = "src/output";
        File files = new File(path);
        if (!files.exists())
        {
            files.mkdirs();
        }

        for (String file : strings)
        {
            if (!Arrays.asList(files.list()).contains(file))
            {
                File files1 = new File(path + "/" + file);
                files1.mkdirs();
            }
        }

        files.listFiles(new FileFilter()
        {

            @Override
            public boolean accept(File pathname)
            {

                if (!strings.contains(pathname.getName()))
                {
                    pathname.delete();
                }
                return true;
            }
        });

        Task task = new Task();

        task.solution();

        File file1 = new File("src/output/hello.txt");
        File file2 = new File("src/output/test.txt");
        if (file1.exists())
        {
            System.out.println("hello.txt文件创建成功");
        }
        if (file2.exists())
        {
            System.out.println("test.txt文件创建成功");
        }
    }

}
