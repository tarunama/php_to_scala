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

// 評価も出来る
val res = ArgsPrintln(args)
assert(res == "hoge¥nfoo")

// for式でフィルタリング
val files = (new java.io.File(".")).listFiles
// しっくりこない
for (
	file <- files
	if file.isFile
	if file.getName.endsWith(".php");
) println(file)
// 重複する計算はfor文内でbindさせる。セミコロンが邪魔なときは{}使う
val filesHere = (new java.io.File(".")).listFiles

def filelines(file: java.io.File) =
	scala.io.Source.fromFile(file).getLines().toList
// ここら辺不安
def aryFor(args: String) =
	for {
		file <- filesHere
		if file.isFile
		// 重複部分をバインド
		fileName = file.getName
		if fileName.endsWith(".php")
		if fileName.endsWith(".scala")	
	} println(file)
