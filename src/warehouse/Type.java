package warehouse;

public enum Type {
  BICICLETA, CAUCIUC, MINGE, UNEALTA;
  private int numarulDeElemente = 0;
  private int valoareTotala = 0;

  public void increment() {
    numarulDeElemente++;
  }

  public void addValue(int value) {
    valoareTotala += value; //valoareTotala = valoareTotala + value
//    increment();
  }

  public void showInformation() {
    System.out.println("Sunt " + numarulDeElemente + " " + this.name()
        + " in valoare de " + valoareTotala);
  }
}
