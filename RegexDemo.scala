import scala.util.matching.Regex

object RegexDemo{
    def main(args:Array[String]){
        val pattern  = "scala".r
        val str = "scala is Scalable and cool"

        println(pattern findFirstIn str)
        println("=============================")

        val pattern1 = "(s|S)cala".r
        val str1 = "Scala is scalable and cool"
        println((pattern1 findAllIn str1).mkString(","))
        println("=============================")
        
        val pattern2 = "(S|s)cala".r
        val str2 = "Scala is scalable and cool"
        println((pattern2 findAllIn str2).mkString("-"))
        println(pattern2 replaceAllIn(str2, "java"))
    }
}