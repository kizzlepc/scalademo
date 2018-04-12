object MatchDemo{
    def main(args:Array[String]){
        println(matchString(2))
    }

    def matchString(x:Int): String = x match{
        case 1 => "haha"
        case 2 => "heihei"
        case _ => "wuwu"
    }
}

for( i <- 1 to 10) 循环

(x:=>_)  传名
=(x:_)=>y 匿名函数