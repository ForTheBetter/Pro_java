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
		System.out.println(this.getName()+"为来自"+address+"的请求服务..");
		try{
			s.close();
		}catch(IOException e){
			System.out.println("关闭来自"+address+"的客户端通信失败..");
		}
	}
}
