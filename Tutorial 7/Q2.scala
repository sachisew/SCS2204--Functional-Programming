class rational(x:Int, y:Int){
    def numer= x;
    def denom= y;
    def +(num:rational)= new rational(this.numer* num.denom+ num.numer* this.denom, num.denom* denom)
    def neg = new rational(-this.numer, this.denom)
    def -(num2:rational)= this+ num2.neg;
    override def toString = numer + "/" + denom
}

@main
def run():Unit={
    val x= new rational(3,4)
    val y= new rational(5,8)
    val z= new rational(2,7)
    println(x-y-z);


}