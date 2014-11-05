/*
PHPにはsetっぽいのはたぶんない
*/

// ここ import Set　でもいい
import scala.collection.mutable.Set

var hoges = Set("hoge", "foo", "tarunama")
// ここはただの略記法
hoges += "sakeharami"
println(hoges.contains("foo")) // true

val players = Set("matsui", "sakamoto", "nagashima")
// set の += メソッドを使用している
players += "murata"
println(players)