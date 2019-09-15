import java.io.*;

public class Test2{

    public static void main(){
        int l=6;
        
        String tnull = "NULL";
        byte[] bnull =tnull.getBytes();
        char t0='0';
        char tz=',';
        char tp=' ';
        byte[] b0 =t0.getBytes();
        byte[] bz =tz.getBytes();
        byte[] bp =tp.getBytes();

        int sizebuf = buf.lenght;

        byte[] text = new byte[256];
        int sizet =0;

        FileInputStream fil1 = null;
        FileOutputStream fil2 = null;

        try{
            System.out.println("\nopen file1");
            fil1 = new FileInputStream("C://Git//Dz2//logdet15-08-11.txt");
            System.out.println("\nopen file2");
            fil2 = new FileInputStream("C://Git//Dz2//test2.txt");

        
            System.out.println("\nread file1");

            while( ( sizet=fil1.read(text) )!=-1 ){
                System.out.println("\n\n");
                int j=0;
                for(int i =0;i<sizet;i++)
                {
                    if( (text[i]==t0) && (text[i-1]==tp) && (text[i+1]==tp) )
                    /////// _0_
                    {
                        System.out.println("  _0_  ");
                        
                        fil2.write(text,j,i-1);
                        fil2.write(bnull);
                        i=i+4;
                        j=i+4;
                    }
                    else if( (text[i]==t0) && (text[i-1]==tp) && (text[i+1]==tz) && (text[i+2]==t0) && (text[i+3]==tp) ) 
                    /////// _0,0_
                    {
                        System.out.println("  _0,0_  ");

                        fil2.write(text,j,i-1);
                        fil2.write(bnull);
                        i=i+4;
                        j=i+4;                       
                    }
                }
            }
            System.out.println("\n\n");
        }
        catch(IOException ex){
            System.out.println("\nerror");
            System.out.println(ex.getMessage());
        }
        finally{
            if(fil1!=null)
            {
                System.out.println("\nclose file1");
                fil1.close();
            }
            if(fil2!=null)
            {
                System.out.println("\nclose file2");
                fil2.close();
            }
        }
    }
}