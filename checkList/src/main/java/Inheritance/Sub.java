package Inheritance;
// The Sub or extended or childClass has inherited the fields of the Base or super or parent class

public class Sub extends Base{
    private String jump;

//The subClass now has a constructor that includes the inherited ones

    public Sub(String bed, String chair, String table, String jump) {
        super(bed, chair, table);
        this.jump = jump;
    }
    public String jump(){
        return jump;
    }

    @Override
    public String sitDown() {
        return super.sitDown();
    }

    @Override
    public String sleep() {
        return super.sleep();
    }
}
