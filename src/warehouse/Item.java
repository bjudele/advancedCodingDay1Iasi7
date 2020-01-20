package warehouse;

public class Item {

  private String name;
  private int price;
  private String owner;
  private Type type;

  public String getOwner() {
    return owner;
  }

  public Type getType() {
    return type;
  }


  public Item(Type type, String name, int price, String owner) {
    this.type = type;
    this.name = name;
    this.price = price;
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
