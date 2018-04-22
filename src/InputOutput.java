import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import static java.lang.System.out;

public class InputOutput {
    public static File[] files;
    public static Date a;
//    private static String FileName;

    public static void main(String[] args) throws IOException {
        File f1 = new File("a.txt");
        if(!f1.exists())

            out.printf("File %s doesn't exist", f1.getAbsolutePath());
            else {
            a = new Date(f1.lastModified());
            out.println(f1.getName());
            System.out.println(a.toString());
            System.out.println(f1.length());
        }

       FileInputStream st = new FileInputStream("a.txt");
        out.print("jhgjhgjdhjg");
        while(st.available() !=0)
        {
            int b = st.read();
            char ch = (char)b;
            out.print(ch);
        }
        st.close();
        FileOutputStream so = new FileOutputStream("out.txt");
        String d = "33y4t5g5gt8ret8re9g";
        byte[] bytes = d.getBytes();
        so.write(bytes);
        so.close();
    }

}
