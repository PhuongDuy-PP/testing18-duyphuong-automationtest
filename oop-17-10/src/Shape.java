abstract public class Shape {
//    vì các hình không có cùng thuộc tính
//    => khong tao thuộc tính chung, tao function tính chu vi, dien tich
    abstract double area();
    abstract double perimeter();
//    toString() - hàm đặc biệt của java
//    System.out.println(shape);
//    do toString là hàm có sẵn của java nên muốn define lại logic
//    => thêm Override
//    LUU Ý: KHÔNG DEFINE HÀM KHỞI TẠO
//    => java sẽ tự tạo hàm khởi tạo ko tham số
    @Override
    public String toString() {
//      hàm perimeter và area se lay cua class con
        return "P: " + perimeter() + " A: " + area();
    }
}
