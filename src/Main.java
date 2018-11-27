import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        try {
            File file = new File("map.txt");
            FileReader filereader = new FileReader(file);

            int ch = filereader.read();
            while(ch != -1){
                System.out.print((char)ch);

                ch = filereader.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
