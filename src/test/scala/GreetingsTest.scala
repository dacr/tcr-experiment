import org.scalatest._

class GreetingsTest extends FlatSpec with Matchers {

  "Greetings" should "say Hello" in {
    Greetings.sayHello("John") shouldBe "Hello, John."
  }

  it should "use my friend when the name is null" in {
    Greetings.sayHello(null) shouldBe "Hello, my friend."
  }

  it should "shout when the name is in uppercase" in {
    Greetings.sayHello("JEREMY") shouldBe "HELLO JEREMY!"
  }

  it should ""
}
