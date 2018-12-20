object Greetings {
  def sayHello(name: String): String = {
    val useName = if (name == null) "my friend" else name
    s"Hello, $useName."
  }
}
