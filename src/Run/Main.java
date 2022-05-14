package Run;

import Manage.PhoneManage;
import Test.InputStringInteger;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PhoneManage manage = new PhoneManage();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----Chương Trình Quản Lý Danh Bạ----");
            System.out.println("Chọn Chức Năng để tiếp tục");
            System.out.println("1. Xem Danh Sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Cập Nhập");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm Kiếm");
            System.out.println("6.Thoát");
            int select = -1;
            while (select != 0) {
                System.out.println("Chọn từ 1 - 6 nhé");
                select = InputStringInteger.checkInteger();
                switch (select) {
                    case 1 -> {
                        System.out.println("Danh sách Danh Bạ");
                        manage.display();
                    }
                    case 2 -> {
                        System.out.println("Thêm mới vào danh sach");
                        manage.add();
                    }
                    case 3 -> {
                        System.out.println("Nhập tên mà bạn muốn sửa");
                        String name = sc.nextLine();
                        manage.edit(name);
                    }
                    case 4 -> {
                        System.out.println("Xin vui long nhập tên muốn xóa");
                        String deleteName = sc.nextLine();
                        manage.delete(deleteName);
                    }
                    case 5 -> {
                        System.out.println("Nhập tên mà bạn muốn tìm kiếm");
                        String findByName = sc.nextLine();
                        manage.fineByName(findByName);
                    }
                    case 6 -> {
                        System.out.println("Bạn muốn thoát");
                        System.exit(0);
                    }
                    default -> System.out.println("Bạn Nhập sai rồi nhâp lại đi bro");
                }
            }
        }while (true);
    }
}
