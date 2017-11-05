package networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP {
	public static void main(String[] args) throws IOException {
		String host = "wsn.ecs.soton.ac.uk";
		int port = 5005;
		String username ="oss1g16";
		
		DatagramSocket socket = new DatagramSocket();
		byte[] b = new byte[1024];
		InetAddress adress = InetAddress.getByName(host);
		b = username.getBytes();
		DatagramPacket sent = new DatagramPacket(b, b.length,adress,port);
		socket.send(sent);
		byte[] c =new byte[1024];
		DatagramPacket received = new DatagramPacket(c, c.length);
		socket.receive(received);
		c = received.getData();
		System.out.println(new String(c,0,received.getLength()));
		
	}

}
