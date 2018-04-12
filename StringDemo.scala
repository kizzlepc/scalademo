object StringDemo{
    
    def main(args:Array[String]){
        var buf = new StringBuilder
        //+= 加Char
        buf += 'a'
        //++= 加String
        buf ++= "bcdef"
        println(buf.toString)
    }
}