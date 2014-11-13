/*
PHPの場合

$ary = count(args[1]);
for ($i = 0; $i < $ary; $i++) {
    echo $ary[$i];
}
*/
// Scalaの場合
for (arg <- args)
    println(arg)

// これが関数型のプログラミングらしい
def ArgsPrintln(args: Array[String]) = args.mkString("¥n")
println(ArgsPrintln(args))

// for式でフィルタリング
val files = (new java.io.File(".")).listFiles
// とてもしっくりこない
for (
	file <- files
	if file.isFile
	if file.getName.endsWith(".php")
) println(file)

// 評価も出来る
val res = ArgsPrintln(args)
assert(res == "hoge¥nfoo")