import scala.io.StdIn.readInt

def calculate_intreset(deposite:Double):Double= deposite match{
    case deposite if(deposite>=20000000.00)=> deposite*0.065
    case deposite if(deposite>=2000000.00)=> deposite*0.035
    case deposite if(deposite>=200000.00) => deposite*0.04
    case deposite if(deposite>=20000.00) => deposite*0.02
    case _ => 0
}


@main
def run(): Unit={
    printf("Enter deposite amount: Rs. ");
    val deposite= readInt();
    printf("Interest that the money eran in a year: Rs. %.2f", calculate_intreset(deposite));
        

}