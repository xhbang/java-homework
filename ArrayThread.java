
public class ArrayThread{

	/**
	 * @param args
	 */


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

        int a[]=new int[20];
        
	    
		for(int i=0;i<a.length;i++)                    //����20����������������a[20]
	         a[i]=(int)(Math.random()*10);
		
		
		Thread1 t1=new Thread1(a);                //����2���߳�
		Thread2 t2=new Thread2(a);
		t1.start();
		t2.start();
	}

}
    class Thread1 extends Thread
    {	   
    	int ArrayTemp[]=new int[20];
    	
    	public Thread1(int b[])
	    {
    		ArrayTemp=b;
    	}	
    	
    	public void sort()                             //�˴��õ���ð�������㷨
    	{ 
    		int temp;
    		for(int i=0;i<ArrayTemp.length-1;i++)      //��ð��������������С��������  
    		{
    		    for(int j=0;j<ArrayTemp.length-i-1;j++)
    		    {
    			    if(ArrayTemp[j]>ArrayTemp[j+1])
    			    {
    				    temp=ArrayTemp[j];
    				    ArrayTemp[j]=ArrayTemp[j+1];
    				    ArrayTemp[j+1]=temp;
    			    }
    		    } 
    		}
    		
    		
    		System.out.print("�߳�1�����С�����ŵ����飺");          //���źõ��������
    		for(int i=0;i<ArrayTemp.length;i++)
    		{
    			System.out.print(ArrayTemp[i]);
    			System.out.print(",");
    		}
    		System.out.println();
	    }
    	
    	public void run()
	    {
            sort();
	    }
    		
    }
    class Thread2 extends Thread
    {	   
    	int ArrayTemp[]=new int[20];
    	
    	public Thread2(int b[])
	    {
    		ArrayTemp=b;
    	}
    	
    	public void sort()                
    	{
    		int temp;
        	
    		for(int i=0;i<ArrayTemp.length-1;i++)    //��ð�������������ɴ�С����  
    		{
    		    for(int j=0;j<ArrayTemp.length-i-1;j++)
    		    {
    			    if(ArrayTemp[j]<ArrayTemp[j+1])
    			    {
    				    temp=ArrayTemp[j];
    				    ArrayTemp[j]=ArrayTemp[j+1];
    				    ArrayTemp[j+1]=temp;
    			    }
    		    }  
    		}
    		
    		
    		System.out.print("�߳�2����Ӵ�С�ŵ����飺");  
    		for(int i=0;i<ArrayTemp.length;i++)
    		{
    			System.out.print(ArrayTemp[i]);
    			System.out.print(",");
    		}
    		System.out.println();
    	}
    	
    	public void run()
	    {
            sort();
	    }
    }




