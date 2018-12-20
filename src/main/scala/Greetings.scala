object Greetings {
  def sayHello(givenName: String): String = {
    givenName match {
      case null => s"Hello, my friend."
      case name if name.forall(_.isUpper) => s"HELLO $name!"
      case name => s"Hello, $name."
    }
  }
}
