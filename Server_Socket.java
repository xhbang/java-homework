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
				
				File Server_file=new File("src/Server_Socket.java");   //����Server_Socket.javaԴ�ļ����ͻ���
				FileReader Server_f=new FileReader(Server_file);
				    			
				
				BufferedReader reader=new BufferedReader(Server_f);   
    			String line,Server_total="";
    			
    			while((line=reader.readLine())!=null)                //���������ļ�����������ȫ������һ���ַ���Server_total��
    				Server_total+=line+"\n";
    			
			    out.println(Server_total);	                        //��������Ҫ�����ļ����out��
			    
				System.out.println("�ӿͻ��˴����ļ���ӡ���£�");
				while(true)
				{
				    String Str=in.readLine();
				    if(Str.equals("//end"))
						break;
				    Server_fout.write(Str);                     //�������Ŀͻ����ļ�ת������������ı��ļ���
				    System.out.println(Str);                  //����Ļ�ϴ�ӡ���ͻ��˴������ļ�
				}	
				
				
                Server_fout.flush();                    //��Server_fout�ļ�������ӿͻ��˴������ļ�����
				
			}finally{
				System.out.println("closing......");
				socket.close();
				System.out.println("�����ѶϿ�");
				
			}
			
		}finally{
			s.close();
			
		}

	}

}
//end
