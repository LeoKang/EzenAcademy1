package p308;

public class A {
	public static void main(String[] args) {
		
		
		vehicle = new Bus();
		vehicle = new Taxi();
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		B b3 = e;
		C c2 = d;
	}
}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
