import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BankExampleMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Customer> lstCustomer = new ArrayList<>();

        boolean cont = true;
        do {
            System.out.println("+-------+--------------------------+----------+");
            System.out.println("|Ngan hang so | FX20486@v2.0.0                |");
            System.out.println("+-------+--------------------------+----------+");
            System.out.println("| 1. Them khach hang                          |");
            System.out.println("| 2. Them tai khoan cho khach hang            |");
            System.out.println("| 3. Hien thi danh sach khach hang            |");
            System.out.println("| 4. Tim theo CCCD                            |");
            System.out.println("| 5. Tim theo ten khach hang                  |");
            System.out.println("| 0. Thoat                                    |");
            System.out.println("+-------+--------------------------+----------+");
            System.out.print("Chuc nang: ");

            int chucNang = scanner.nextInt();
            scanner.nextLine();

            switch (chucNang){
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String cusName = scanner.nextLine();

                    System.out.print("Nhập số CCCD: ");
                    String cusID = scanner.nextLine();
                    cusID = checkCCCD(cusID);

                    final String[] cusIDHolder = {cusID};
                    while (lstCustomer.stream().anyMatch(cus -> cusIDHolder[0].equals(cus.getCustomerId()))){
                        System.out.println("Khách hàng đã tồn tại, vui lòng nhập lại CCCD hoặc 'NO' để thoát: ");
                        cusID = scanner.nextLine();
                        if ("No".equals(cusID)) break;
                        cusID = checkCCCD(cusID);
                        cusIDHolder[0] = cusID;
                    }

                    List<Account> newAcc = new ArrayList<>();
                    Customer newCus = new Customer(cusName, cusIDHolder[0], newAcc);
                    lstCustomer.add(newCus);

                    System.out.println("Đã thêm khách hàng "+ cusIDHolder[0] +" thành công");
                    break;

                case 2:
                    System.out.print("Nhập CCCD khach hang: ");
                    String cccd = scanner.nextLine();
                    cccd = checkCCCD(cccd);

                    if(lstCustomer.isEmpty()){
                        System.out.println("Data not exits!");
                        break;
                    }else{
                        final String[] finalCCCD = {cccd};
                        while (!lstCustomer.stream().anyMatch(cus -> finalCCCD[0].equals(cus.getCustomerId()))){
                            System.out.println("Khách hàng không tồn tại, yêu cầu nhập lại: ");
                            cccd = scanner.nextLine();
                            if ("No".equals(cccd)) break;
                            cccd = checkCCCD(cccd);
                            finalCCCD[0] = cccd;
                        }
                    }

                    while (true){
                        System.out.print("\n Nhập mã STK gồm 6 chữ số: ");
                        String accountNumber = scanner.nextLine();
                        if(accountNumber.length() != 6 || !isNumeric(accountNumber)){
                            System.out.print("Mã STK không hợp lệ. \n Vui lòng nhập lại");
                            continue;
                        }

                        String finalCccd = cccd;
                        List<Customer> cusData = lstCustomer.stream().filter(cus ->(finalCccd.equals(cus.getCustomerId()))).collect(Collectors.toList());
                        List<Account> accData = cusData.stream().flatMap(s -> s.getAccounts().stream()).collect(Collectors.toList());

                        if(!accData.isEmpty()){
                            for(Account element : accData){
                                while (accountNumber.contains(element.getAccountNumber()) && accountNumber.length() != 6 || !isNumeric(accountNumber)){
                                    System.out.print("Tài khoản đã tồn tại, yêu cầu nhập lại: ");
                                    accountNumber = scanner.nextLine();
                                }
                                System.out.print("Nhập số dư: ");
                                double balance = Integer.parseInt(scanner.nextLine());
                                if (balance < 50000) {
                                    System.out.print("Số dư không được nhỏ hơn 50,000 VNĐ. Vui lòng nhập lại: ");
                                    continue;
                                }
                                Account account = new Account(accountNumber, balance);
                                cusData.get(0).addAccount(account);
                            }
                        }else{
                            System.out.print("Nhập số dư: ");
                            double balance = Integer.parseInt(scanner.nextLine());
                            if (balance < 50000) {
                                System.out.print("Số dư không được nhỏ hơn 50,000 VNĐ. Vui lòng nhập lại: ");
                                continue;
                            }
                            Account account = new Account(accountNumber, balance);
                            cusData.get(0).addAccount(account);
                        }
                        break;
                    }
                    break;

                default:
                    break;
            }
        }while (true);
    }

    public static String checkCCCD(String cusID){
        while (cusID.length() != 12 || !isNumeric(cusID)){
            System.out.println("So CCCD khong hop le.\n Vui long nhap lai hoac ‘No’ de thoat:");
            cusID = scanner.nextLine();
            if ("No".equals(cusID)) break;
        }
        return cusID;
    }

    public static String checkACC(String acc){
        while (acc.length() != 6 || !isNumeric(acc)){
            System.out.println("So CCCD khong hop le.\n Vui long nhap lai hoac ‘No’ de thoat:");
            acc = scanner.nextLine();
            if ("No".equals(acc)) break;
        }
        return acc;
    }

//    public static Double checkBalance(){
//        System.out.print("Nhập số dư: ");
//        double balance = Integer.parseInt(scanner.nextLine());
//        if (balance < 50000) {
//            System.out.print("Số dư không được nhỏ hơn 50,000 VNĐ. Vui lòng nhập lại: ");
//            continue;
//        }
//        return balance;
//    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}