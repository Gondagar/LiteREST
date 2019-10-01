package cc.serfer.model;

public class GrantMatrix {

    long id;

    GrantObject grantObject;

    GrantOperation grantOperation;

    public GrantMatrix() {
    }

    public GrantMatrix(GrantObject grantObject, GrantOperation grantOperation) {
        this.grantObject = grantObject;
        this.grantOperation = grantOperation;
    }

    public GrantMatrix(long id, GrantObject grantObject, GrantOperation grantOperation) {
        this.id = id;
        this.grantObject = grantObject;
        this.grantOperation = grantOperation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GrantObject getGrantObject() {
        return grantObject;
    }

    public void setGrantObject(GrantObject grantObject) {
        this.grantObject = grantObject;
    }

    public GrantOperation getGrantOperation() {
        return grantOperation;
    }

    public void setGrantOperation(GrantOperation grantOperation) {
        this.grantOperation = grantOperation;
    }

    @Override
    public String toString() {
        return "GrantMatrix{" +
            "id=" + id +
            ", grantObject=" + grantObject +
            ", grantOperation=" + grantOperation +
            '}';
    }
}
