import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO: Tìm ra sinh viên trẻ tuổi nhất

        // dữ liệu đầu vào là 3 sinh viên với thông tin họ tên và năm sinh

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên thứ 1: ");
        String hoTenSinhVien1 = sc.nextLine();
        System.out.print("Nhập năm sinh sinh viên thứ 1: ");
        int namSinhSinhVien1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập họ tên sinh viên thứ 2: ");
        String hoTenSinhVien2 = sc.nextLine();
        System.out.print("Nhập năm sinh sinh viên thứ 2: ");
        int namSinhSinhVien2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập họ tên sinh viên thứ 3: ");
        String hoTenSinhVien3 = sc.nextLine();
        System.out.print("Nhập năm sinh sinh viên thứ 3: ");
        int namSinhSinhVien3 = Integer.parseInt(sc.nextLine());

        // xử lý: tìm ra năm sinh lớn nhất -> nếu lớn hơn hoặc bằng -> nhỏ tuổi nhất

        // tìm ra năm sinh lớn nhất
        int namSinhSvNhoNhat = Math.max(Math.max(namSinhSinhVien1, namSinhSinhVien2), namSinhSinhVien3);

        // sử dụng 3 if đơn lẻ phòng trường hợp có 2 năm sinh bé tuổi nhất
        if(namSinhSinhVien1 >= namSinhSvNhoNhat){
            System.out.println(hoTenSinhVien1 + " nhỏ tuổi nhất");
        }
        if(namSinhSinhVien2 >= namSinhSvNhoNhat){
            System.out.println(hoTenSinhVien2 + " nhỏ tuổi nhất");
        }
        if(namSinhSinhVien3 >= namSinhSvNhoNhat){
            System.out.println(hoTenSinhVien3 + " nhỏ tuổi nhất");
        }

        // TODO: đếm số chẵn và số lẻ

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ 1: ");
        int soNguyenThu1 = sc2.nextInt();
        System.out.print("Nhập số nguyên thứ 2: ");
        int soNguyenThu2 = sc2.nextInt();
        System.out.print("Nhập số nguyên thứ 3: ");
        int soNguyenThu3 = sc2.nextInt();

        // xử lý : tạo 2 biến tích lũy -> thỏa điều kiện -> cộng dồn vào
        int tongSoChan = 0;
        int tongSoLe = 0;
        if (soNguyenThu1 % 2 == 0){
            tongSoChan += 1;
        }else {
            tongSoLe += 1;
        }
        if (soNguyenThu2 % 2 == 0){
            tongSoChan += 1;
        }else {
            tongSoLe += 1;
        }
        if (soNguyenThu3 % 2 == 0){
            tongSoChan += 1;
        }else {
            tongSoLe += 1;
        }

        System.out.println("Tổng số chẵn: " + tongSoChan);
        System.out.println("Tổng số lẻ: " + tongSoLe);


        // TODO: tìm ra nam cán bộ trẻ tuổi nhất

        // khởi tạo 1 biến để lấy năm sinh nhỏ nhất kèm điều kiện giới tính nam
        int namSinhCanBoNhoNhat = 0;

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Nhập họ tên cán bộ thứ 1: ");
        String hoTenCanBo1 = sc3.nextLine();
        System.out.print("Nhập năm sinh cán bộ thứ 1: ");
        int namSinhCanBo1 = Integer.parseInt(sc3.nextLine());
        System.out.print("Nhập giới tính cán bộ 1 (nam : (M), nữ (F): ");
        String gioiTinhCanBo1 = sc3.nextLine().toUpperCase();
        if (gioiTinhCanBo1.equals("M")){
            namSinhCanBoNhoNhat = Math.max(namSinhCanBoNhoNhat, namSinhCanBo1);
        }
        System.out.print("Nhập họ tên cán bộ thứ 2: ");
        String hoTenCanBo2 = sc3.nextLine();
        System.out.print("Nhập năm sinh cán bộ thứ 2: ");
        int namSinhCanBo2 = Integer.parseInt(sc3.nextLine());
        System.out.print("Nhập giới tính cán bộ 2 (nam : (M), nữ (F): ");
        String gioiTinhCanBo2 = sc3.nextLine().toUpperCase();
        if (gioiTinhCanBo2.equals("M")){
            namSinhCanBoNhoNhat = Math.max(namSinhCanBoNhoNhat, namSinhCanBo2);
        }
        System.out.print("Nhập họ tên cán bộ thứ 3: ");
        String hoTenCanBo3 = sc3.nextLine();
        System.out.print("Nhập năm sinh cán bộ thứ 3: ");
        int namSinhCanBo3 = Integer.parseInt(sc3.nextLine());
        System.out.print("Nhập giới tính cán bộ 3 (nam : (M), nữ (F): ");
        String gioiTinhCanBo3 = sc3.nextLine().toUpperCase();
        if (gioiTinhCanBo3.equals("M")){
            namSinhCanBoNhoNhat = Math.max(namSinhCanBoNhoNhat, namSinhCanBo3);
        }

        if(namSinhCanBo1 >= namSinhCanBoNhoNhat && gioiTinhCanBo1.equals("M")){
            System.out.println(hoTenCanBo1 + " trẻ tuổi nhất");
        }
        if(namSinhCanBo2 >= namSinhCanBoNhoNhat && gioiTinhCanBo2.equals("M")){
            System.out.println(hoTenCanBo2 + " trẻ tuổi nhất");
        }
        if(namSinhCanBo3 >= namSinhCanBoNhoNhat && gioiTinhCanBo3.equals("M")){
            System.out.println(hoTenCanBo3 + " trẻ tuổi nhất");
        }


        // TODO: tính khoảng cách từ nhà sinh viên đến trường học

        // xử dụng công thức d = sqrt((x2 - x1)^2 + (y2 - y1)^2) -> so sánh khoảng cách

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Tên sinh viên 1: " );
        String tenSv1 = sc4.nextLine();
        System.out.print("Nhập tọa độ sinh viên thứ 1 x = ");
        double toaDoXSv1 = Double.parseDouble(sc4.nextLine());
        System.out.print("Nhập tọa độ sinh viên thứ 1 y = ");
        double toaDoYSv1 = Double.parseDouble(sc4.nextLine());
        System.out.print("Tên sinh viên 2: " );
        String tenSv2 = sc4.nextLine();
        System.out.print("Nhập tọa độ sinh viên thứ 2 x = ");
        double toaDoXSv2 = Double.parseDouble(sc4.nextLine());
        System.out.print("Nhập tọa độ sinh viên thứ 2 y = ");
        double toaDoYSv2 = Double.parseDouble(sc4.nextLine());
        System.out.print("Tên sinh viên 3: " );
        String tenSv3 = sc4.nextLine();
        System.out.print("Nhập tọa độ sinh viên thứ 3 x = ");
        double toaDoXSv3 = Double.parseDouble(sc4.nextLine());
        System.out.print("Nhập tọa độ sinh viên thứ 3 y = ");
        double toaDoYSv3 = Double.parseDouble(sc4.nextLine());
        System.out.print("Nhập tọa độ trường học x = ");
        double toaDoXTh = Double.parseDouble(sc4.nextLine());
        System.out.print("Nhập tọa độ trường học y = ");
        double toaDoYTh = Double.parseDouble(sc4.nextLine());

        double d1 = Math.sqrt((Math.pow((toaDoXTh - toaDoXSv1), 2) + Math.pow((toaDoYTh - toaDoYSv1),2)));
        double d2 = Math.sqrt((Math.pow((toaDoXTh - toaDoXSv2), 2) + Math.pow((toaDoYTh - toaDoYSv3),2)));
        double d3 = Math.sqrt((Math.pow((toaDoXTh - toaDoXSv3), 2) + Math.pow((toaDoYTh - toaDoYSv3),2)));

        double dMax = Math.max(Math.max(d1, d2), d3);
        if (d1 >= dMax){
            System.out.print(tenSv1 + " xa trường nhất");
        }
        if (d2 >= dMax){
            System.out.print(tenSv2 + " xa trường nhất");
        }
        if (d3 >= dMax){
            System.out.print(tenSv3 + " xa trường nhất");
        }


    }
}