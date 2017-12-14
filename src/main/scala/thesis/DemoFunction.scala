package main.scala.thesis

import java.io.File

class DemoFunction {
  def calculate(): String = {
    return new File(".").getAbsolutePath()
  }
}