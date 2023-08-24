# INTRODUCTION TO JAVA SE
## 1. Introduction
### 1.1. What is Java?
Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.
### 1.2. History of Java
Java was developed by James Gosling in 1991 at Sun Microsystems. It was first released in 1995 as Java 1.0.
### 1.3. Features of Java
#### 1.3.1. Simple
Java is easy to learn and its syntax is quite simple, clean and easy to understand.
#### 1.3.2. Object-Oriented
Java is an object-oriented programming language. Everything in Java is an object. Object-oriented means we organize our software as a combination of different types of objects that incorporates both data and behavior.
#### 1.3.3. Portable
Java is portable, which means that it can execute on any platform. Java achieves portability by compiling the code into bytecode which is then interpreted by the JVM (Java Virtual Machine).
#### 1.3.4. Platform Independent
Java is platform independent, which means that it can run on any platform that has a JVM installed in it. JVM converts the bytecode into machine language and executes it.
#### 1.3.5. Secured
Java is secured because it doesn't use explicit pointers. Also, Java programs run inside a virtual machine sandbox that cannot access the host operating system.
#### 1.3.6. Robust
Java is robust because it uses strong memory management. There is a lack of pointers that avoids security problems. There is automatic garbage collection in java which runs on the Java Virtual Machine to get rid of objects which are not being used by a Java application anymore.
#### 1.3.7. Architecture-neutral
Java is architecture-neutral because there are no implementation-dependent features, for example, the size of primitive types is fixed.
#### 1.3.8. Interpreted
Java is an interpreted language. It determines the errors while the program is running. This makes Java high performing as compared to other programming languages.
#### 1.3.9. High Performance
Java is faster than other traditional interpreted programming languages because Java bytecode is "close" to native code. It is still a little bit slower than a compiled language (e.g., C++).
#### 1.3.10. Multithreaded
Java is multithreaded. It allows us to write programs that do many things simultaneously. Threads can run independently, performing different tasks in the same program.
#### 1.3.11. Distributed
Java is distributed because it facilitates users to create distributed applications in Java. RMI and EJB are used for creating distributed applications. This feature of Java makes us able to access files by calling the methods from any machine on the internet.

### 1.4. Java Virtual Machine (JVM)
JVM is a virtual machine that provides a runtime environment to execute Java bytecode. It is the specification that provides a runtime environment in which Java bytecode can be executed.
### 1.5. Java Development Kit (JDK)
JDK is a software development kit that provides a development environment to develop applications in Java. It is the superset of JRE (Java Runtime Environment) and contains everything that JRE has. It contains a JRE to execute Java programs and tools to develop Java applications.
### 1.6. Java Runtime Environment (JRE)
JRE is an environment that provides a runtime environment in which Java bytecode can be executed. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.

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
