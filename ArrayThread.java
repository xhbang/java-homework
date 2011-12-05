
public class ArrayThread{

	/**
	 * @param args
	 */


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

        int a[]=new int[20];
        
	    
		for(int i=0;i<a.length;i++)                    //生成20个随机数并存进数组a[20]
	         a[i]=(int)(Math.random()*10);
		
		
		Thread1 t1=new Thread1(a);                //创建2个线程
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
    	
    	public void sort()                             //此处用的是冒泡排序算法
    	{ 
    		int temp;
    		for(int i=0;i<ArrayTemp.length-1;i++)      //用冒泡排序让数组由小到大排列  
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
    		
    		
    		System.out.print("线程1输出从小到大排的数组：");          //将排好的数组输出
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
        	
    		for(int i=0;i<ArrayTemp.length-1;i++)    //用冒泡排序让数组由大到小排列  
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
    		
    		
    		System.out.print("线程2输出从大到小排的数组：");  
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




