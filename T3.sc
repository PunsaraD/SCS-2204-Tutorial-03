// Question 01

def AreaDisk(r: Float): Double  = math.Pi * r * r
println(AreaDisk(5))


// Question 02

def Fahrenheit(celsius: Float) : Float = (celsius * 1.800f) + 32.00f
println(Fahrenheit(35))


// Question 03

def VolumeSphere(r: Float) : Double = 4.0f / 3.0f * math.Pi * r * r * r
println(VolumeSphere(5))


// Quesion 04

def TotalCost(copies: Int) : Float = copies * 24.95f
def DiscountPrice(totalcost: Float) : Float = totalcost * (1 - 0.4f)
def ShippingCost(copies: Int) : Float = copies > 50 match {
  case true => 50 * 3.00f + (copies - 50) * 0.75f
  case false => copies * 3.00f
}

def TotalWholeSaleCost(copies: Int) : Float = {
  val totalcost = TotalCost(copies)
  val discountPrice = DiscountPrice(totalcost)
  val shippingCost = ShippingCost(copies)
  discountPrice + shippingCost
}

println(TotalWholeSaleCost(60))


// Question 05

val TotalRuningTime = (8 * 2) + (7 * 3) + (8 * 2)
println(TotalRuningTime)