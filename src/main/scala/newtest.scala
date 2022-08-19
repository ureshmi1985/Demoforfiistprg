object newtest  extends App{

      def add(a:Int)(b:Int):Int ={
            a+b
      }

      val a=add(10)(10)
      println(a)
      var b=add(10)_
      var c=b(20)
      println(c)

}
