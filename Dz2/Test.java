import java.io.*;

public class Program{

    public static void main(){
        
        String text = "NULL";
        byte[] buf =text.getBytes();
        int sizebuf = buf.lenght;

        FileInputStream filtest = null;

        try{
            System.out.println("\nopen file");
            filtest = new FileInputStream("C://Git//Dz2//test.txt");

            int c=0,i=0;

            System.out.println("\nread file");

            while((c=filtest.read())!=-1){
                System.out.println("\n",i," - ");
                System.out.println((char)c);
                i++;
            }
        }
        catch(IOException ex){
            System.out.println("\nerror");
            System.out.println(ex.getMessage());
        }
        finally{
            if(filtest!=null)
            {
                System.out.println("\nclose file");
                filtest.close();
            }
        }
    }
}