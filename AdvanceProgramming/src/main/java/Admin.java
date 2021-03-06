public class Admin extends Bank_Accounts {
    public boolean Admin_CreateAccount(String AccountNo,String CNIC, String Fname,
                                    String Lname, int Balance, String Date, String Type, String Pin) {
        setAccountNo(AccountNo);
        setCNIC(CNIC);
        setFname(Fname);
        setLname(Lname);
        setDate(Date);
        setType(Type);
        setPin(Pin);
        return CreateAccount(getAccountNo(), getCNIC(), getFname(), getLname(), Balance, getDate(), getType(), getPin());
    }

    public boolean Admin_CheckZakat(String AcNo) {
        setAccountNo(AcNo);
        return calculateZakat(getAccountNo());
    }

    public boolean Admin_PrintStatement(String AcNo) {
        setAccountNo(AcNo);
        return printStatement(getAccountNo());
    }

    public boolean Admin_PrintDeduction(String AcNo) {
        setAccountNo(AcNo);
        return displayAllDeductions(getAccountNo());
    }

    public boolean Admin_DeleteAccount(String AcNo,String CNIC, String Pin) {
        setAccountNo(AcNo);
        setCNIC(CNIC);
        setPin(Pin);
        return DeleteAccount(getAccountNo(), getCNIC(), getPin());
    }

    public boolean Admin_CalculateInterest(String AcNo) {
        setAccountNo(AcNo);
        return Interset(getAccountNo());
    }


}