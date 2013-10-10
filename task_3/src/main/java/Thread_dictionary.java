import java.io.*;


/**
 * Created with IntelliJ IDEA.
 * User: NAZAR
 * Date: 09/10/13
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
public class Thread_dictionary extends Thread {
    private BufferedReader reader=null;
    private BufferedReader reader_console=null;


    @Override
    public void run() {
        super.run();
        try {

            reader_console= new BufferedReader(new InputStreamReader(System.in));

            File dictionary=new File(reader_console.readLine());
            reader=new BufferedReader(new InputStreamReader(new FileInputStream(dictionary.getAbsoluteFile())));


            String input_word=reader_console.readLine();

            String str_file=null;
            Comporator my_compporator=new Comporator(input_word,null);  // трошки криво вийшло  :(
            while((str_file=reader.readLine())!=null && str_file.length()!=0){
                String []file_index_string=str_file.split("=");
                Integer index=Integer.parseInt(file_index_string[0]);
                my_compporator.setTwo(file_index_string[1]);
                boolean asd;
                if (asd=my_compporator.isCompare()) {
                    System.out.println(index);

                 }





            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
