class Bill{
  //Implement your code here
  static int counter = 0;
  private String billId;
  private String paymentMode;

  public Bill(String paymentMode) {
    this.paymentMode = paymentMode;
    counter++;
    billId = String.format("B9%03d", counter);
  }

  public String getBillId() {
    return billId;
  }
  public void setBillId(String billId) {
    this.billId = billId;
  }
  public String getPaymentMode() {
    return paymentMode;
  }
  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }
  public static int getCounter() {
    return counter;
  }
}

class Tester {
  public static void main(String[] args) {

    Bill bill1 = new Bill("DebitCard");
    Bill bill2 = new Bill("PayPal");

    //Create more objects and add them to the bills array for testing your code

    Bill[] bills = { bill1, bill2 };

    for (Bill bill : bills) {
      System.out.println("Bill Details");
      System.out.println("Bill Id: " + bill.getBillId());
      System.out.println("Payment method: " + bill.getPaymentMode());
      System.out.println();
    }
  }
}

