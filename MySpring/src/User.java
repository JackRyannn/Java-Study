import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jackryannn on 18/3/22.
 */
public class User {
    String name;
    Cloth cloth;

    public User() {
    }

    //基于构造函数的注入
    @Autowired
    public User(Cloth cloth) {
        this.cloth = cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }
    public Cloth getCloth() {
        return cloth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
