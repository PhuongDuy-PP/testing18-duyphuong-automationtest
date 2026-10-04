//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    input: 1 số nguyên
//    output: số  nguyên có phải là số nguyên tố hay không -> true hoặc false
//    process
//    đk bắt đầu vòng lặp: i = 2
//    đk dừng: i <= n-1
//    bước nhảy: i++
//    TH1: n < 2 => ko là số nguyên tố
//    TH2: n == 2 => là số nguyên tố
//    TH3: normal
//      + nếu n % i == 0 => ko là số nguyên tố => dừng chương trình
//      + ngược lại => duyệt tiếp
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

//        for (int i = 2; i <= number - 1 ; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }

        int i = 2;
        while(i <= number - 1) {
            if (number % i ==0) {
                return false;
            }
            i++;
        }
//        duyệt tơới number - 1 mà vẫn ko chia hết => chắc chắc là số nguyen to
        return true;
    }

//    input: int number
//    output: tong cac chu so cua 1 so -> int
//    process
//    1234
//    tach so 4 tư 1234 => 1234 % 10 = 4
//    xoa 4 ra khoi 1234 => 1234 / 10 = 123
//    đk dung: number > 0
    public static int sumDigits(int number) {
        int sum = 0;
//        TH1: nếu number < 0 => abs de convert sang so duong
        int numberAbs = Math.abs(number);

        while (numberAbs > 0) {
            sum += numberAbs % 10;
            numberAbs /= 10;
        }

        return sum;
    }

    public static void printArray(int[] listNumbers) {
        for (int i = 0; i < listNumbers.length; i++) {
            System.out.println(listNumbers[i]);
        }
    }

    public static void printChan(int[] listNumbers) {
//        cach 1: for truyen thong - duyet theo index
//        for (int i = 0; i < listNumbers.length; i++) {
//            if(listNumbers[i] % 2 == 0) {
//                System.out.println(listNumbers[i]);
//            }
//        }

//        cach 2: for cai tien - duyet theo item
        for (int number : listNumbers) {
            if(number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void printLe(int[] listNumbers) {
        for (int i = 0; i < listNumbers.length; i++) {
            if(listNumbers[i] % 2 != 0) {
                System.out.println(listNumbers[i]);
            }
        }
    }

//    PatientPop - healthcare
//    p1: code monolith - backend - frontend chung source - laravel
//    p2: microservice - backend -frontend rieng - python - react

    public static void printPrimes(int[] listNumbers) {
        for (int number : listNumbers) {
            if(isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
//        bài 1: kiểm tra số có phải là số nguyên tố hay không
//        LƯU Ý: số 2 là số nguyên tố nhỏ nhất
//        kết quả trả về của hàm nó phải là boolean
        int number = 10;
        boolean check = isPrime(number);
        if (check) { // java tu hieu check == true
            System.out.println("So " + number + " la so nguyen to");
        } else {
            System.out.println("So " + number + " khong la so nguyen to");
        }

//        bài 2: tính tổng các chữ số của 1 số
//        VD: 1234 => 10
//        cách 1: nếu vẫn xai for => convert tu number => string => dung function co
//        san cua String để đếm số luong chu so cua 1 so
//        cach 2: dung while để xử lý trực tiếp tới number

        int number2 = -12345;
        int sum = sumDigits(number2);
        System.out.println("Tong chu so cua " + number2 + " la: " + sum);

        int[] listNumbers = {5, 3, 7, 1, 9, 10};
//        Bai 1: in cac so trong mang
//        bai 2: in cac so chan, so le trong mang
//        bai 3: in cac so nguyen to trong mang
//        function
//        dùng void
//        tham số: int[]
        System.out.println("Cac so trong mang la: ");
        printArray(listNumbers);
        System.out.println("Cac so chan trong mang la:");
        printChan(listNumbers);
        System.out.println("Cac so le trong mang la: ");
        printLe(listNumbers);
        System.out.println("Cac so nguyen to trong mang la: ");
        printPrimes(listNumbers);

//        vong lap long nhau
//        Collection trong java

    }
}