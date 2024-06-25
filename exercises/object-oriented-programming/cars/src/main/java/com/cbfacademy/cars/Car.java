package com.cbfacademy.cars;

public class Car {
    
    /*Classes
    make
    model
    year
    colour*/
    //public class make { - this is incorrect
     // e.g final static String SPECIES = "Human";
    // This is a property of the class
       private String make;
    
    //public class model { - this is incorrect
      private String model;
    
    //public class year { - this is incorrect
        // this should be a wrapper not int
        private Integer year;

    //public class colour{ - this is incorrect
        private String colour;
    
   //public Car(String make, String model, String colour, int year) - constructor that accepts parameters representing the make, model, colour and year of the car
    // This is a constructor
   public Car(String make, String model,String colour, int year) {
       this.make = make;
       this.model = model;
       this.year = year;
       this.colour = colour;
    }
    
    // 2nd part
    public String getMake(){
     return  this.make;
    }
    public String getModel(){
     return  this.model;
    }
    public int getYear(){
        return this.year;
    }
    public String getColour(){
        return this.colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
 
   //Last part to print the results to the terminal
   // this is not right
   //System.out.println("a "+"car1.colour " + "car1.make " + "from "+ "car1.year");
   public String getdetails(){
   // return String.format("colour,make,model,year");
   return "Car Details: "
   }
       // 3rd part - this is no public static
       Car car1 = new Car("Volvo","V40",2012,"blue");
       Car car2 = new Car("Porsche","Panamera",2009,"red");
       Car car3 = new Car("Audi","A3",2018,"grey");
}

