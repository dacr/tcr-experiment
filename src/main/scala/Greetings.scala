object Greetings {
  def sayHello(givenName: String*): String = {
    Option(givenName).map(_.toList) match {
      case None => s"Hello, my friend."
      case Some(null::Nil) => s"Hello, my friend."
      case Some(name::Nil) if name.forall(_.isUpper) => s"HELLO $name!"
      case Some(name::Nil) => s"Hello, $name."
      case Some(aname::bname::Nil) => s"Hello, $aname and $bname."
      case Some(names) => s"""Hello, ${names.init.mkString(", ")} and ${names.last}."""
    }
  }
}
