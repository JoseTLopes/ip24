class Util {
     static double max(double a, double b) {
         return a > b ? a : b;
     }
  static double min(double x,  double y) {
    return x<y ? x : y;
}   
static boolean inOrder(int x, int y, int z) {
    return x<y && y<z; 
}
}