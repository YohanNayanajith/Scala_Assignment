object book_price extends App {
  def percentage(price:Double):Double = price*0.6

  def shipping(no_of_copies:Int):Double= {
    var sum:Double = 0;
    if(no_of_copies < 50 && no_of_copies > 0){
      sum = no_of_copies*3;
    }
    if(no_of_copies > 50){
      var copy:Int = no_of_copies - 50;
      sum = sum + copy*0.75;
    }
    return sum;
  }
  def price_of_books(no_of_copies:Int):Double= {
    var book_price1:Double = percentage(24.95);
    book_price1 = book_price1 * no_of_copies;
    var whole_price:Double = book_price1 + shipping(no_of_copies);
    return whole_price;
  }
  println(price_of_books(60));
}
