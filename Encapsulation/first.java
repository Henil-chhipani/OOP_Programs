package Encapsulation;

public class first {
    public static void main(String[] args) {
        Bank_AC henil = new Bank_AC(1111, 400);
        System.out.println("acc no :" + henil.Ac_num);
        System.out.println("blance :" + henil.blance);

        henil.addMoney(10);
        System.out.println(" money added blance :" + henil.blance);

        int widraw = henil.widrawMoney(120);
        if (widraw == -1) {
            System.out.println("ensufficent blance");
        } else {
            System.out.println("blance :" + henil.blance);
        }
    }
}
