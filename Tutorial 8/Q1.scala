import scala.math._

case class Point(a:Int,b:Int){            //create new data type as point
        
    def x:Int = a  //define functions 
    def y:Int = b

    def +(p:Point) = Point(this.x + p.x, this.y + p.y)  //define methods
    def move(dx:Int,dy:Int) = Point(this.x + dx, this.y + dy)
    def distance(px:Int,py:Int):Double = sqrt(pow(this.x - px,2)+ pow(this.y - py,2))
    def invert = Point(this.y,this.x)
}

@main
def run()={

    val p1 = Point(2,5)
    val p2 = Point(2,2)    //Q1(a)
    val p3 = p1 + p2
    val p4 = p1.move(3,3)  //Q1(b)
    val p5 = p1.distance(2,3)  //Q1(c)
    val p6 = p1.invert  //Q1(d)

    println("p1: "+ p1)
    println("p2: "+ p2)
    println("Q1(a). p1 + p2: " + p3)
    println("Q1(b). After moving p1 by (3,3): "+ p4)
    println("Q1(c). Distance between p1 and (2,3): "+ p5)
    println("Q1(d). Invertion of p1: "+ p6)

}

  
