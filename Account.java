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
		
		String input=JOptionPane.showInputDialog("输入你的银行帐号：");
		AccountNumber=input;
		Password="cqu";
		Name="王博君";
		OpenTime="2008年8月";
		IdNumber="320684199006286667";
		sum="100000";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account aa=new Account();
		
		aa.Match();              //输入密码确保安全
		
		aa.FunctionMenu();       //选择操作；
		
		

		

	}
	
	
	public void DrawMoney()          //定义取款方法
	{
		String input=JOptionPane.showInputDialog("请输入取款金额");
		money=input;
		sum=String.valueOf(Integer.parseInt(sum)-Integer.parseInt(money));//通过String类与int型的转换求出剩余值
		JOptionPane.showMessageDialog(null,"已经为您办好取款手续，请按确定");
		FunctionMenu();
		
	}
	
	
	public void SaveMoney()        //定义存款的方法
	{
		String input=JOptionPane.showInputDialog("请输入存款金额");
		money=input;
		sum=String.valueOf(Integer.parseInt(sum)+Integer.parseInt(money));//通过String类与int型的转换求出剩余值
		JOptionPane.showMessageDialog(null,"已经为您办好存款手续，请按确定");
		FunctionMenu();
		
	}
	
	
	public void ShowRemainingSum()             //定义查询余额的方法
	{
		String ss="你的剩余金额为"+sum;
		JOptionPane.showMessageDialog(null,ss);
		JOptionPane.showMessageDialog(null,"已经为您显示了剩余金额，请按确定");
		FunctionMenu();
	}
	
	
	public void ShowInformation()           //定义显示账户人信息的方法
	{
		String ss="你的账号为："+AccountNumber+"\n"+"你的剩余金额为"+sum+"\n"+"账户人姓名"+Name+"开户时间"+OpenTime;
		JOptionPane.showMessageDialog(null,ss);
		JOptionPane.showMessageDialog(null,"已经为您显示了信息，请按确定");
		FunctionMenu();
		
	}
	
	
	public void Match()
	{
		
		String ss=JOptionPane.showInputDialog("请输入您的密码：");
		
		if(ss.equalsIgnoreCase(Password))
			;
		else
		{
			ss="您的密码输入不正确，请重新输入";
			JOptionPane.showMessageDialog(null,ss);
			Match();
		}
			
		
	}
	
	
	public void FunctionMenu()
	{
		String ss=JOptionPane.showInputDialog("存款输1，取款输2，显示余额输3,显示账户人有关信息输4,退出输5");
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
		    	JOptionPane.showMessageDialog(null,"欢迎使用");
		    	break;
		    		
		}
				
	}

}
