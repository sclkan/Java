public class Main
{
   public static void main(String[] args)
   {
      //Object 1
      driverLicense driver1 = new driverLicense("Mary Smith","123 Main St",5.6, 140, "brown", "black"); 
      System.out.println(driver1.getName());
      System.out.println(driver1.getAddress());
      System.out.println(driver1.getHeight());
      System.out.println(driver1.getWeight());
      System.out.println(driver1.getHairColor());
      System.out.println(driver1.getEyeColor());
      System.out.println("License Number: " + driver1.getLicenseNum() + "\n");
      
      //Object 2
      driverLicense driver2 = new driverLicense("Jacob Williams","456 Main St",5.3, 130, "blonde", "brown"); 
      System.out.println(driver2.getName());
      System.out.println(driver2.getAddress());
      System.out.println("License Number: " + driver2.getLicenseNum()+ "\n");
   
      //Object 3
      driverLicense driver3 = new driverLicense(); 
      System.out.println(driver3.getName());
      System.out.println(driver3.getAddress());
      System.out.println(driver3.getHeight());
      System.out.println(driver3.getWeight());
      System.out.println(driver3.getHairColor());
      System.out.println(driver3.getEyeColor());
      driver3.setName("Sam Jones");
      driver3.setAddress("789 Main St");
      driver3.setHeight(6.3);
      driver3.setWeight(230);
      driver3.setHairColor("gray");
      driver3.setEyeColor("blue");
      System.out.println(driver3.getName());
      System.out.println(driver3.getAddress());
      System.out.println(driver3.getHeight());
      System.out.println(driver3.getWeight());
      System.out.println(driver3.getHairColor());
      System.out.println(driver3.getEyeColor());
      System.out.println("License Number: " + driver3.getLicenseNum()+ "\n");
      
      //Copy of object 1
      driverLicense driver4 = new driverLicense(driver1); 
      System.out.println(driver4.getName());
      System.out.println(driver4.getAddress());
      System.out.println("License Number: " + driver4.getLicenseNum());
   }
}

class driverLicense
{
   private String name, address, hrColor, eyeColor, licenseNum;
   private double height, weight;
   
   static int licenseCount = 1000;
   
   public driverLicense() //default constructor
   {
      this("John Doe","N/A",5.9, 180, "brown","brown");
   }
   
   public driverLicense(String name, String address, double height, 
         double weight, String hrColor, String eyeColor) 
   {
      this.name = name;
      this.address = address;
      this.height = height;
      this.weight = weight;
      this.hrColor = hrColor;
      this.eyeColor = eyeColor;
      
      numberGenerator();
      licenseCount++;
   }
   
   public driverLicense(driverLicense d) //copy constructor
   {
      name = d.name;
      address = d.address;
      height = d.height;
      weight = d.weight;
      hrColor = d.hrColor;
      eyeColor = d.eyeColor;
      licenseNum = d.licenseNum;
   }
   
   private void numberGenerator()
   {
      String state = "CA";
      licenseNum = state + licenseCount;
   } 
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getAddress()
   {
      return address;
   }
   
   public void setAddress(String address)
   {
      this.address = address;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   public String getHairColor()
   {
      return hrColor;
   }
   
   public void setHairColor(String hrColor)
   {
      this.hrColor = hrColor;
   }
   
   public String getEyeColor()
   {
      return eyeColor;
   }
   
   public void setEyeColor(String eyeColor)
   {
      this.eyeColor = eyeColor;
   }
   
   public String getLicenseNum()
   {
      return licenseNum;
   }
}