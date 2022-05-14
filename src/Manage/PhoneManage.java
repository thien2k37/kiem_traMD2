package Manage;

import File.ReadWrite;
import Phonebook.Phonebook;
import Regex.Validate;
import Test.InputStringInteger;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class PhoneManage {

    Validate validate = new Validate();
    List<Phonebook> phonebookList;
    public PhoneManage() {
        phonebookList = ReadWrite.readToFile();
    }
    public List<Phonebook> getPhonebookList() {
        return phonebookList;
    }
    static Scanner sc = new Scanner(System.in);

    public void add() throws IOException {
        phonebookList.add(inputPhonebook());
        ReadWrite.writeToFile(phonebookList);
        System.out.println("Thành Công");
    }
    public void edit(String name) throws IOException {
        if (checkName(name) == -1) {
            System.out.println(name + " Muốn sửa k0 có trong danh sách");
        }else {
            phonebookList.set(checkName(name), inputPhonebook());
            ReadWrite.writeToFile(phonebookList);
        }
    }
    public void delete(String name) throws IOException {
        if (checkName(name) == -1) {
            System.out.println("Tên không có trong danh sách");
        }else {
            phonebookList.remove(checkName(name));
            ReadWrite.writeToFile(phonebookList);
            System.out.println(name + " Đã xóa khởi danh bạ");
        }
    }
    public void fineByName(String name){
        if (checkName(name) != -1) {
            System.out.println("Tên không có trong danh sách");
        }else {
            System.out.println(checkName(name));
        }
    }
    public int checkName(String name) {
        for (int i = 0; i < phonebookList.size(); i++) {
            if (phonebookList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String inputSex() {

        String sex;
        do {
            System.out.println("Input: 1.Nam, 2.Nữ: ");
            sex = sc.nextLine();
            if (!validate.validateOneOrTwo(sex)) {
                System.out.println(sex + " Không hợp lệ, nhập lại");
            } else {
                if (sex.equals("1")){
                    sex = "ON";
                }else {
                    sex = "OFF";
                }
                break;
            }
        } while (true);
        return sex;
    }
    public String checkEmail() {
        String email;
        do {
            email = sc.nextLine();
            if(!validate.validateEmail(email)) {
                System.out.println("Nhập lại email nhé");
            }else {
                break;
            }
        }while (true);
        return email;
    }
    public String checkNumber() {
        String numberPhone;
        do {
            numberPhone = sc.nextLine();
            if (!validate.validatePhone(numberPhone)) {
                System.out.println("Nhập lại số điện thoại nhé");
            }else {
                break;
            }
        }while (true);
        return numberPhone;
    }
    public Phonebook inputPhonebook() {
        System.out.println("Nhập Tên");
        String namePhonebook = sc.nextLine();
        System.out.println("Nhập Địa Chỉ");
        String address = sc.nextLine();
        System.out.println("Nhập Email");
        String email = checkEmail();
        System.out.println("Nhập Link FB");
        String facebook = sc.nextLine();
        System.out.println("Nhập giới tính");
        String sex = inputSex();
        System.out.println("Nhập Group");
        String group = sc.nextLine();
        System.out.println("Năm Sinh");
        int year = InputStringInteger.checkInteger();
        System.out.println("Nhập Số Điện Thoại");
        int phoneNumber = Integer.parseInt(checkNumber());
        return new Phonebook(namePhonebook, address, email, facebook, sex, group, year, phoneNumber);
    }
    public void display() throws IOException {
        PhoneManage manage = new PhoneManage();
        for (Phonebook phonebook: manage.getPhonebookList()) {
            System.out.println(phonebook);
            ReadWrite.writeToFile(getPhonebookList());
        }
        System.out.println("___________________________");
    }
}
