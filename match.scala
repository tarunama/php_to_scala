/*
 他言語でいうところのSwitch文
 break;書く必要なし。あらゆる型を取れる
*/
val arg = if (args.length > 0) args(0) else ""
//　処理が分散されて良い
val m =
    arg match {
        case "foo" => "foo"
        case "hoge" => "hoge"
        case "var" => "var"
        case _ => "placeholder"
    }
println(m)
