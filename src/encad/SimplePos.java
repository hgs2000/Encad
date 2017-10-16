package encad;

public class SimplePos {

    private SimplePos next = null;
    private String value;

    public void setNext(SimplePos next) {
        this.next = next;
    }

    public SimplePos getNext() {
        return next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SimplePos(String val) {
        this.value = val;
    }

}
