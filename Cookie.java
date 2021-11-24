class Cookie {
  private int bakeTime;
  private int bakeTemp;
  private int numCookies;
  private boolean cookieReady;

  Cookie() {
    bakeTemp = 0;
    bakeTime = 0;
    numCookies = 0;
    cookieReady = false;
  }

  Cookie(int aBakeTemp, int aBakeTime, int aNumCookies, boolean aCookieReady) {
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    numCookies = aNumCookies;
    cookieReady = false;
  }

  boolean isReady() {
    return cookieReady;
  }

  void setNum(int theNum) {
    numCookies = theNum;
  }

  void bake(int theBakeTemp, int theBakeTime) {
    bakeTemp = theBakeTemp;
    bakeTime = theBakeTime;

    cookieReady = true;

    System.out.println(numCookies + " cookies were baked at " + bakeTemp + " degrees F for " + bakeTime + " minutes.");
  }

}