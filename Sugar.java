class Sugar extends Cookie{
  String cookieShape;
  boolean cookieDecorated;

  Sugar(){
    cookieShape ="";
    cookieDecorated = false;
  }

  Sugar(String aCookieShape){
    cookieShape = aCookieShape;
    cookieDecorated = false;
  }

  String getShape(){
    return cookieShape;
  }

  void setShape(String theShape){
    cookieShape = theShape;
  }
  
  void cutOut(String theCookieShape , int theCookieNum ){
    cookieShape = theCookieShape;
    setNum(theCookieNum);
    System.out.println(theCookieNum + " cookies were cut into " + cookieShape +".");
  }

  void decorate(){
    boolean theStatus = isReady();
    if (theStatus == true) {
      System.out.println("The cookies were decorated.");
    }
    else{
     System.out.println( "Make sure to bake the cookies first!"); 
    }

  }
}