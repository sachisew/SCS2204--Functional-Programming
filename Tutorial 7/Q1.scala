import scala.io.StdIn.readLine

class rational(x:Int, y:Int){
    def numer= x;
    def denom= y;
    def neg= new rational( -this.numer, this.denom);
    override def toString = numer + "/" + denom
}

@main
def run()={
    val num= new rational(1,2);
    println(num.neg)
}