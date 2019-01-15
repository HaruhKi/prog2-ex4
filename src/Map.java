
import java.io.*;

public class Map{

    /**
     * 1行ごとに読み込んだ。
     */

    void file_read() throws FileNotFoundException{
        try {
        BufferedReader br = new BufferedReader(new FileReader("map.txt"));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
            String liner = line.toUpperCase();
            System.out.println(liner);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
