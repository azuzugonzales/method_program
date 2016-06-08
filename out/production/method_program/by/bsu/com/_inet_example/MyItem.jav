public class MyItem extends Item<MyItem.Items> {
  public MyItem () {
    // Tell my parent class about my enum.
    super(EnumSet.allOf(Items.class));
  }
  public enum Items implements Item.Items {
    Pickaxe("Pickaxe", 101),
    Saw("Saw", 201);
    private final int id;
    private final String name;

    // You have to do these.
    Items(String name, int id) {
      this.id = id;
      this.name = name;
    }

    @Override
    public int getId() {
      return this.id;
    }

    @Override
    public String getName() {
      return this.name;
    }

  }
}

// The parent class that does the common work.
public class Item<I extends Enum<I> & Item.Items> {
  // Keep track of the items.
  private final Set<I> items;

  // Pas a set of the items in the constructor.
  public Item(Set<I> items) {
    this.items = items;
  }

  // The interface.
  public interface Items {
    public int getId();

    public String getName();

  }

  // Ready-made functionality.
  public List<Integer> getIds() {
    List<Integer> ids = new ArrayList<>();
    for (I i : items) {
      ids.add(i.getId());
    }
    return ids;
  }

  public List<String> getNames() {
    List<String> names = new ArrayList<>();
    for (I i : items) {
      names.add(i.getName());
    }
    return names;
  }

}