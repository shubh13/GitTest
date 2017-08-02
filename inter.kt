interface WakeUp {
  fun WakeUpCall()
}

class AlarmClock : WakeUp {
  override fun WakeUpCall() {
    println("Alarm woke you up")
  }
}

class System(clock : WakeUp) : WakeUp by clock

fun main(args : Array<String>) {
  val clock = AlarmClock()
  System(clock).WakeUpCall()
}
