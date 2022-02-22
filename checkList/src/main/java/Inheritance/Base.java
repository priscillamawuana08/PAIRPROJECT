package Inheritance;

public class Base {
    private String bed;
    private String chair;
    private String table;

    public Base(String bed, String chair, String table) {
        this.bed = bed;
        this.chair = chair;
        this.table = table;
    }

    public String sitDown(){
        return chair;
    }

    public String sleep(){
        return bed;
    }
}
