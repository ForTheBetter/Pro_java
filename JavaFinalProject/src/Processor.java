import java.io.IOException;
import java.net.*;
public class Processor extends Thread{
	Socket s;
	public Processor(Socket s){
		super();
		this.s=s;
	}
	
	@Override
	
	public void run(){
		String address=s.getInetAddress().getHostAddress();
		System.out.println(this.getName()+"Ϊ����"+address+"���������..");
		try{
			s.close();
		}catch(IOException e){
			System.out.println("�ر�����"+address+"�Ŀͻ���ͨ��ʧ��..");
		}
	}
}
