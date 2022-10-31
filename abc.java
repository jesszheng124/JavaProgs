abstract class A {
    private A h;
    public A(A x) { 
        this.h = x; 
        if (x != null) 
            x.set(this); 
    } // constructor
    public A get() { 
        return this.h; 
    }
    public void set(A y) {
        this .h = y;
        // time moment 1.5
    }
    public A geth() {
        return this.h;
    }
    public abstract A p();
    public static void q(A x) { 
        A y; 
        y = x.get(); 
        A z; 
        z = y.p(); 
    }
    public void r() { A x; x = this.get(); q(x); }
}
class B extends A {
    public B(A x) { 
        super(x); 
    } // constructor : calls A(A x)
    public A p() { 
        return this; 
    }
}
class C extends B {
    public C(A x) { 
        super(x); 
    } // constructor ; calls B(A x)
    public A get() { 
        return this; 
    }
    public A p() { 
        A x; 
        x = this.get(); 
        return x; 
    }
}
class Main {
    public static void main(String [] args) {
        A x, y;
        // time moment 1
        x = new C(null);
        y = new B(x);
        // time moment 2
        y.r();
        // time moment 3
    }
}