
public class SortCompare {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]=new int[10000];
		
		
        for(int i=0;i<a.length;i++)
            a[i]=(int)(Math.random()*10);
        
		MyThread1 t1=new MyThread1(a);            //����3���߳�
		MyThread2 t2=new MyThread2(a);
		MyThread3 t3=new MyThread3(a);
		t1.start();
		t2.start();
		t3.start();

	}

}
class MyThread1 extends Thread
{
	int ArrayTemp[]=new int[10000];
	
	
	public MyThread1(int b[])
    {
		ArrayTemp=b;
	}	
	
	
	public void BubbleSort()             //��ð�������㷨
	{ 
		int temp;
		for(int i=0;i<ArrayTemp.length-1;i++)
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

    }
	
	public void run()
    {
		long start,end;
		
		start=System.nanoTime();
        BubbleSort();
        end=System.nanoTime();
        
        System.out.println("ð����������ʱ��Ϊ"+(end-start)+"����");     //��ʱ��Ĳ�ֵ�������������ʱ��
        
    }
}

class MyThread2 extends Thread
{
	int ArrayTemp[]=new int[10000];              //����10000����������������a[10000]
	
	public MyThread2(int b[])
    {
		ArrayTemp=b;
	}
	
	public void Insertsort()             //��ֱ�Ӳ��������㷨
	{
		int j;
		for(int i=2;i<=ArrayTemp.length-1;++i)
		{
			if(ArrayTemp[i]<ArrayTemp[i-1])
			{
				ArrayTemp[0]=ArrayTemp[i];
				ArrayTemp[i]=ArrayTemp[i-1];
				for(j=i-2;ArrayTemp[0]<ArrayTemp[j];--j)
					ArrayTemp[j+1]=ArrayTemp[j];
				ArrayTemp[j+1]=ArrayTemp[0];
			}
		}
	}
	
	
	public void run()
	{
		long start,end;
		
		start=System.nanoTime();
        Insertsort();
        end=System.nanoTime();
        
        System.out.println("ֱ�Ӳ�����������ʱ��Ϊ"+(end-start)+"����");
	}
}

class MyThread3 extends Thread
{
	int ArrayTemp[]=new int[10000];
	
	public MyThread3(int b[])
    {
		ArrayTemp=b;
	}
	
	public void SelectSort()           //��ѡ�������㷨
	{
		int j,temp;
		for(int i=0;i<ArrayTemp.length;++i)
		{
			j=SelectMin(i);
			if(i!=j)
			{
				   temp=ArrayTemp[i];
				   ArrayTemp[i]=ArrayTemp[j];
				   ArrayTemp[j]=temp;
			}
			
		}
	}
	
	public int SelectMin(int start)
	{
		int Min=10,temp=-1;
		
		for(int i=start;i<ArrayTemp.length;++i)
		{
			if(ArrayTemp[i]<Min)
				{
				Min=ArrayTemp[i];
				temp=i;
				}
		}
		return temp;
		
	}
	
	public void run()
	{
		long start,end;
		
		start=System.nanoTime();
        SelectSort();
        end=System.nanoTime();
        
        System.out.println("ѡ����������ʱ��Ϊ"+(end-start)+"����");
        
    }
}
		

        /*for(int i=0;i<ArrayTemp.length;i++)       //�öδ�������������������Ƿ�ɹ�
		{
			System.out.print(ArrayTemp[i]);
			System.out.print(",");
		}
		System.out.println();*/      


