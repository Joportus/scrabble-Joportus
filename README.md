# Scrabble

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

Interactive graphic programming language heavily inspired by 
[Scratch](https://scratch.mit.edu).
This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/), 
and aims purely to be used with the purpose of teaching in the context of the course 
_CC3002 Metodologías de Diseño y programación_ of the 
[_Computer Sciences Department (DCC)_](https://www.dcc.uchile.cl) of the 
_University of Chile_.


  First of all, I created classes for each Scrabble data type. One class for Scrabble integer, another for Scrabble Strings, binary, float and boolean.
There were two methods that all data types shared. This methods were transform to string() and sum_to_string().
I created an abstract class named type so that all data type classes inherit from it. I also created an interface Itypes, where I could declare this common methods.
Then I had to implement transformation methods for all classes. transformations have certain restrictions, so not all scrabble types can transform to all scrabble types.
Naturally not all transformation methods were common for all classes. This only happened with transform to string().
We need interfaces so we can safely implement methods that only some class objects can access to. But first lets talk about operations.
Double dispatch was an important tool to help us implement operations. For each operations we had a method specifically targeted towards a data type:
Using this each time we called an operation in a for a given object. For example each time you call integers.operate(floats), it tells floats to use his operate_to_integers(integers) method. So the float object manages how the operation would go. We do this for each operation.
To implement all this methods, it was necessary to create interfaces for classes who shared certain methods. So no class implements a method it wont or cannot use.
I implemented an Int_Float interface, to hold all common methods that scrabble integers share with scrabble floats. I implemented an Itypes interfaces for methods that all classes
shared. an Slogical interface, for all methods only binary and booleans used. and finally an Inumber interface, for methods floats, integers and binary shared.
Regarding to tests, I created a test class for each data type class and for each interface.

  For the second part of the proyect, I had to eliminate interfaces so that illegal operations can now be done, but they now return a NullType object.
I created a NullType class, so there wouldnt be any problem doing compound illegal operations (operating with a null). 
  For the AST construction, I created classes for each operation. Divided operations by number of operands so I created two abstract classes. One that 
sets a constructor that creates nodes with only one child (operations with just one operand) and another for nodes with two children.
each operation node when evaluated, recursively evaluates the child nodes, if there are any. This allows an AST to be evaluated in inorder traversal.
  To optimize memory, I created factory classes for each Itype. When a factory creates an object, it checks if it was already created. This can be done with a hash map.
If it wasnt created, we create it. If its already in the hashmap, it returns it.
I also made sure that only one factory can be created, because creating more than one factory would be a waste of memory.
  I did some minor changes on the operation methods for part 1 of the project. For operation methods, I returned the result as a new object. I modified this so the methods
would return an object created by the respective factory, so I could further optimize memory use. 

  For the third and final part of this project I first needed to create variables. I created a variable class that implemented the treeNode interface, which means it can be part of an AST. this class uses a hashmap that has Strings as keys and Scrabble types as values. This way each time a variable is created and evaluated it is stored in the hashmap for later use.
  After this I needed to implement the java comparable interface and compareTo() methods in the scrabble types classes. I used double dispatch to differentiate behaviours between different types and created an SNumber interface so I could compare integers, floats and binary numbers which were most important for the next part.
  I then created classes for comparison operations between variables. This way it would be easier to establish if a variable is greater, lesser or equal to another variable.
 This was very useful to implement the final part, the if and while operations.
 I created If and While classes which are part of the AST and receive trees as parameters.
 I also created visitors (one for While and one for If) that were in charge of evaluating the if and while operations, but the evaluation method remains in each class, and only calls for each visitor to do  its job.
 I created a visitor interface for future extensibility, this interface is implemented by both visitors.
 I also needed to create classes for variable modifications(part of our AST) so each time a variable is modified in a while loop, it is correctly updated and stored.
 All this changes allows the application to create algorithms that use while and if statements. I tested the euclid algorithm which computes a the greatest common divisor of two numbers.


