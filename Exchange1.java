class Exchange1{
public static void main(String args[]){
int t;
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
t=a;
a=c;
c=b;
b=t;

System.out.println("the swapped values are"+a+" "+b+" "+c);
}
}