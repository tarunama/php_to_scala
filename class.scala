class sumAculator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

val acc = new sumAculator
println(acc.add(2))