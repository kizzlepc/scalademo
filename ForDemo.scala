object ForDemo{
    def main(args:Array[String]){
        var i = 0;
        for(i <- 1 to 10){
            println(i);
        }
        println("==========");

        var j = 0;
        for(j <- 1 until 10){
            println(j);
        }
        println("==========");

        var k = 0;
        var numlist = List(1,2,3,4,5,6);
        for(k <- numlist){
            println(k);
        }
    }
}