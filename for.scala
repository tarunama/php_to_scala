/*
PHPの場合

$ary = count(args[1]);
for ($i = 0; $i < $ary; $i++) {
    echo $ary[$i];
}
*/

for (arg <- args)
    println(arg)

// これが関数型のプログラミングらしい
def ArgsPrintln(args: Array[String]) = args.mkString("¥n")
println(ArgsPrintln(args))

// 評価も出来る
val res = ArgsPrintln(args)
assert(res == "hoge¥nfoo")