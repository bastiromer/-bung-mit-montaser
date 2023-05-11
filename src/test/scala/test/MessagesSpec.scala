package test

import org.scalatest._

class MessagesSpec extends flatspec.AnyFlatSpec with matchers.should.Matchers {
  "A Message" should "print a hello text" in {
    val msg = new Messages
    msg.printHallo() should be("Hello world!\n")
  }

  it should "print a test text" in {
    val msg = new Messages
    msg.printTestText() should be("this is a test text\n")
  }

}
