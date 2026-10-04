import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    ôn lại mô hình 3 khối
//    bài 1: tính chu vi và diện tích hình chữ nhật
//    input: số lượng tham số: chieu dai, chieu rong
    public static void chuViDienTich(float dai, float rong) {
//        fail first
//        TH1: dai, rong > 0
//        process
        if (dai < 0 || rong < 0) {
            System.out.println("Chieu dai, chieu rong khong duoc am");
            return;
        }
        float chuVi = 2 * (dai + rong);
        float dienTich = dai * rong;

//        output: in ra chu vi, dien tich
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }

    public static void soLonNhat(int num1, int num2, int num3) {
        int maximum = num1;

        if (num2 > maximum) {
            maximum = num2;
        }

        if (num3 > maximum) {
            maximum = num3;
        }

        System.out.println("So lon nhat la: " + maximum);
    }

    public static void kiemTraHocLuc(float diemTB) {
        if (diemTB < 0 || diemTB > 10) {
            System.out.println("Diem TB khong hop le");
            return;
        }

//        happy case
        if (9 <= diemTB && diemTB <= 10) {
            System.out.println("Xuat sac");
        } else if (8 <= diemTB && diemTB < 9) {
            System.out.println("Gioi");
        } else if (6.5 <= diemTB && diemTB < 8) {
            System.out.println("Kha");
        } else if (5 <= diemTB && diemTB < 6.5) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
    }

    public static void tinhTienDien(float soKWh) {
        if (soKWh < 0) {
            System.out.println("So KWh khong hop le");
            return;
        }

        int tienDien = 0;
        double roundSoKWh = Math.ceil(soKWh);
        if (roundSoKWh <= 50) {
            tienDien = (int) (1800 * roundSoKWh);
        } else if (51 <= roundSoKWh && roundSoKWh <= 100) {
            tienDien = (1800 * 50) + (int)(2000 * (roundSoKWh - 50));
        } else if (101 <= roundSoKWh && roundSoKWh <= 200) {
            tienDien = (1800 * 50) + (2000 * 50) + (int)(2500 * (roundSoKWh - 100));
        } else {
            tienDien = (1800 * 50) + (2000 * 50) + (2500 * 100) + (int)(3000 * (roundSoKWh - 200));
        }
        System.out.println("Tien dien: " + tienDien);
    }

//    loop
//    bài 1: in các số từ 1 -> 100
    public static void inSoTu1Den100() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i);
        }
    }

//    bài 2: in các số chẵn từ 0 -> 100
    public static void inSoChanTu0Den100() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

//    bài 3: tính tổng các số từ 1 -> 300
    public static void sum1To300() {
        int sum = 0;
        for (int i = 1; i <= 300 ; i++) {
            sum += i;
        }
        System.out.println("Tong so tu 1 den 300 la: " + sum);
    }

//    bài 4: in bảng cửu chương 5
    public static void cuuChuong5() {
//        bắt đầu vòng lặp
//         i = 1
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//       điều kiện dừng: i <= 10
//        bước nhảy: i++
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

    }
    //        bai 5: tính giai thưa của n
//        VD: 3! = 6, 4! = 24, 5! = 120
//        n! = n * (n - 1) * (n - 2) * ... * 2 * 1
    public static void giaiThua(int n) {
//        đk bắt đầu vòng lặp. i = 1
//        đk dừng: i <= n
//        buước nhảy: i++
        if (n <= 1) {
            System.out.println("n khong hop le");
            return;
        }
        int result = 1;
        for (int i = 2; i <= n ; i++) {
            result *= i;
        }
        System.out.println("Giai thua cua n la: " + result);
    }

//    bai 6: in ra n so fibonaci
//    n= 5
//    0 1 1 2 3 5

//    dk bat dau vong lap: i = 1
//    dk dung: i <= n
//    buoc nhay: i++
    public static void fibonaci(int n) {
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 1; i <= n ; i++) {
            System.out.println(prev1 + " ");
            int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
//        i = 1
//        0
//        prev1 = 1, prev2 = 1
//        i = 2
//        0 1
//        prev1 = 1, prev2 = 2
//        i = 3
//        0 1 1
//        prev1 = 2, prev2 = 3
//        ....
    }

    public static void main(String[] args) {
//        bai 1: tinh chu vi, dien tich
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 1: Tinh chu vi, dien tich hình chữ nhật");
        System.out.print("Nhap chieu dai: ");
//        phai parse tu string -> number vi sau nay se nhap ca so va chu
        float dai = Float.parseFloat(sc.nextLine());

        System.out.println("Nhap chieu rong: ");
        float rong = Float.parseFloat(sc.nextLine());
//        goi ham chuViDienTich
        chuViDienTich(dai, rong);

//        bài 2: tìm số lớn nhất trong 3 số
//        input: 3 tham số nguyên
//        output: số lớn nhất
//          define hàm
//          - int num1, int num2, int num3
//          - int maximum

//        process: thuật toán flag
//        - chọn 1 số bất kỳ làm số lớn nhất. Thường chọn số đầu tiên là số "lớn nhất"
//        - duyệt từ số thứ 2 trở đi
//          + nếu số đang xét > số "lớn nhất" -> gán số "lớn nhất" = số đang xét
//          + ngược lại => next
        int num1 = 4;
        int num2 = 2;
        int num3 = 1;
        soLonNhat(num1, num2, num3);

//        Bai 3: kiem tra hoc luc cua hoc sinh dua vao diem trung binh
//        input
//        output
//        process
        System.out.println("Bai 3: kiem tra hoc luc cua hoc sinh");
        float diemTB1 = 9.75f;
        kiemTraHocLuc(diemTB1);

//        Bai 4: tinh tien dien
//        bac 1: 1-50kWh -> 1800
//        bac 2: 51-100 -> 2000
//        bac 3: 101-200 -> 2500
//        bac 4: 3000
//        1 so bai tap tuong duong: tinh tien thue, tinh tien taxi
        float soKWh = 50.5f;
        tinhTienDien(soKWh);
    }
}