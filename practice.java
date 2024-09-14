import java.util.ArrayList;
public class Vehicle{
    String vehicleType;
    String vehicleRegistration;
    String vehicleColor;
    public Vehicle(String vehicleType, String vehicleRegistration, String vehicleColor){
        this.vehicleType = type;
        this.vehicleRegistration = registration;
        this.vehicleColor = color;
    }
}
public class slot{
    String vehicleType;
    Vehicle vehicle;
    String ticketId;
    public slot(String vehicleType, Vehicle vehicle, String ticketId){
        this.vehicleType = type;
        this.Vehicle = null;
        this.ticketId = null;
    }
}
public class parkingLot{
    String parkingLotId;
    List<list<slot>>Slots;
    public parkingLot(String parkingLotId, int nfloor, int noOfSlotsPerFlr){
        this.parkingLotId = parkingLotId;
        slots = new ArrayList<>();
        for(int i=0; i<nfloors; i++ );{
            slots.add(new ArrayList<>());
            List <Slot> floorSlots = slots.get(i);
            floorSlots.add(new Slots("Bike"));
            floorSlots.add(new Slots("Truck"));
            floorSlot.add(new Slots("Truck"));
            for (int j=3; j<noOfSlotsPerFlr; j++){
                slots.get(i).add(new Slots("Car"));
            }
        }
    }
}
public String parkVehicle(String Type, String Regno, String Color){
    Vehicle vehicle = new Vehicle(Type, Regno, Color);
}
