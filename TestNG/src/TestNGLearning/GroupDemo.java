package TestNGLearning;

import org.testng.annotations.Test;

public class GroupDemo {
  @Test(groups={"smoke"})
  public void a1() {
	  System.out.println("1");
  }
  @Test(groups={"smoke"})
  public void b2() {
	  System.out.println("2");
  }
  @Test(groups={"smoke"})
  public void c3() {
	  System.out.println("3");
  }
  @Test(groups={"sanity"})
  public void d4() {
	  System.out.println("4");
  }
  @Test(groups={"sanity"})
  public void e5() {
	  System.out.println("5");
  }

  
}
