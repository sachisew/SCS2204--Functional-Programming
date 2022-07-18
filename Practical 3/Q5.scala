def easy(x: Int): Int= x*8;
def tempo(x: Int): Int= x*7;

@main
def run()={
    printf("Total running time= %d", easy(2)+tempo(3)+easy(2));
}