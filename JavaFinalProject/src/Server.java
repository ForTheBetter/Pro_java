/*import java.net.*;
import java.io.*;
public class Server {
	public static void main(String[] args)throws IOException{
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(7788);
			System.err.println("��������ʼ����...");
		}catch(IOException e){
			System.err.println("�޷���7788�˿����ṩ������������..");
			System.exit(1);
		}
		Socket clientSocket=null;
		try{
			clientSocket=serverSocket.accept();
		}catch(IOException e){
			System.err.println("�����Ϳͻ��˵�����ʱʧ��..");
			System.exit(1);
		}
		String address=clientSocket.getInetAddress().getHostAddress();
		System.out.println("һ������ "+address+" �������Ѿ����������Խ���ͨ��..");
		clientSocket.close();
		serverSocket.close();
	}
}
*/