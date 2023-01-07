import java.io.*;
public class bytedata
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c=-1;
            while((c=in.read())!=-1)
            {
                out.write(c);
            }
        } 
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            if(in!=null)
            in.close();
            if(out!=null)
            out.close();
        }
    }
}