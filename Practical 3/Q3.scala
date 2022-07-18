def volume(r: Double)= (4.0/3.0)* math.Pi * math.pow(r,3);

@main
def run()={
    printf("Volume= %.2f", volume(5));
}