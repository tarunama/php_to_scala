// 変数を取り込んだ時に値が決まる関数をclosureと呼ぶ
var more = 2
val closure = (x: Int) => x + more
closure(1) // 3
closure(3) // 5

// closureを使うとコードの重複を削除できる
 
