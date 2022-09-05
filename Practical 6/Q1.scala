@main
def run()={
    val alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //encrypt
    val encrypt=(c:Char, key:Int, a:String)=>
        a((a.indexOf(c.toUpper)+key)%a.size)
    
    //decrypt
    val decrypt= (c:Char, key:Int, a:String)=>
        a((a.indexOf(c.toUpper)-key)%a.size)

    val cipher= (algo:(Char, Int, String)=>
        Char, s:String, key:Int, a:String)=>
            s.map(algo(_,key,a))

    val ct= cipher(encrypt,"SEW",3,alphabet)
    println(ct);

    val pt= cipher(decrypt,ct,3,alphabet)
    println(pt);
}