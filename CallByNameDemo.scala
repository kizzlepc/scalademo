object CallByNameDemo{
    def main(args:Array[String]){
        printTime(time())
    }

    def time()={
        println("获取时间")
        System.nanoTime
    }

    def printTime(t: => Long )={
        println("打印时间")
        println("时间："+t)
        t
    }
}