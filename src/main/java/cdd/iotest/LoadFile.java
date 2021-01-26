package cdd.iotest;

import java.io.*;

public class LoadFile {

    // 通过流读取文件
    public static String readFile(String path) {
        File file = new File(path);
        BufferedReader br = null;
        StringBuffer buffer = new StringBuffer();
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return buffer.toString();
    }
}
