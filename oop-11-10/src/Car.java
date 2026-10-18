
public class Car extends Vehicle{
    private int seats;
    private String fuelType;

    public int getSeats() {
        return seats;
    }

//    khi class cha có ham abstract
//    => class con phai define lại hàm đó, cùng kiểu dữ liệu, cùng tên hàm
//    @Override để đánh dấu hàm này là của class cha
    @Override
    public void getInfor(){
        System.out.println("Seats: " + seats);
        System.out.println("Fuel type: " + fuelType);
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Car(){
        super(); // kế thừa hàm khởi tạo ko tham số của class cha
    }

    public Car(String id,
               String name,
               String model,
               String color,
               int seats,
               String fuelType) {
        super(id, name, model, color); // kế thừa hàm khởi tạo có tham số của class cha
        this.seats = seats;
        this.fuelType = fuelType;
    }

    public void display() {
        super.display();
        System.out.println("Seats: " + seats);
        System.out.println("Fuel type: " + fuelType);
    }
}
