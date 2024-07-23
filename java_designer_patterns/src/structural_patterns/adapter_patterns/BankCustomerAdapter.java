package structural_patterns.adapter_patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomerAdapter extends BankDetailsAdaptee implements CreditCardTarget {

    @Override
    public void giveBankDetails(){
        try{
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername = buf.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accno = Long.parseLong(buf.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname = buf.readLine();

            setBankName(bankname);
            setAccNumber(accno);
            setAccHolderName(customername);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {

        long accNo = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("The Account Number " + accNo + "of" + accholdername + " in " + bname + "bank is valid and authenticated for issuing the credit card. ");
    }


}
