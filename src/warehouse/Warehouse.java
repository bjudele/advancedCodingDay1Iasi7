package warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {

  private List<Item> items = new ArrayList<>();

  public void add(Item item) {
    items.add(item);
  }

  public void showItems() {
    for (Item each : items) {
      System.out.println(each.toString());
    }
  }

  public void removeItem(String itemName) {
    for (int index = 0; index < items.size(); index++) {
      Item elementulVerificat = items.get(index);
      if (elementulVerificat.getName().equals(itemName)) {
        items.remove(elementulVerificat);
        break;
      }
    }
  }

  public void updateItem(String itemName, int newPrice) {
    for (int index = 0; index < items.size(); index++) {
      Item elementulVerificat = items.get(index);
      if (elementulVerificat.getName().equals(itemName)) {
        elementulVerificat.setPrice(newPrice);
        break;
      }
    }
  }


  public void removeItemAnotherWay(String itemName) {
    for (Item elementulVerificat : items) {
      if (elementulVerificat.getName().equals(itemName)) {
        items.remove(elementulVerificat);
        break;
      }
    }
    System.out.println("Gata");
  }


  public void showSummary() {
    for (Item item : items) {
      Type tipulElementului = item.getType();

      tipulElementului.addValue(item.getPrice());
      tipulElementului.increment();

    }

    for (Type type : Type.values()) {
      type.showInformation();
    }
  }


  public void countItemsPerOwner() {
    Map<String, Integer> ownerMap = new HashMap<>();

    // luam item cu item
    // pentru fiecare item, luam ownerul
    // luam intrarea din map corespunzatoare ownerului (e pereche key val)
    //daca nu exista aceasta intrare, inseamna ca nu a mai avut items pana acum si
    // punem in map o noua intrare cu key=owner, val=1
    //altfel, punem in map key=owner, val= valoarea anterioara +1
    for (Item each : items) {
      String owner = each.getOwner();
      Integer numarulDeObiecteAlOwnerului = ownerMap.get(owner);
      if (numarulDeObiecteAlOwnerului == null) {
        ownerMap.put(owner, 1);
      } else {
        ownerMap.put(owner, numarulDeObiecteAlOwnerului + 1);
      }
    }

    for (Map.Entry<String, Integer> each : ownerMap.entrySet()) {
      System.out.println(each.getKey() + " = " + each.getValue());
    }

  }
}
