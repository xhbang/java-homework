//homework 2-2
import java.util.Scanner;

class point
{                               //����point��
	public double x,y;

	point()
	{
	x=0;
	y=0;
	
	}
	public void SetPoint(){	           //���������ķ���
		Scanner cin=new Scanner(System.in);
		x=cin.nextDouble();y=cin.nextDouble();
	}
}


public class Triangle {                 //����Triangle��

	/**
	 * @param args
	 */
	
	double a,b,c;	
	point  one=new point(),two=new point(),three=new point(); //���point��
	
	
	Triangle()        //Triangle�������캯������ʼ��Ϊ��0��0����
	{
		a=0;b=0;c=0;
	} 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		

        Triangle A=new Triangle();
		A.SetTriangle();
		
        System.out.println("�����������ε������"+" "+A.GetArea());
		System.out.println("�����������ε��ܳ���"+" "+A.GetCircumference());
		
	}

		void SetTriangle()               //����3�����3�߳���
        {
		   System.out.println("������3���㣺");
		   one.SetPoint();
		   two.SetPoint();
		   three.SetPoint();
		   a=Math.sqrt((one.x-two.x)*(one.x-two.x)+(one.y-two.y)*(one.y-two.y));
		   b=Math.sqrt((one.x-three.x)*(one.x-three.x)+(one.y-three.y)*(one.y-three.y));
		   c=Math.sqrt((two.x-three.x)*(two.x-three.x)+(two.y-three.y)*(two.y-three.y));
		   if(a+b>c&&a+c>b&&b+c>a)
			   ;
		   else
			   System.out.println("�������3���㲻�ܹ��������Σ�");
		   
			   
        } 
	

     
 

	double GetArea()                 //������������ķ���
	{                              
		double area,p;
		p=(a+b+c)/2;
		area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	    return area;
		
	}
	
	
	double GetCircumference()        //���������ܳ��ķ���
	{                           
		double C;
		C=a+b+c;
		return C;
	}
	
	
	


}




	
	





