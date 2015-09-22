package Conn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class fileClient {
	public static void main(String [] args) {
		Socket socket = null;
		try {
			socket = new Socket("localhost",8888);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			dos.writeUTF("我是客户端，请求连接!");
			System.out.println(dis.readUTF());
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}