public class test1{
 
public static class Coordinates { 
 
double x,u,y;

 }
public static class Point { 
 
String name;
double r;
Coordinates coord = new Coordinates();

 }
public static void main(String[] args){ 
 
Coordinates coord = new Coordinates();
coord.x = 3;

coord.u = 2;

coord.y = 1;

Point point = new Point();
point.name = "tipaPoint";

point.coord.x = 5;

point.coord.y = -1.346;

point.coord.u = 2+847;


 }
 }
