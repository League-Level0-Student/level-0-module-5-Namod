package _02_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	
System.out.println("set1: 0,1,1,2,3,5,8,13,21");
int x = 0;
int y = 1;
int temp;
System.out.println(x);
System.out.println(y);
for(int i = 0; i<12; i++) {
temp=y;
y=x+y;
System.out.println(y);
x=temp;


}

}

}
