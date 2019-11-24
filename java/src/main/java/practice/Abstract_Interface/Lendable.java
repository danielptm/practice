package practice.Abstract_Interface;

import java.util.HashMap;
import java.util.Map;

public abstract class Lendable {
    String id;
    String title;

    protected Lendable(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, String> getLendCredentials() {
        Map<String, String> map = new HashMap<>();
        map.put("id", getId());
        return map;
    };
}
