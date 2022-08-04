class ArrayOrder {
  // Main Function
  public static void main(String[] args) {
    int arr[] = { 70, 90, 10, 80, 60, 50, 30, 40, 20 };
    /*
     * 70,90 f 10,80 f 60,50 t 30,40 t 20
     * 70  90,10 t 80,50 t 60,30 t 40,20 t
     * 70,10 t 90,50 t 80,30 t 60,20 t 40
     * 10  70,50 t 90,30 t 80,20 t 60,40 t
     * 10,50 f 70,30 t 90,20 t 80,40 t 60
     * 10  50,30 t 70,20 t 90,40 t 80,60 t
     * 10,30 f 50,20 t 70,40 t 90,60 t 80
     * 10  30,20 t 50,40 t 70,60 t 90,80 t
     * 10,20 f 30,40 f 50,60 f 70,80 f 90
     * End --
     * Result :
     * 10,20,30,40,50,60,70,80,90
     */
    // Array Arrangement
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] < arr[j]) {
          int x = arr[i];
          arr[i] = arr[j];
          arr[j] = x;
        }
      }
    }
    // Print First 3 Variables From Array
    for (int i = 0; i < 3; i++) {
      System.out.println(i + 1 + " Number Element Is " + arr[i]);
    }
  }
}