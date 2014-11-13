/*
PHPの場合
$array = ('hoge', 'foo', 'naze');
foreach ($array as $val) {
	echo $val;
}
*/

args.foreach(arg => println(arg))
//これでも動く
args.foreach(println)