//homework 2-1
import javax.swing.JOptionPane;

public class Account {

	/**
	 * @param args
	 */
	
	String AccountNumber;
	String Password;
	String Name;
	String OpenTime;
	String IdNumber;
	String sum;
	String money;
	
	Account()
	{
		
		String input=JOptionPane.showInputDialog("������������ʺţ�");
		AccountNumber=input;
		Password="cqu";
		Name="������";
		OpenTime="2008��8��";
		IdNumber="320684199006286667";
		sum="100000";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account aa=new Account();
		
		aa.Match();              //��������ȷ����ȫ
		
		aa.FunctionMenu();       //ѡ�������
		
		

		

	}
	
	
	public void DrawMoney()          //����ȡ���
	{
		String input=JOptionPane.showInputDialog("������ȡ����");
		money=input;
		sum=String.valueOf(Integer.parseInt(sum)-Integer.parseInt(money));//ͨ��String����int�͵�ת�����ʣ��ֵ
		JOptionPane.showMessageDialog(null,"�Ѿ�Ϊ�����ȡ���������밴ȷ��");
		FunctionMenu();
		
	}
	
	
	public void SaveMoney()        //������ķ���
	{
		String input=JOptionPane.showInputDialog("����������");
		money=input;
		sum=String.valueOf(Integer.parseInt(sum)+Integer.parseInt(money));//ͨ��String����int�͵�ת�����ʣ��ֵ
		JOptionPane.showMessageDialog(null,"�Ѿ�Ϊ����ô���������밴ȷ��");
		FunctionMenu();
		
	}
	
	
	public void ShowRemainingSum()             //�����ѯ���ķ���
	{
		String ss="���ʣ����Ϊ"+sum;
		JOptionPane.showMessageDialog(null,ss);
		JOptionPane.showMessageDialog(null,"�Ѿ�Ϊ����ʾ��ʣ����밴ȷ��");
		FunctionMenu();
	}
	
	
	public void ShowInformation()           //������ʾ�˻�����Ϣ�ķ���
	{
		String ss="����˺�Ϊ��"+AccountNumber+"\n"+"���ʣ����Ϊ"+sum+"\n"+"�˻�������"+Name+"����ʱ��"+OpenTime;
		JOptionPane.showMessageDialog(null,ss);
		JOptionPane.showMessageDialog(null,"�Ѿ�Ϊ����ʾ����Ϣ���밴ȷ��");
		FunctionMenu();
		
	}
	
	
	public void Match()
	{
		
		String ss=JOptionPane.showInputDialog("�������������룺");
		
		if(ss.equalsIgnoreCase(Password))
			;
		else
		{
			ss="�����������벻��ȷ������������";
			JOptionPane.showMessageDialog(null,ss);
			Match();
		}
			
		
	}
	
	
	public void FunctionMenu()
	{
		String ss=JOptionPane.showInputDialog("�����1��ȡ����2����ʾ�����3,��ʾ�˻����й���Ϣ��4,�˳���5");
		switch(Integer.parseInt(ss))
		{
		    case 1:
			   SaveMoney();
			   break;
			   
		    case 2:
		    	DrawMoney();
		    	break;
		    	
		    case 3:
		    	ShowRemainingSum();
		        break;
		    
		    case 4:
		    	ShowInformation();
		    	break;
		    	
		    case 5:
		    	JOptionPane.showMessageDialog(null,"��ӭʹ��");
		    	break;
		    		
		}
				
	}

}
