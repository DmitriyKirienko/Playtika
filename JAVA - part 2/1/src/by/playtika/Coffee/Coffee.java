package by.playtika.Coffee;

public abstract class Coffee {
    private String sort;
    private int value;
    private int weight;


    public Coffee (String sort, int value, int weight) {
        this.sort = sort;
        this.value = value;
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }
    public void setSort(String s) {
        this.sort = s;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int v) {
        this.value = v;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int w) {
        this.weight = w;
    }
}
