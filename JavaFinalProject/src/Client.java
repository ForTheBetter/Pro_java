import java.io.IOException;
import java.net.*;
public class Client {
	public static void main(String[] args){
		Socket client=null;
		try{
			client=new Socket("127.0.0.1",7788);
			InetAddress server=client.getInetAddress();
			System.out.println("到"+server.getHostAddress()+"的连接已建立..");
			client.close();
		}catch(UnknownHostException e){
			System.out.println("指定的服务器地址错误..");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("创建和服务器的连接时发生错误..");
			System.exit(-1);
		}
	}
}
