class Demo
{
  int id;
  String name="Unknown";
  Double price;

 Demo()
{
  System.out.println("default const");

}

 public void m1 ()
{
  System.out.println("m1 method");
  String s="abc";
  System.out.println(s);

}

 public static void main(String[] args)
{
  System.out.println("Demo class main method");
  Demo d = new Demo();
  System.out.println(d.id);
  System.out.println(d.name);
  System.out.println(d.price);
  d.m1();
}

}