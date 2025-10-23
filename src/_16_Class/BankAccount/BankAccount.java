package _16_Class.BankAccount;

public class BankAccount {
    private int balance;

    BankAccount(int balance){ // 객체 생성
        this.balance = balance;
        System.out.println(" 계좌가 개설되었습니다, 현재 잔액 " + balance );
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        if (money <= 0) {
            System.out.println("입금액이 0원을 초과해야 합니다.");
        } else {
            balance += money;
            System.out.println("계좌에 " + money + "원이 입금 되었습니다. 현재 잔액 : " + balance + " 원 ");
        }
    }
    public void withdraw(int money2){
        if (money2 <= 0 ) {
            System.out.println("출금액이 0원 초과여야 합니다.");
        } else if (money2 > balance){
            System.out.println(" 잔액이 부족합니다. ");
        } else {
            balance -= money2;
            System.out.println(" 현재 잔액 " + balance);
        }
    }
}

