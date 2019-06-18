public class Test
{
 private static int k;
 static
 {
  System.out.println("Static Initialization Block:k="+k);
  k=10;
 }
 public Test()
 {
  System.out.println("Constructor:k="+k);
  k=15;
 }
 public static void main(String[] args)
 {
  new Test();
 }
}