def toUpper(n:String):String={
    n.toUpperCase()
}

def toLower(n:String):String={
    n.toLowerCase()
}
def formatNames(name: String,func: String => String): String= {
   func(name)
}


@main
def run():Unit={
    println(formatNames("Benny",toUpper))
    println("N"+(formatNames("i",toUpper))+"roshan")
    println(formatNames("Saman",toLower))
    println("Kumar"+(formatNames("a",toUpper))) 
}