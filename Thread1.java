import java.io.*;  
public class Thread1 extends Thread {
        public static int x = 0;                                   
        public static String line;
        public static int j = 0;

        public Thread1(String threadName) {     
            super(threadName);      
        }

        public void run() {
            while (x != -1)
            {
                if (Thread.currentThread().getName().contains("Reader")) {
                    if (x != -1&&j==0)
                    {
                   j=1;
                    String fileName = "C:/23315A1204/ExceptionDemo.java";

                    try {
                        
                        FileReader fileReader = new FileReader(fileName);

                        
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        for (int check = 0; check <= x; check++) {
                            line = bufferedReader.readLine();
                        }
                        if (line == null) {
                            x = -1;
                        } else {
                            System.out.println(line);
                            x++;
                        }

                        bufferedReader.close();
                    } catch (FileNotFoundException ex) {
                        System.out.println("Unable to open file "+ fileName + " ");
                    } catch (IOException ex) {
                        System.out.println("Error reading file "+ fileName + " ");
                    }
                    }
                    yield();
                } 
                else if (Thread.currentThread().getName().contains("writer")) {
    	if (x != -1 && line != null&&j==1)  {
                   	 j=0;
                   	 String fileName = "C:/23315A1204/ExceptionDemo";
                    try {
                        
                        FileWriter fileWriter =new FileWriter(fileName, true);
                        
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                        System.out.println("y");
                        
                        bufferedWriter.close();
                    } catch (IOException ex) {
                        System.out.println("Error writing to file '"+ fileName + "'");
                    }
    }           
	Thread.yield();
                }
                else{}
            }
        }
 public static void main(String[] args) {

            Thread1 p = new Thread1("Reader");
            Thread1 c = new Thread1("writer");

            p.start();
            c.start();


        }
    }
