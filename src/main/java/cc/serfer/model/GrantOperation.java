package cc.serfer.model;

public class GrantOperation {

    private int id;

    private String name;

    int standardOperation;

    public GrantOperation() {
    }

    public GrantOperation(String name, int standardOperation) {
        this.name = name;
        this.standardOperation = standardOperation;
    }

    public GrantOperation(int id, String name, int standardOperation) {
        this.id = id;
        this.name = name;
        this.standardOperation = standardOperation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandardOperation() {
        return standardOperation;
    }

    public void setStandardOperation(int standardOperation) {
        this.standardOperation = standardOperation;
    }

    @Override
    public String toString() {
        return "GrantOperation{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", standardOperation=" + standardOperation +
            '}';
    }
}
