import java.util.Scanner;

// public: thể hiện phạm vi truy cập cua doi tượng
// private: nhung noi khac se khong thẻ truy cap duoc
// protected
public class Student {
//    liệt kê các thuộc tính (biến) của đối tượng
    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;

//    hàm khởi tạo đối tượng
//    LƯU Ý: nếu không tạo hàm khởi tạo
//    => java tự động tạo hàm khởi tạo mặc định
//    => dùng từ khóa new để tạo đối tượng
//    hàm khởi tạo không có tham số
    public Student(){
//        trong hàm ko có logic code
//        => gán giá trị mặc định cho từng thuộc tính
//        id = "123456";
//        name = "Huy";
//        age = 20;
//        address = "Ha Noi";
//        phone = "0987654321";
//        email = "";
//        gender = "Nam";
    }

//    LƯU Ý: nếu tạo dùng hàm khởi tạo có tham số => bắt buộc tạo hàm khởi tạo không tham số

    public Student(String id,
                   String name1,
                   String address,
                   String phone,
                   String email,
                   String gender,
                   int age) {
//        phân biệt tên của thuộc tính và tên của tham số
//        => this để phân biệt
//        nếu khác tên => ko cần dùng this
        this.id = id;
        name = name1;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

//    liệt kê các phương thức (function)
//    hàm nhập giá trị của đối tượng
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ma hs:");
        id = sc.nextLine();
        System.out.println("Moi ban nhap ten hs:");
        name = sc.nextLine();
        System.out.println("Moi ban nhap tuoi hs:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap dia chi hs:");
        address = sc.nextLine();
        System.out.println("Moi ban nhap so dien thoai hs:");
        phone = sc.nextLine();
        System.out.println("Moi ban nhap email hs:");
        email = sc.nextLine();
        System.out.println("Moi ban nhap gioi tinh hs:");
        gender = sc.nextLine();
    }

    public void display() {
        System.out.println("Mã HS: " + id);
        System.out.println("Tên học sinh: " + name);
        System.out.println("Email: " + email);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Giới tính: " + gender);
        System.out.println("SDT: " + phone);
        System.out.println("Tuổi: " + age);
    }
}
