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
            
            
            //����Client_Socket.javaԴ�ļ����ͻ���
            File Client_file=new File("src/Client_Socket.java");   
			FileReader Client_f=new FileReader(Client_file);
			FileWriter Client_fout=new FileWriter("copy-of-Server_Socket.txt");
			
			BufferedReader reader=new BufferedReader(Client_f); 
			String line,Client_total="";
			
			while((line=reader.readLine())!=null)            //���ļ����ݶ����ַ���Client_total��
				Client_total+=line+"\n";
		    out.println(Client_total);
			 	
             
             
		
			System.out.println("�ӷ����������ļ���ӡ���£�");
			while(true)
			{
			    String Str=in.readLine();
			    if(Str.equals("//end"))
					break;
			    Client_fout.write(Str);                 //�������ķ������ļ�ת����ͻ��˵��ı��ļ���
			    System.out.println(Str);                 //����Ļ�ϴ�ӡ���������������ļ�
			   

			}	
			
            Client_fout.flush();                    

		}finally{
			
			System.out.println("closing...");
			System.out.println("�����ѶϿ�");
			socket.close();
			
		
	}
		
	}

}
//end
