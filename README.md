# INTRODUCTION TO JAVA SE
## 1. Introduction
### 1.1. What is Java?
Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.
### 1.2. History of Java
Java was developed by James Gosling in 1991 at Sun Microsystems. It was first released in 1995 as Java 1.0.

## 2. Java Environment Setup
### 2.1. Java Installation
#### 2.1.1. Windows
#####
1. Download JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install JDK.
3. Set the path of JDK.
4. Verify the installation.
#### 2.1.2. Linux
#####
1. Download JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install JDK.
3. Set the path of JDK.
4. Verify the installation.
#### 2.1.3. Mac OS
#####
1. Download JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install JDK.
3. Set the path of JDK.
4. Verify the installation.
### 2.2. Java Hello World Program
```java
class Simple{
    public static void main(String args[]){
        System.out.println("Hello Java");
    }
}
```
### 2.3. Java Basic Syntax
#### 2.3.1. Java Tokens
Java program is a collection of objects that communicate via invoking each other's methods. Every object has its own state, behavior, and identity. Objects communicate with each other by sending messages to request information, call methods, etc. Inside a Java source file, you can define one or more classes. Following are the types of tokens in Java:
#####
1. Keywords
2. Identifiers
3. Literals
4. Operators
5. Separators
#### 2.3.2. Java Keywords
Keywords are the reserved words in Java. We cannot use a keyword as an identifier (name of a variable, class, method, etc.). There are 53 keywords in Java. This number may vary from version to version.
#####
abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while
#### 2.3.3. Java Identifiers
All Java components require names. Names used for classes, variables, and methods are called identifiers. In Java, there are several points to remember about identifiers. They are as follows:
#####
1. All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
2. After the first character, identifiers can have any combination of characters.
3. A key word cannot be used as an identifier.
4. Most importantly, identifiers are case sensitive.
#####
Examples of legal identifiers: age, $salary, _value, __1_value.
#####
Examples of illegal identifiers: 123abc, -salary.
#### 2.3.4. Java Literals
A literal is a source code representation of a fixed value. They are represented directly in the code without any computation. Literals can be assigned to any primitive type variable. For example:
#####
byte a = 68;
#####
When you say:
#####
char a = 'A';
#####
Here, 'A' is a character literal.
#####
When you say:
#####
String a = "Hello World";
#####
Here, "Hello World" is a string literal.
#####
There are following types of literals in Java:
#####
1. Integer literals
2. Floating point literals
3. Character literals
4. String literals
5. Boolean literals
6. Null literals
#### 2.3.5. Java Operators
Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result. For example:
#####
int a = 10;
#####
Here, + is the operator that performs addition. Operand1 + Operand2 = Result
#####
Here, a and b are called operands and + is called the operator.
#####
Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups:
#####
1. Arithmetic Operators
2. Relational Operators
3. Bitwise Operators
4. Logical Operators
5. Assignment Operators
6. Misc Operators
#####
##### Arithmetic Operators
Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra. The following table lists the arithmetic operators:
#####
Operator | Description | Example
--- | --- | ---
+ | Adds two operands | A + B will give 30
- | Subtracts second operand from the first | A - B will give -10
* | Multiplies both operands | A * B will give 200
/ | Divides numerator by de-numerator | B / A will give 2
% | Modulus Operator and remainder of after an integer division | B % A will give 0
++ | Increment operator increases integer value by one | A++ will give 11
-- | Decrement operator decreases integer value by one | A-- will give 9
#####

## 3. Java Object & Classes
### 3.1. Java Object & Classes
#### 3.1.1. Java Object
An entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical (tangible and intangible). The example of an intangible object is the banking system.
#####
An object has three characteristics:
#####
1. State: represents the data (value) of an object.
2. Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
3. Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.
#####
For Example:
#####
Pen is an object. Its name is Reynolds, color is white, and price is Rs100. It represents the state of the pen. It also represents the behavior such as write, click, etc. Lastly, its identity can be defined by the brand and the cost of the pen.
##### Syntax
```java
class Student{  
 int id;//field or data member or instance variable  
 String name;  
  
 public static void main(String args[]){  
  Student s1=new Student();//creating an object of Student  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}  
```

#### 3.1.2. Java Class
A class is a group of objects that has common properties. It is a template or blueprint from which objects are created. It is a logical entity.
#####
A class in Java can contain:
#####
1. Fields
2. Methods
3. Constructors
4. Blocks
5. Nested class and interface
#####
##### Syntax
```java
class Student{  
 int id;//field or data member or instance variable  
 String name;  
  
 public static void main(String args[]){  
  Student s1=new Student();//creating an object of Student  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}  
```
#### 3.1.3. Java Object & Class Example: main within the class
```java
class Student{  
 int id;//field or data member or instance variable  
 String name;  
  
 public static void main(String args[]){  
  Student s1=new Student();//creating an object of Student  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}  
```
#### 3.1.4. Java Object & Class Example: main outside the class
```java
class Student{  
 int id;//field or data member or instance variable  
 String name;  
}
public static void main(String args[]){  
  Student s1=new Student();//creating an object of Student  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
```
## 4. Java Static Class
### 4.1. Java Static Class
#### 4.1.1. Java Static Class
A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.
#####
It can access static data members of outer class including private. Static nested class cannot access non-static (instance) data member or method.
#####
##### Syntax
```java
class A{  
  static class B{  
   void msg(){System.out.println("hello");}  
  }  
  public static void main(String args[]){  
  A.B obj=new A.B();//no need to create the instance of static nested class  
  obj.msg();  
  }  
}  
```




