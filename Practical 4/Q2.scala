def typeN(i:Int):Unit= i match{
    case x if(x<=0)=> println("Negative/Zero Number")
    case x if(x%2==0) => println("Even Number")
    case _ => println("Odd Number")
}


@main
def run():Unit={
    println("Enter a number: ")
    typeN(scala.io.StdIn.readInt())
}