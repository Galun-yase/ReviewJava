package bean;

/**
 * @author i-renchen@shuwen.com
 * @date 2021/6/9 14:27
 */
public class Category {
    private Integer id;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
