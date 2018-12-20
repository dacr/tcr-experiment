object Greetings {
  def sayHello(givenName: String): String = {
    givenName match {
      case null => s"Hello, my friend."
      case name => s"Hello, $name."
    }
  }
}
