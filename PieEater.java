public class PieEater {

  public static void main(String[] args) {
    System.out.println("I eat pie");
  }

  public Integer walkAndEatPies(Grid aGrid) {
    extracted();
    return extracted2(aGrid);
  }

private Integer extracted2(Grid aGrid) {
    extracted3(aGrid);
    return pieCount;
}

private void extracted3(Grid aGrid) {
    for (int i = 1; i <= 10; i++) {
      if (aGrid.pieInSight(this) == true) {
        extracted6(aGrid);
      } else {
        if (aGrid.clearAhead(this) == true) {
          extracted5(aGrid);
        } else {
            turn("Left");
            turn("Right");
          break;
        }
      }
    }
}

private void extracted6(Grid aGrid) {
    eatPie(aGrid);
    eatPie(aGrid);
    eatPie(aGrid);
    eatPie(aGrid);
}

private void extracted5(Grid aGrid) {
    walk(aGrid);
}

private void extracted4(Grid aGrid) {
   
}

private void extracted() {
    initialise();
    turn("Right");
}
}
