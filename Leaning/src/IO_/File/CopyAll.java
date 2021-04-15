package IO_.File;

import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        //  拷贝源
        File srcFile = new File("E:\\JavaLeaning");
        //  拷贝目标
        File destFile = new File("F:\\");
        //  调用拷贝方法
        copyDir(srcFile,destFile);
    }
    //  拷贝方法
    public static void copyDir(File srcFile,File destFile){
        if (srcFile.isFile()) {
            //  拷贝文件
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                //  读源文件
                in = new FileInputStream(srcFile);
                //  设置拷贝文件的路径
                String path = (destFile .getAbsolutePath().endsWith("\\")? destFile .getAbsolutePath()
                        : destFile .getAbsolutePath() + "\\") + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                //  写入到新文件
                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1){
                    out.write(bytes);
                }
                //  刷新
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;// 如果srcFile是一个文件,递归结束。
            }
        // 获取源所有子目录
        File[] files = srcFile.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                //  如果是目录，新建该目录。
                String srcDir = file.getAbsolutePath();//   源目录路径
                String destDir = (destFile .getAbsolutePath().endsWith("\\")? destFile .getAbsolutePath()
                        : destFile .getAbsolutePath() + "\\") + srcDir.substring(3);//  新目录路径，截取源目录名部分。
                //  目录新建。
                File newFile = new File(destDir);
                if (!newFile.exists()) newFile.mkdirs();
            }
            //  递归调用。
            copyDir(file,destFile);
        }
    }
}

