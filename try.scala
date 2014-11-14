//　例外を投げる
throw new illegalArgumentException
//　例(例外はNothing型を返す）よくわからない
val prime = 
    if (num % 2)
        println("It's prime")
    else
        throw new Exception("not prime")
