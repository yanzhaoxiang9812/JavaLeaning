package IO_.switch_io;

import java.io.*;

public class OutputStreamWriterTest {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
                    (new FileOutputStream("E:\\JavaLeaning\\Leaning\\src\\IO_\\temp_file\\temp",true)));
            bw.write("JAVA NB");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
