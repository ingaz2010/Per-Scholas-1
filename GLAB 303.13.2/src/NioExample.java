import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NioExample {
    public static void main(String[] args) throws IOException {
//initializing two files in Array
        String[] inputFiles = {"C:\\Users\\Inga Israr\\Downloads\\file1.txt", "C:\\Users\\Inga Israr\\Downloads\\file2.txt"};

        //Specify out file with path location
        //Files contents will be written in these files
        String outputFile = "C:\\Users\\Inga Israr\\Downloads\\nioOutput.txt";

        //Get Channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for(int i = 0; i < inputFiles.length; i++) {
            //Get Channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputchannel = fis.getChannel();
            long size = inputchannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int) size);
            System.out.println((char) buf.get());
            while(inputchannel.read(buf) > 0){
                buf.flip();
                while(buf.hasRemaining()){
                    //System.out.println((char) buf.get());
                    targetChannel.write(buf);
                }
            }
            //fis.close();
        }
    }
}