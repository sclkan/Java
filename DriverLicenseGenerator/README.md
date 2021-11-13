# Driver License Generator

For this project, I have created a program for the DMV to generate driver license numbers and store information about a driver.

## Project Outline

### Main Class
In the Main method:

- Create at least 3 objects of the driverLicense class using both overloaded constructors
- Call all of its mutator and accessor methods for testing purposes 
- Each object should hold data a different driver, each with a unique driver license number
- Create a copy of one of the objects using the copy constructor
- User interaction is optional.  

### driverLicense Class
Create a class called driverLicense that includes:

**Instance Variables**

These variables should hold these attributes of a single driver:

- Name
- Address
- Height
- Weight
- Hair Color
- Eye Color
- Driver License Number

**Static Variable**

licenseCount  - This static variable will be used to generate the License Number for each new instance.  This static variable should hold a count of each instance of the class that is created, starting with an initial value of 1000.

**Constructors**

- Copy constructor
- 2 Overloaded Constructors  - Include two overloaded constructors for this class.  Both of these constructors should do the following:
  - Count each instance that is created.  
  - Call the numberGenerator method to instantiate the driver license number instance variable.  
  - If the constructor has parameters, set the corresponding instance variable value(s) using the this construct.

**numberGenerator Method**

Instantiate the driver license number instance variable by concatenating the state abreviation and the value of the static variable licenseCount.   For example, if the licenseCount = 1001, and the state abreviation is CA, the license number should be set to CA1001.  Note: Because it does not need to be stored for the instance, use a local variable for the state abbreviation. 

**Accessor and Mutator Methods**

Create an accessor and mutator method for each of the instance variables.
