package com.zzl;

import java.io.*;

/**
 * Created by Administrator on 2016/12/22.
 */
public class FileWrite {
    public void readByte(String fileName){
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            byte[] byteBuffer = new byte[1024];
            int read = 0;
            while((read=is.read(byteBuffer))!=-1){
                System.out.write(byteBuffer,0,read);
            }
        }catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                try{
                    if(is!=null){
                        is.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
    public String readFile(String filePath){
        StringBuffer appInfolistInput = new StringBuffer();
        try {
            String encoding = "UTF8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()){
                System.out.println("文件是存在的");
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt=bufferedReader.readLine())!=null){
                    appInfolistInput.append(lineTxt.trim());
                }

                read.close();
                bufferedReader.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch(Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return appInfolistInput.toString();
    }
    public static void main (String[] args){
        FileWrite fileWrite = new FileWrite();
        fileWrite.readByte("D:/zzltest/zzltest.txt");

    }
}
