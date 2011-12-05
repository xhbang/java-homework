//homework 8
import java.io.*;
import java.net.*;

public class Server_Socket {

	/**
	 * @param args
	 */
	
	public static final int PORT=8080;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		ServerSocket s=new ServerSocket(PORT);
		
		System.out.println("Started:"+s);
		
		try
		{
			Socket socket=s.accept();
			try{
				
				System.out.println("Connection accepted:"+socket);
				
				
				BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));              
				PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
				
				
				
				FileWriter Server_fout=new FileWriter("copy-of-Client_Socket.txt");
				
				File Server_file=new File("src/Server_Socket.java");   //传输Server_Socket.java源文件给客户端
				FileReader Server_f=new FileReader(Server_file);
				    			
				
				BufferedReader reader=new BufferedReader(Server_f);   
    			String line,Server_total="";
    			
    			while((line=reader.readLine())!=null)                //将服务器文件的所有内容全部读进一个字符串Server_total中
    				Server_total+=line+"\n";
    			
			    out.println(Server_total);	                        //将服务器要传输文件输进out流
			    
				System.out.println("从客户端传来文件打印如下：");
				while(true)
				{
				    String Str=in.readLine();
				    if(Str.equals("//end"))
						break;
				    Server_fout.write(Str);                     //将传来的客户端文件转存入服务器的文本文件中
				    System.out.println(Str);                  //在屏幕上打印出客户端传来的文件
				}	
				
				
                Server_fout.flush();                    //向Server_fout文件中输出从客户端传来的文件数据
				
			}finally{
				System.out.println("closing......");
				socket.close();
				System.out.println("连接已断开");
				
			}
			
		}finally{
			s.close();
			
		}

	}

}
//end
