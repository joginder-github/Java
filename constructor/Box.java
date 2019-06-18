public class Box
{
 private int l,b,h;
 public Box()
 {
  l=10;b=8;h=4;
  System.out.println("Area="+(l*b*h));
 }
 public Box(int L,int B,int H)
 {
  l=L;b=B;h=H;
  System.out.println("Area="+l*b*h);
 }
 public static void main(String[] args)
 {
  Box b1=new Box();
  Box b2=new Box(20,15,5);
  }
}