/*
PHPの場合
$i = 0;
while ($i < strlen($args[1])) {
	if ($i !== 0) {
		echo ' ';
	}
	echo $arg[$i];
	$i += 1;
}
*/

var i = 0
while (i < args.length) {
	if (i != 0)
		print(" ")
	print(args(i))
	i += 1
}
println()