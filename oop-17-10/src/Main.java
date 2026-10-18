//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        VD1: quản lý về nhân viên
//        nhân viên full time, partime
//          id, name, lương cơ bản
//        full time: bonus
//        partime: hours, rate
//        phân tích:
//        Employee - class cha
//        FullTime - class con
//        Partime - class con
//        tính đa hình
        Employee[] listEmployee = {
                new FullTime("F01", "An", 10_000_000, 5_000_000),
                new Partime("P01", "Bình", 10, 500_000)
        };
        for (Employee e : listEmployee) {
            System.out.println(e.getName() + " - " + e.calculateSalary());
        }

//        VD2: hình học
//        Circle, Rectangle
//        Shape - class cha
//        Circle - class con
//        Rectangle - class con
        System.out.println("=====================");
        Shape[] listShape = {
                new Circle(10),
                new Rectangle(10, 20)
        };
        for (Shape s : listShape) {
//            java auto goi ham toString() de in area va perimeter
            System.out.println(s);
        }
    }
}