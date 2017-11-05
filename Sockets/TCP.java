package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP {
 public static void main(String[] args) throws UnknownHostException, IOException{
 String host = "wsn.ecs.soton.ac.uk";
 int port = 5002;
 String username = "oss1g16";
 System.out.println(host);
 System.out.println(port);
 System.out.println(username);
 
 
Socket socket =  new Socket(host, port);

PrintWriter print = new PrintWriter(socket.getOutputStream(),true);
BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));

print.println(username);
System.out.println(buff.readLine());
}}