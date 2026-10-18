
//tính đóng gói
// private, protected, public
//private: chỉ nội bộ bên trong class dùng, bên ngoài không thể truy cập kể cả class con
//public: tất cả class bên ngoài đều có thể sử dụng được
// protected: CHỈ cho class con có thể dùng được, class khác không thể sử dụng
// NGUYÊN TẮC:
// các thuộc tính BẮT BUỘC dùng private, trừ 1 số case thì dùng protected
// hàm khởi tạo BẮT BUỘC dùng public
// trong case cac thuộc tính ở phạm vi private muốn truy cập tới => dùng getter, setter


//tính trừu tượng
// class cha BẮT BUỘC CHỈ DÙNG cho class con kế thừa, không được dùng để tạo đối tượng
abstract public class Vehicle {
    private String id;
    private String name;
    private String model;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(){}
    public Vehicle(String id, String name, String model, String color){
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
    }

    abstract void getInfor();

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}
