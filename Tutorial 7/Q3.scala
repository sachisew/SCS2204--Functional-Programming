var bank: List[Account] = List();

class Account(id: String, n: Int, b: Double) {
    val nic: String = id;
    val acnumber: Int = n;
    var balance: Double = b;

    def transfer(a: Account,d: Double): Account = {
      this.balance = this.balance - d;
      a.balance = a.balance + d;
      a;
    }

    override def toString(): String = "[ NIC  no - " + nic + " : Account No - " + acnumber + " : Balance - " + balance + "]";
}

@main
def run()={
    var a1 = Account("996595234V", 120101, 60000.00);
    var a2 = Account("993542658V", 120102, 40000.00);

    //a1 transfer 3000 to a2
    a1.transfer(a2,3000.0);

    bank = List(a1,a2);

    var itr = bank.iterator;

    while(itr.hasNext) 
      println(itr.next);
  
}
