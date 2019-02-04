package example

import org.scalatest._

class RomansSpec extends FlatSpec with Matchers {
  "Romans" should "translate one" in {
    Romans.roman(1) shouldEqual "I"
  }

  "Romans" should "translate two" in {
    Romans.roman(2) shouldEqual "II"
  }

  "Romans" should "translate three" in {
    Romans.roman(3) shouldEqual "III"
  }

  "Romans" should "translate four" in {
    Romans.roman(4) shouldEqual "IV"
  }

  "Romans" should "translate 5" in {
    Romans.roman(5) shouldEqual "V"
  }
  "Romans" should "translate 6" in {
    Romans.roman(6) shouldEqual "VI"
  }
  "Romans" should "translate 7" in {
    Romans.roman(7) shouldEqual "VII"
  }
  "Romans" should "translate 8" in {
    Romans.roman(8) shouldEqual "VIII"
  }
  "Romans" should "translate 9" in {
    Romans.roman(9) shouldEqual "IX"
  }
  "Romans" should "translate 10" in {
    Romans.roman(10) shouldEqual "X"
  }
  "Romans" should "translate 11" in {
    Romans.roman(11) shouldEqual "XI"
  }
  "Romans" should "translate 12" in {
    Romans.roman(12) shouldEqual "XII"
  }
  "Romans" should "translate 13" in {
    Romans.roman(13) shouldEqual "XIII"
  }
  "Romans" should "translate 14" in {
    Romans.roman(14) shouldEqual "XIV"
  }
}
