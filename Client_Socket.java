//homework 8
import java.io.*;
import java.net.*;


public class Client_Socket {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws IOException{
		
		// TODO Auto-generated method stub

		InetAddress addr=InetAddress.getByName(null);
		System.out.println("addr="+addr);
		Socket socket=new Socket(addr,Server_Socket.PORT);
		
		
		try{
			System.out.println("socket="+socket);
			
			
			BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
            
            
            //传输Client_Socket.java源文件给客户端
            File Client_file=new File("src/Client_Socket.java");   
			FileReader Client_f=new FileReader(Client_file);
			FileWriter Client_fout=new FileWriter("copy-of-Server_Socket.txt");
			
			BufferedReader reader=new BufferedReader(Client_f); 
			String line,Client_total="";
			
			while((line=reader.readLine())!=null)            //将文件内容读进字符串Client_total中
				Client_total+=line+"\n";
		    out.println(Client_total);
			 	
             
             
		
			System.out.println("从服务器传来文件打印如下：");
			while(true)
			{
			    String Str=in.readLine();
			    if(Str.equals("//end"))
					break;
			    Client_fout.write(Str);                 //将传来的服务器文件转存入客户端的文本文件中
			    System.out.println(Str);                 //在屏幕上打印出服务器传来的文件
			   

			}	
			
            Client_fout.flush();                    

		}finally{
			
			System.out.println("closing...");
			System.out.println("连接已断开");
			socket.close();
			
		
	}
		
	}

}
//end
