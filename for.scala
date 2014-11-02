/*
PHPの場合

$ary = count(args[1]);
for ($i = 0; $i < $ary; $i++) {
    echo $ary[$i];
}

*/

for (arg <- args)
    println(arg)
