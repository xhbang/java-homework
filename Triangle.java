//homework 2-2
import java.util.Scanner;

class point
{                               //定义point类
	public double x,y;

	point()
	{
	x=0;
	y=0;
	
	}
	public void SetPoint(){	           //定义输入点的方法
		Scanner cin=new Scanner(System.in);
		x=cin.nextDouble();y=cin.nextDouble();
	}
}


public class Triangle {                 //定义Triangle类

	/**
	 * @param args
	 */
	
	double a,b,c;	
	point  one=new point(),two=new point(),three=new point(); //组合point类
	
	
	Triangle()        //Triangle（）构造函数，初始化为（0，0）点
	{
		a=0;b=0;c=0;
	} 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		

        Triangle A=new Triangle();
		A.SetTriangle();
		
        System.out.println("你输入三角形的面积是"+" "+A.GetArea());
		System.out.println("你输入三角形的周长是"+" "+A.GetCircumference());
		
	}

		void SetTriangle()               //利用3点求出3边长度
        {
		   System.out.println("请输入3个点：");
		   one.SetPoint();
		   two.SetPoint();
		   three.SetPoint();
		   a=Math.sqrt((one.x-two.x)*(one.x-two.x)+(one.y-two.y)*(one.y-two.y));
		   b=Math.sqrt((one.x-three.x)*(one.x-three.x)+(one.y-three.y)*(one.y-three.y));
		   c=Math.sqrt((two.x-three.x)*(two.x-three.x)+(two.y-three.y)*(two.y-three.y));
		   if(a+b>c&&a+c>b&&b+c>a)
			   ;
		   else
			   System.out.println("你输入的3个点不能构成三角形！");
		   
			   
        } 
	

     
 

	double GetArea()                 //求三角形面积的方法
	{                              
		double area,p;
		p=(a+b+c)/2;
		area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	    return area;
		
	}
	
	
	double GetCircumference()        //求三角形周长的方法
	{                           
		double C;
		C=a+b+c;
		return C;
	}
	
	
	


}




	
	





