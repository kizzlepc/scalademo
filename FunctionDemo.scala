object FunctionDemo{
    def main(args:Array[String]){
        println(sun(1,2));
    }

    def sun(a:Int, b:Int): Int={
        var c:Int = 0;
        c = a+b;
        return c;
    }
}