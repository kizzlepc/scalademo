class Person{
    var name = ""
    override def toString = getClass.getName+":["+name+"]"
}

class Worker extends Person{
    var age = 0
    override def toString = super.toString+"["+age+"]"
}

object OverrideDemo{
    def main(args:Array[String]){
        var w = new Worker
        w.name = "zhangsan"
        w.age = 20
        print(w)
    }
}