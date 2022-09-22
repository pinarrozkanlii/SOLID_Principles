/* SRP'ye göre bütün kodunuzdaki her sınıfın gerçekleştirmeleri gereken bri görevleri
olmalıdır. Örneğin bir chat app yapmamız istendi.Bu durumda client ve server 
farklı görevleri gerçekleştiren birer sınıftır.En temel haliyle Server 
istenilen veriyi Client'a sağlamak görevlidir.Client ise istemci konumunda 
serverdan data istemekle yükümlüdür. Client ve Server tek bir sınıfta
yazılamaz. Bu server sınıfı SRP'ye örnektir. */
import java.io.Bufferedreader;
import java.io.IOExeption;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server {
    public static void main(String[] args){
        final ServerSocket serverSocket;
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc=new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(port:3000);
            clientSocket = serverSocket.accept();
            out=new PrintWriter(clientSocket.getOutputStream());
            in= new BufferedReader(new InputStreamReader(clientSocket,getInputStream()));

            Thread sender = new Thread(new Runnable(){
                String msg;
                @Override
                public void run(){
                    while(true){
                        msg = sc.nextLine();
                        out.println(msg);
                        out.flush();
                    }
                }
            });
            Thread receive = new Thread(new Runnable(){
                String msg;
                @Override
                public void run(){
                    try {
                        msg = in.readline();

                        while(msg!=null){
                            System.outpirntln("Client: "+msg);
                            msg = in.readLine();
                        }

                        System.out.println("Client is not conneted !");
                        out.close();
                        clientSocket.close();
                        serverSocket.close();
                    } catch (IOExeption e){
                        e.printStackTrace();
                    }
                }
            });
            receive.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
