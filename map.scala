val players = Map(
	1 -> "sakamoto", 2 -> "matsui", 3 -> "honda", 4 -> "kawaguti"
)
// 添字っぽいのは1から数える
println(players(3)) // honda
println(players.get(3)) // Some(honda)