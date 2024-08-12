public class PieEater {

  public static void main(String[] args) {
    System.out.println("I eat pie");
  }

  public Integer walkAndEatPies(Grid aGrid) {
    initialise();
    turn("Right");
    for (int i = 1; i <= 10; i++) {
      if (aGrid.pieInSight(this) == true) {
        eatPie(aGrid);
      } else {
        if (aGrid.clearAhead(this) == true) {
          walk(aGrid);
        } else {
          break;
        }
      }
    }
    return pieCount;
  }


  private int pieCount;
  
  void initialise() {
    pieCount = 0;
  }

  void turn(String direction) {
    System.out.println("Turned " + direction);
  }

  void eatPie(Grid aGrid) {
    System.out.println("Ate pie");
  }

  void walk(Grid aGrid) {
    System.out.println("Walked");
  }

  class Grid {

    boolean pieInSight(PieEater pieEater) {
      return true;
    }

    boolean clearAhead(PieEater pieEater) {
      return true;
    }
  }
}
