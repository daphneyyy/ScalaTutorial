package chapter01

class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

object Student {
  val school: String = "sc"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 25)

    alice.printInfo()
    bob.printInfo()
  }
}
