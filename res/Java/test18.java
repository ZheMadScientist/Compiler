public class test18{
 
public static class A { 
 
double a;
double b;
String s;
String s1;

 }
public static class B { 
 
A a = new A();
double a1;
double b;
String s;
String s1;

 }
public static class C { 
 
A a = new A();
B b = new B();
double a1;
double b1;
String s;
String s1;

 }
public static void main(String[] args){ 
 
A am = new A();
B bm = new B();
C cm = new C();
am.a = 1;

am.b = 2;

am.s = "struct A string";

am.s1 = "struct A string1";

bm.a1 = 12;

bm.b = 22;

bm.s = "struct B string";

bm.s1 = "struct B string1";

bm.a.a = 212;

bm.a.b = 222;

bm.a.s = "struct A string in struct B";

bm.a.s1 = "struct A string1 in struct B";

cm.a1 = 123;

cm.b1 = 223;

cm.s = "struct C string";

cm.s1 = "struct C string1";

cm.a.a = 212;

cm.a.b = 222;

cm.a.s = "struct A string in struct C";

cm.a.s1 = "struct A string1 in struct C";

cm.b.a1 = 2124;

cm.b.b = 2224;

cm.b.s = "struct B string in struct C";

cm.b.s1 = "struct B string1 in struct C";

cm.b.a.a = 12341235.124;

cm.b.a.b = 123.0086;

cm.b.a.s = "struct A string in struct B in struct C";

cm.b.a.s1 = "struct A string1 in struct B in struct C";

System.out.println(am.a);
System.out.println((am.b));

System.out.println(am.s);
System.out.println(am.s1);
System.out.println(bm.a1);
System.out.println(bm.b);
System.out.println(bm.s);
System.out.println(bm.s1);
System.out.println(bm.a.a);
System.out.println(bm.a.b);
System.out.println(bm.a.s);
System.out.println(bm.a.s1);
System.out.println(cm.a1);
System.out.println(cm.b1);
System.out.println(cm.s);
System.out.println(cm.s1);
System.out.println(cm.a.a);
System.out.println(cm.a.b);
System.out.println(cm.a.s);
System.out.println(cm.a.s1);
System.out.println(cm.b.a1);
System.out.println(cm.b.b);
System.out.println(cm.b.s);
System.out.println(cm.b.s1);
System.out.println(cm.b.a.a);
System.out.println(cm.b.a.b);
System.out.println(cm.b.a.s);
System.out.println(cm.b.a.s1);

 }
 }
