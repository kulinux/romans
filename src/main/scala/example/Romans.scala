package example

object Romans {

  val RomanI = "I"
  val RomanV = "V"
  val RomanX = "X"

  def times(ch: String, dec: Int ): String = {
    dec match {
      case 0 => ""
      case _ => ch + times(ch, dec - 1)
    }
  }

  def roman(x: Int): String = {
    if( x == 0 ) return ""
    if( x <= 3 ) return roman( x - 1) + "I"
    if( x > 5 && x <= 8 ) return roman( 5 ) + roman( x - 5 )
    if( x > 10 && x <= 14 ) return roman( 10 ) + roman( x - 10 )

    val resArr = Map(
      4 -> "IV",
      5 -> "V",
      9 -> "IX",
      10 -> "X",
    )
    return resArr(x)
    /*
    var res = RomanI
    if(x > 1) res = res + RomanI
    if(x > 2) res = res + RomanI
    if(x > 3) res = RomanI + RomanV
    res
    */
    /*
      if(x <= 3) times(RomanI, x)
      else if(x == 4) RomanI + RomanV
      else if(x == 5) RomanV
      else if(x == 6) RomanV + times(RomanI, 1)
      else if(x == 7) RomanV + times(RomanI, 2)
      else if(x == 8) RomanV + times(RomanI, 3)
      else ""
      */
        /*
      case 1 => "I"
      case 2 => "II"
      case 3 => "III"
      */
    /*
    if(dec == 1) "I"
    else if(dec == 2) "II"
    else if(dec == 3) "III"
    else ""
    */
  }
}
