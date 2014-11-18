val nums = List(11, 20, 4, -9, 0, 6)
nums.foreach((x:Int) => println(x))

//　型推論してくれるので型を省ける
nums.foreach((x) => println(x))

// ()もいらない
nums.foreach(x => println(x))

// この場合はこれでいい
nums.foreach(println)

// プレースホルダーを使うと
nums.foreach(println(_))

// 式？全体を担うことも出来る
nums.foreach(println _)
nums.filter(_ > 4).foreach(println)
