/*
PHPの場合
function add (x, y) {
        return x + y;
}
add(1, 2);
*/

def add (x: Int, y: Int): Int = {
    x + y
}
add(1, 2)

// 上のコードはapplyメソッドが省略されている。
add.apply(1, 2)

//　パラメーターを直接指定できる
def echo (a: String, b: String) = {
    println(a + b)
}
echo(b = "bbbb", a = "aaa") //　あまり使う機会を思いつかない
