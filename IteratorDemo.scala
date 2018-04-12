object IteratorDemo{
    def main(args:Array[String]){
        var a = Iterator(1,2,3,8,6,5,0)
        var b = Iterator(50,38,20,100,2,10)
        println(b.max)
        println(a.min)
        println("================")

        var c = (1,2,3,4,5)
        var d = Iterator(1,2,3,4,5)
        println(a.mkString)
    }
}