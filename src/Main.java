import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        /**
         * 1行ごとに読み込んだ。
         * 次回　これのクラス化
         */
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
