import java.io.*;
class Copyfile
{
      public static void main(String args[])
      {
        File a = new File("C:\\JAVA1\\day 11 assign\\abc.txt");
        File b = new File("C:\\JAVA1\\day 11 assign\\xyz.txt");
        char c[]=new char[10000];
          int i,k=0;
          try
          {
          FileInputStream fin=new FileInputStream(a);
                      i=fin.read();
                     while(i!=-1)
                     {
                      c[k]=(char)i;
                     k++;
                     i=fin.read();
                   }
                  }
                 catch(IOException e)
                 {
                   System.out.println(e);
                 }
                  try{
                   FileOutputStream fout=new FileOutputStream(b);
                   for(i=0;i<k;i++)
                    fout.write(c[i]);
                   System.out.println("File is copied");
                 }
                 catch(IOException e)
                 {
                   System.out.println(e);
                  }
                 try
                 {
            FileInputStream fin=new FileInputStream(b);
        int i2;
        i2 = fin.read();
        while(i2 != -1)
        {
            c[k++] = (char)i2;
            System.out.print((char)i2);
            i2 = fin.read();
        }
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
      }
    }
