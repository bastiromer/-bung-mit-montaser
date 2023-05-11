package test

import test.Messages

object main:

  @main def run: Unit =
    val msg = new Messages
    println(welcomeMessage())
    print(msg.printHallo())
    print(msg.printTestText())
    print("Bye")

  def welcomeMessage(): String =
    "Welcome to Test Repo!!"