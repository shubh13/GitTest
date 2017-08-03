class Greetings(val name : String = "Shubhadeep") {
  fun greet() {
    println("Hello ${name}")
  }
}

fun main(args : Array<String>) {
  Greetings().greet()
}
