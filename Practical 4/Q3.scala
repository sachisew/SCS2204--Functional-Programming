object names{ 
    def toUpper(n:String):String={
        n.toUpperCase()
    }   

    def toLower(n:String):String={
        n.toLowerCase()
    }
    def formatNames(name: String,func: String => String): String= {
        func(name)
    }


    def main(args:Array[String]):Unit={
        val name1="Benny"
        val name2="Nirmal"
        val name3="Saman"
        val name4="Kumara"

        println(formatNames("Benny",toUpper));
        println((formatNames("Niroshan".substring(0,2),toUpper))+formatNames(name2.substring(2),toLower));
        println(formatNames("Saman",toLower));
        println((formatNames("Kumara".substring(0,1),toUpper))+formatNames(name4.substring(1,5),toLower)+formatNames(name4.substring(5),toUpper));
    }
}