package t2;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project name(项目名称)：作业_文件类
 * Package(包名): t2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:27
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
        add("hello.txt");
        add("test2.txt");
        add("test.txt");
    }};

    public static void main(String[] args) throws IOException
    {
        String path = "src/output/";
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
        File file = new File("src/test2/");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File[] listFiles = file.listFiles();
                for (File f : listFiles)
                {
                    f.delete();
                }
            }
            file.delete();
        }
        Task.dcFile();

    }
}
