package serverPackage; import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;
public class Server {
public static void main(String[] args) {
// TODO Auto-generated method stub
try {
int nb1,nb2, res = 0;
String op;
ServerSocket ss =new ServerSocket (1234); // creation d'un socket server w le localiser dans le poste de pacte numero 1234
Socket s=ss.accept(); // attend le interaction avec le client System.out.println("je suis server en attend de client");
InputStream is=s.getInputStream();
OutputStream os=s.getOutputStream();
InputStreamReader r=new InputStreamReader(is);
BufferedReader b=new BufferedReader(r);
nb1=Integer.parseInt(b.readLine());
nb2=Integer.parseInt(b.readLine());
op=b.readLine();
switch(op) {
case"+" :res=nb1+nb2;
break;
case"-": res=nb1-nb2;
break;
case"*" :res=nb1*nb2;
break;
case"/" :res=nb1/nb2;
break;
}
PrintWriter p=new PrintWriter(os, true); p.println(res);
ss.close();
s.close();

}
catch (IOException e) {

e.printStackTrace();
}
}
}