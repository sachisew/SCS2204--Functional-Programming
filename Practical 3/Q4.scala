def bookprice(x:Int):Double= x* 24.95;
def discount(amount:Double): Double= amount*0.4;
def shipping_cost(x:Int): Double={
    if(x>50){
        3*x+ (x-50)*.75;
    }
    else
        x*3;
}

@main
def run()={
    var total: Double= bookprice(60)- discount(bookprice(60))+ shipping_cost(60);
    printf("Total wholesale cost for 60 books:- Rs. %.2f", total );
}