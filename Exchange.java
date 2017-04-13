class Exchange{
public static void main(String args[]){
int t;
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
t=y;
y=x;
x=t;
System.out.println("the swapped values are"+x+" "+y);
}
}