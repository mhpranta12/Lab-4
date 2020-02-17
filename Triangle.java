package com.aiub.lab4;

public class Triangle {
			private int x;
			private int y;
			private int z;
			public int getX() {
				return x;
			}
			public void setX(int x) {
				this.x = x;
			}
			public int getY() {
				return y;
			}
			public Triangle() {
				super();
			}
			public Triangle(int x, int y, int z) {
				super();
				this.x = x;
				this.y = y;
				this.z = z;
			}
			public void setY(int y) {
				this.y = y;
			}
			public int getZ() {
				return z;
			}
			public void setZ(int z) {
				this.z = z;
			}
			public void testtriangle()
			{
				if (new Integer(x).equals(new Integer(y))  && new Integer(y).equals(new Integer(z)) &&new Integer(x).equals(new Integer(z)))
				{
					System.out.println("Equiliteral");
				}
				else if( x==y && z==x)
						
				{
					System.out.println("The triangle is isosceles");
				}
				else if(y==z && x!=y)
				{
					System.out.println("The triangle is isosceles");
				}
				else
				{
					System.out.println("The triangle is scalene");
				}
			}
			public void show()
			{
				System.out.println(x+" : "+y+" : "+z);
				
			}

}
