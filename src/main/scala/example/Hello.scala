package example

import org.jboss.pnc.api.bifrost.dto.Line;

object Hello extends App {
  val line = Line.newBuilder()
    .id("10")
    .message("Enjoy to the full!")
    .build();
  println("The line: " + line.getMessage)
}
