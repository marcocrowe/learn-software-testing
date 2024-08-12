public class PieEaterRefactoredBlocks {

  public static void main(String[] args) {
    System.out.println("I eat pie");
  }

  public Integer walkAndEatPies(Grid aGrid) {
    block1(aGrid);
    return pieCount;
  }

  private void block1(Grid aGrid) {
    block2();
    block3(aGrid);
  }

  private void block3(Grid aGrid) {
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
  }

  private void block2() {
    initialise();
    turn("Right");
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
