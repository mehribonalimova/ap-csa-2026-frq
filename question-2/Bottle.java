public class Bottle{
  private double amount;
  private double initialAmount;

  public Bottle(double amount){
    this.amount = amount;
    intialAmount = amount;
  }

  public double updateAmount(double amount){
    double amount1 = intialAmount*0.25;
    amount -= amountR;

    if(amount < amount1){
      amount = initialAmount;
    }
    return amount;

  }

}

    
