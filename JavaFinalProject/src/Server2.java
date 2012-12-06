import java.net.*;
import java.io.*;

public class Server2 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(7788);
			System.err.println("服务器开始运行...");
		} catch (IOException e) {
			System.err.println("无法在7788端口上提供连接侦听服务..");
			System.exit(1);
		}
		Socket clientSocket = null;
		while (true) {
			try {
				clientSocket = serverSocket.accept();
				Processor p=new Processor(clientSocket);
				p.start();
			} catch (IOException e) {
				System.err.println("建立和客户端的连接时失败..");
				System.exit(1);
			}
			String address = clientSocket.getInetAddress().getHostAddress();
			System.out.println("一个来自 " + address + " 的连接已经建立，可以进行通信..");
			//serverSocket.close();
		}
	}
}
