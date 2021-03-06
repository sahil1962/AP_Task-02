public class User extends Bank_Accounts {
    public boolean User_DepositeAmount(String AcNo, int bal) {
        setAccountNo(AcNo);
        return makeDeposit(getAccountNo(), bal);
    }

    public boolean User_WithdrawAmount(String AcNo, String Pin, int Amount) {
        setAccountNo(AcNo);
        setPin(Pin);
        return makeWithdrawal(getAccountNo(), getPin(), Amount);
    }

    public boolean User_CheckAmount(String AcNo) {
        setAccountNo(AcNo);
        return checkBalance(getAccountNo());
    }

    public boolean User_TransferAmount(String FromAcNo, String ToAcNo, String Pin, int TransferAmount) {
        setAccountNo(FromAcNo);
        setPin(Pin);
        return transferAmount(getAccountNo(), ToAcNo, getPin(), TransferAmount);
    }
}