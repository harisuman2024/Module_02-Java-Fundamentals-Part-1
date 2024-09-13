class Hello{

char ch;

void show(){
System.out.println(ch==0);
System.out.println(ch==' ');
System.out.println(48==0);
System.out.println(ch=='0');
System.out.println(ch==48);
System.out.println(ch=='\u0000');

}

}
class Lab2{
public static void main (String args[]){
Hello hello=new Hello();
hello.show();
}
}

// To understand default values of char types















