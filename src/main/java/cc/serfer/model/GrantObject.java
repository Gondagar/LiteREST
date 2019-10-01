package cc.serfer.model;

public class GrantObject {

    private Integer id;

    private String name;

    private String nameUkr;

    int standardObject;

    int isAdmin;

    public GrantObject() {
    }

    public GrantObject(String name, String nameUkr, int standardObject, int isAdmin) {
        this.name = name;
        this.nameUkr = nameUkr;
        this.standardObject = standardObject;
        this.isAdmin = isAdmin;
    }

    public GrantObject(int id, String name, String nameUkr, int standardObject, int isAdmin) {
        this.id = id;
        this.name = name;
        this.nameUkr = nameUkr;
        this.standardObject = standardObject;
        this.isAdmin = isAdmin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameUkr() {
        return nameUkr;
    }

    public void setNameUkr(String nameUkr) {
        this.nameUkr = nameUkr;
    }

    public int getStandardObject() {
        return standardObject;
    }

    public void setStandardObject(int standardObject) {
        this.standardObject = standardObject;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "GrantObject{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", nameUkr='" + nameUkr + '\'' +
            ", standardObject=" + standardObject +
            ", isAdmin=" + isAdmin +
            '}';
    }
}
