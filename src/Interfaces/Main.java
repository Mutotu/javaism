package Interfaces;

public class Main {
    public static void main(String[] args) {
    ITelelphone mutosPhone;
    mutosPhone = new DeskPhone(123456);
    mutosPhone.powerOn();
    mutosPhone.callPhone(123);
    mutosPhone.answer();

    mutosPhone = new MobilePhone(7890);
    mutosPhone.powerOn();
    mutosPhone.callPhone(67890);
    mutosPhone.answer();
    }
}
