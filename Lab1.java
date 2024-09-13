class Hello {

    byte b;
    short s;
    int x;
    long y;
    float f;
    double d;
    boolean bb;
    String str;

    void show() {
        System.out.println(b);
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bb);
        System.out.println(str);
    }

}

class Lab1 {
    public static void main(String args[]) {
        Hello hello = new Hello();
        hello.show();
    }
}

// To understand default values of data types
