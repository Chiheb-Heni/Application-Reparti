package clientPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class Client {
public static void main(String[] args) {
// TODO Auto-generated method stub
try {
int nb1,nb2, res;

String op;
System.out.println("je suis un client pas encore connecter");
//InetAddress inetaddres-InetAddress.getByName("10.26.14.188"); // l'objet de type inetaddress et utilise pour stocke le ip adresse de la server si il est existe //InetSocketAddress isa-new InetSocketAddress(inetaddres,600);//l'objet inetsocketaddress utilise pour stocke lip de la server et le port //Socket s new Socket();
//s.connect(isa);
Socket s=new Socket("localhost", 1234); // creation d'un socket client
System.out.println("je suis un client connecter");
InputStream is=s.getInputStream();//utiliser pour lice un variable donne comme parametre
OutputStream os=s.getOutputStream();// utliser pour eccice un variable donne comme pacamnetce
Scanner scanner =new Scanner(System.in); // objet scanner pour eccice un variable
nb1=scanner.nextInt();
nb2=scanner.nextInt();
do {
op=scanner.nextLine();
}while(!op.equals("+") && !op.equals("-")&&!op.equals("*")&&!op.equals("/"));
PrintWriter pw=new PrintWriter(os, true);
pw.println(nb1);
pw.println(nb2);
pw.println(op);
InputStreamReader isr=new InputStreamReader(is);
BufferedReader b=new BufferedReader(isr);
res=Integer.parseInt(b.readLine());
System.out.println("le resulta est :"+res);
s.close();
}
catch(IOException e) {

e.printStackTrace();
}

}
}