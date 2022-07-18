def converter(temp:Double)= temp * 1.8000 + 32.00;

@main
def run()={
    printf("Farenheit value= %.2f", converter(35));
}
