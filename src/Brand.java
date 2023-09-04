import java.util.ArrayList;
import java.util.List;

public class Brand {
  private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   private String name;

    Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }


}

