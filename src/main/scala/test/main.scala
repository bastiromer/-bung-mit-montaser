package test

import test.Messages

object main:

  @main def run: Unit =
    println(welcomeMessage())
    val msg = new Messages
    print(msg.printHallo())
    print(msg.printTestText())

  def welcomeMessage(): String =
    "\u001B[31mWelcome to Test Repo!!\u001B[0m\n"