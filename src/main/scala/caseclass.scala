object caseclass extends App{
  case class Cars(carId:Int,CarName:String,MPG:Double,weight:Double,gear:Int)
  val seqCars=Seq((100,"Merc",24.4,3.19,4),(101,"BMW",32.4,4.02,5),
    (102,"Fiat",33.2,3.2,4),(103,"Honda",26.5,3.0,4),(104,"Kia",28.8,2.6,null),
    (105,"VW",22.3,3.3,3))
  //val cars = seqCars.map(i => Cars(i._1,i._2,i._3,i._4,i._5.asInstanceOf[Int]))
  val cars=seqCars.map(i => Cars(i._1,i._2,i._3,i._4,i._5.asInstanceOf[Int]))
println(cars)
  val gear4=cars.filter(c => c.gear==4)
  println("4gear cars")
  println(gear4)
}
