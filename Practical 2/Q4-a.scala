import scala.io.StdIn.readInt

def OT(OT_hr :Int) :Int= OT_hr*85
def Normal(Normal_hr: Int) :Int= Normal_hr*250
def tax(OT_hr :Int,Normal_hr :Int) :Float= if(Normal_hr>=40 && OT_hr>=30) 0.12 else 0
def p_salary(OT_hr :Int,Normal_hr :Int) :Int= OT(OT_hr)+ Normal(Normal_hr)
def salary(OT_hr :Int,Normal_hr :Int) :Float= p_salary(OT_hr, Normal_hr)- p_salary(OT_hr, Normal_hr)* tax(OT_hr, Normal_hr)

@main
def run(): Unit={
    println("Enter OT Hours per week= ")
    val OT_hr= readInt()
    
    println("Enter the Normal Hours per week= ")
    val Normal_hr= readInt()

    printf("Salary= Rs.%.2f",salary(OT_hr, Normal_hr))
}