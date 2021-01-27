class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total;
    double blue, brown, green, orange, red, yellow; 
    double sum; 

    total = (55*11);
    blue = (total*.24);
    brown = (total*.13);
    green = (total*.16);
    orange = (total*.2);
    red = (total*.13);
    yellow = (total*.14);
    sum = (blue + brown + green + orange + red + yellow);


 

    System.out.println("Total: " + total);  
    System.out.println("Blue: " + blue);
    System.out.println("Brown: " + brown);
    System.out.println("Green: " + green);
    System.out.println("Orange: " + orange);
    System.out.println("Red: " + red);
    System.out.println("Yellow: " + yellow);
    System.out.println("Sum: " + sum);

    if (blue>brown && blue>orange) {System.out.println("Blue over Brown and Red over Orange");} 

    if (brown<=green) {System.out.println("Brown is less than or equal to Green");}

    if (sum==total) {System.out.println("Numbers match");}

    
    
    
     

  }
}