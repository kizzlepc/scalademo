object CloseDemo{
    def main(args:Array[String]){
        println(fun(2))
        println(fun(5))
    }

    var outArg = 10
    val fun = (i:Int) => i*outArg
}