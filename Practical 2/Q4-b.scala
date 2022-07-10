import scala.io.StdIn.readInt

def profit(price: Int)= revenue(price)- cost(price)
def attendence (price: Int)= 120+ (15-price)/ 5*20
def cost (price: Int)= attendence(price)*3 + 500
def revenue (price: Int)= attendence(price)*price


@main
def run(): Unit={
    var t_price=0
    while(t_price>=0){
          println("Enter the ticket price= Rs. ")
          t_price= readInt()
          printf("Profit= Rs. %d\n",profit(t_price))
    }
}
