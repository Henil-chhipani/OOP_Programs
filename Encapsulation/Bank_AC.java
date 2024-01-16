package Encapsulation;

public class Bank_AC {
    int Ac_num;
    int blance;

    Bank_AC(int Ac_num, int blance) {
        this.Ac_num = Ac_num;
        this.blance = blance;
    }

    public int addMoney(int addedMoney) {
        blance = blance + addedMoney;
        return blance;
    }

    public int widrawMoney(int req_money) {
        if (blance > req_money) {
            blance = blance - req_money;
            return blance;
        } else {

            return -1;
        }
    }
}
