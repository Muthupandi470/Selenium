package TestNGLearning;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityIninTestNG {
  @Test
  public void a() {
	  System.out.println("I am 1");
  }
  @Test
  public void z() {
	  System.out.println("God");
  }
  @Test(priority='a')
  public void A() {
	  throw new SkipException("No Need to Run");
	  //System.out.println("I am a");
  }

  @Test
  public void b() {
	  System.out.println("I am 2");
  }
  @Test(priority=1)
  public void c() {
	  System.out.println("I am 3");
  }
  @Test(priority=1)
  public void e() {
	  System.out.println("I am 4");
  }
  @Test(priority=1)
  public void d() {
	  System.out.println("I am 5");
  }
}
