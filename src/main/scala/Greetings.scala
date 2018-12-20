object Greetings {
  def sayHello(givenName: String*): String = {
    givenName.toList match {
      case null::Nil => s"Hello, my friend."
      case name::Nil if name.forall(_.isUpper) => s"HELLO $name!"
      case name::Nil => s"Hello, $name."
      case names => s"""Hello, ${names.init.mkString(", ")} and ${names.last}."""
    }
  }
}
