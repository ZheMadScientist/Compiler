public class test{
 
public static class Coordinates { 
 
double x,y;

 }
public static class Human { 
 
String name;
double weight;
Coordinates coord = new Coordinates();

 }
public static void main(String[] args){ 
 
double a = 55.355;
Human Petya = new Human();
Petya.name = "Petr";

Petya.weight = 97.79;

Petya.coord.x = 55.25;

Petya.coord.x = 27.12;

System.out.println(Petya.name);
System.out.println((Petya.weight));

Petya.weight*=Petya.weight/10;

System.out.println((Petya.weight));


 }
 }
