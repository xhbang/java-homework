//homework 4
import java.util.StringTokenizer;


public class StringAnalyze {

	/**
	 * @param args
	 */
                                           //��дһ���򵥵�Java����
    String JavaPro=new String("" +
			"public class ExampleJava " +
			"{ " +
			"public static void main (String[] args) " +
			"int aInt,bInt ; " +
			"public void Func () ;"+
			"System.out.println(aInt + bInt);"+
			"}");

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAnalyze aa=new StringAnalyze();
		aa.FindKeyWords();
	    aa.FindFunctionName();
	    aa.FindVariableName();
	    aa.FindOperator();

	}	
	

	


  public void FindKeyWords()
  {
	StringTokenizer st=new StringTokenizer(JavaPro);
	StringBuffer KeyWord=new StringBuffer();
	while(st.hasMoreTokens())
	{
		String TempStr=new String(st.nextToken());
		if(TempStr.equals("public"))
			{
			 KeyWord.append("public");
			 KeyWord.append(",");
			}
		if(TempStr.equals("class"))
			{
			 KeyWord.append("class");
			 KeyWord.append(",");
			}
		if(TempStr.equals("static"))
			{
			 KeyWord.append("static");
			 KeyWord.append(",");
			}
		if(TempStr.equals("void"))
			{
			 KeyWord.append("void");
			 KeyWord.append(",");
			}
		if(TempStr.equals("int"))
			{
			 KeyWord.append("int");
			 KeyWord.append(",");
			}
	}
	System.out.println("�ؼ����У�"+KeyWord.toString());
  }
  
  
  
  
  public void FindFunctionName()
  {
	  StringTokenizer st=new StringTokenizer(JavaPro);
	  StringBuffer FunctionName=new StringBuffer();
      String S2="";
	  while(st.hasMoreTokens())
	  {	  
		  String S1=st.nextToken();
	                    

		  if(S1.startsWith("()"))
			  {
			  FunctionName.append(S2);
			  FunctionName.append(",");
			  }
		  S2=S1;
		 
	  }
	  System.out.println("�������У�"+FunctionName.toString());
  }
  
  
  public void FindVariableName()
  {
	  StringTokenizer st=new StringTokenizer(JavaPro);
	  StringBuffer VariableName=new StringBuffer();

	  while(st.hasMoreTokens())
	  {
		  String S1=st.nextToken();
          String S2=st.nextToken();       //S2��S1������ַ���
          
          
	      if(S1.equals("int"))
	      {
	    	  VariableName.append(S2);
	    	  VariableName.append(",");
	      }
	      
	  }
	  System.out.println("�������У�"+VariableName.toString());
  }
  
  
  public void FindOperator()
  {
	  StringTokenizer st=new StringTokenizer(JavaPro);
	  StringBuffer Operator=new StringBuffer();
	  while(st.hasMoreTokens())
	  {
		  String ss=st.nextToken();
		  if(ss.equals("+"))
			  {
			  Operator.append(ss);
			  Operator.append(",");
			  }
	  }
	  System.out.println("�������У�"+Operator.toString());
  }
  
 

}
