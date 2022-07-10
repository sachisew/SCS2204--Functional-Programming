var a : Int = 2;
var b : Int = 3;
var c : Int = 4;
var d : Int = 5;
var k : Float = 4.3f;
var g : Float = 4.0f;

@main
def run(): Unit={

//println(--b*a+c*d--); ->  java answer = 24
b -= 1;
println(b*a+c*d);
d -= 1;

//println(a++); ->  java answer = 2
println(a);
a += 1;

//println(-2*(g-k)+c); -> java answer = 4.6000004
println(-2*(g-k)+c);

//println(c=c++);  -> java answer = 4
println(c);

//println(c=++c*a++); ->java answer = 15
c+=1;
println(c*a);                     
a+=1;
}