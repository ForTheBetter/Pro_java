import java.net.*;
import java.io.*;

public class Server2 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(7788);
			System.err.println("��������ʼ����...");
		} catch (IOException e) {
			System.err.println("�޷���7788�˿����ṩ������������..");
			System.exit(1);
		}
		Socket clientSocket = null;
		while (true) {
			try {
				clientSocket = serverSocket.accept();
				Processor p=new Processor(clientSocket);
				p.start();
			} catch (IOException e) {
				System.err.println("�����Ϳͻ��˵�����ʱʧ��..");
				System.exit(1);
			}
			String address = clientSocket.getInetAddress().getHostAddress();
			System.out.println("һ������ " + address + " �������Ѿ����������Խ���ͨ��..");
			//serverSocket.close();
		}
	}
}
