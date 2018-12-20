import org.scalatest._

class GreetingsTest extends FlatSpec with Matchers {

  "Greetings" should "say Hello" in {
    Greetings.sayHello("John") shouldBe "Hello, John."
  }

}
