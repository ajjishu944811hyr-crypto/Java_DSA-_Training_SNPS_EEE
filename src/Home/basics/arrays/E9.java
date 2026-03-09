package Home.basics.arrays;
class Equipment{
    String name;
    int equipmentid;
    String lab;
    double voltage;
    boolean isworking;

    Equipment(String name,int equipmentid,String lab, double voltage ,boolean isworking){
        this.name = name;
        this.equipmentid = equipmentid;
        this.lab = lab;
        this.voltage = voltage;
        this.isworking = isworking;
    }
}
public class E9 {
    public static void main(String[] args) {
        Equipment[] equipments = new Equipment[]{
                new Equipment("Oscilloscope", 201, "Analog la", 220, true),
                new Equipment("Synchronous Motor", 202, "Motor lab", 420, false),
                new Equipment("Generator",203,"Motors lab",420,true)
        };
        for(Equipment equipment: equipments){
            System.out.println(equipment.name +" , "
                               + equipment.equipmentid + " , "
                                + equipment.lab + " , "
                                 + equipment.voltage +" , "
                                  + equipment.isworking);
        }
    }

}
