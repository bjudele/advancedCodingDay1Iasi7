package warehouse;

public class Main {

  public static void main(String[] args) {
    Warehouse depozit = new Warehouse();
    Item bicicleta = new Item(Type.BICICLETA, "bicicleta", 830, "jon");
    Item trotienta = new Item(Type.BICICLETA, "trotineta", 33, "jil");
    Item cauciuc = new Item(Type.CAUCIUC, "cauciuc", 55, "jon");

    depozit.add(cauciuc);

    depozit.add(trotienta);
    depozit.add(bicicleta);

    depozit.showItems();

//    depozit.updateItem("bicicleta", 900);

//    depozit.removeItem("bicicleta");
//    depozit.removeItem("trotineta");

    depozit.countItemsPerOwner();

  }
}
