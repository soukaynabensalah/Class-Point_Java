public class Point{
  private float a;
  private float b;

public Point() {
  this.a = 0;
  this.b = 0;

}

public float getA() {
  return a ;
}

public float getB() {
  return b;
}

public void setA (float a) {
  this.a = a;
}

public void setB (float b) {
  this.b = b;
}

public float distance(point point) {
  d = math.sqr(math.pow((this.a - point.a),2) + math.pow((this.b - point.b),2) );
  return d;
{

public float norm() {
  return math.sqr(math.pow(this.a,2) + math.pow(this.b ,2) );
  
    
  
