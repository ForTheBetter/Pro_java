import java.io.IOException;
import java.net.*;
public class Client {
	public static void main(String[] args){
		Socket client=null;
		try{
			client=new Socket("127.0.0.1",7788);
			InetAddress server=client.getInetAddress();
			System.out.println("��"+server.getHostAddress()+"�������ѽ���..");
			client.close();
		}catch(UnknownHostException e){
			System.out.println("ָ���ķ�������ַ����..");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("�����ͷ�����������ʱ��������..");
			System.exit(-1);
		}
	}
}
