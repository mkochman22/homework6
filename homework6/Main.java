//Mary Kochmanski
//CIS 221, Tuesdays and Thursdays at 2:10PM


// Abstract class
abstract class Game {
  // Abstract method
  public abstract void title();
  // Static method, prints review of game
  public void review(int x) {
    System.out.println(x + "/10");
  }
}

// Subclass (inherit from Abstract class
class Indie extends Game {
  //body for abstract method, prints title of game
  public void title() {
    String title = "Night in the Woods";
    System.out.println(title);
  }
}
// Subclass (inherit from Abstract class
class Fps extends Game {
	//body for abstract method
    public void title() {
      String title = "Valorant";
      System.out.println(title);
    }
}
class Main {
  public static void main(String[] args) {
  	//Create objects of classes
    Indie myIndie = new Indie(); 
    Fps myFps = new Fps();
    
    //display results
    myIndie.title();
    myIndie.review(10);
    
    myFps.title();
    myFps.review(8);
  }
}
