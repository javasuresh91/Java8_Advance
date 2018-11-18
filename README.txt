Default and Static Methods:
	-We can have N number of default and static and abstarct method in a interface
	-Abstract methods need to be overwrite in the Implementation Class.
	-Default methods either can be overwite or nor, but the method body is must in the interface.
	-Static methods cannot overwrite in tne implementation classes and the method body is must.
	-If two interface is implemented in a class and it has same default method signature, then the compiler force to overwrite the default method and make to specify the exact default method calling by "super" keyword.
Functional Interface
	-It should have only one abstract method and it can also have N number of object class abstract method.
	-It can have N no of default and static methods , but it should have one abstract methods.
	-We cant overwrite the object class default or static methods.
	-we can extend the functional interface into another functional interface, but overall it should have only one abstarct methods, either in parent nor child interface.
	-Annotate @FunctionalInterface is not a must, but it is good pratice to tell complier this interface should follow the functional interface terms. 
	-Runnable and Comparator is a good example of Funtional Interface.
Lambda Expression
	-It is written upon the functional interface, In other words lambda is created with the help of functional interface.
	-It can be pass as an method arguments.
	-It can be have multiple parameter and return type.
	-It is a replacement of Anonymous class
	-Runnable and comparator is a good example for writing the lambda expression
ForEach
	-Iteration is faster
	-It has different implementation in Collection(List,Set),map,Stream and etc,
	-List,Stream use ForEach accept Consumer
	-Map use ForEach accept BiConsumer
TypeInferance
	-Automatically Compiler can judge the return type of the Functional interface method and argument type of the functional interface it is called as TypeInference.
Method Reference
	-Static Method Refernce : Static method is called by Class name directly and followed by Double Colon(::) and followed by static method. This method must be assigned to a variable. As usual this can be access from static method/block/any static block.
	-Constructor Reference : Constructor is called by the Class name(i.e Constructor name) and followed by double colon(::) and followed by the new operator.This constructor implementation should be a single argument constructor.This constructor reference will return the Function Interface i.e Function<Argument type, return type>. "Argument type means the type of the argument of the Constructor and return type will the Class name because it is constructor reference"
	-Instance(eg:getter and setter) method Reference : This normal method can be called by using the Class name and followed by the double colon and the method name and argument and return type rules will be same as Constructor Reference,also we can call the method by the object/instance of the corresponding class.
This Keyword
	-"This"	keyword is used to represent the current instance of a class or interface or Anonymous in java and also lambda is a another side of the interface so we can use "this" inside the lambda implementation in the non-static block.
Exception 
	//TODO
Stream
	-Creating a Stream in Four ways 
	-1. Empty stream 
	-2.Passing an array object to stream() in the Arrays class(i.e.. Arrays.stream(<array object>)), in this we can pass the starting and ending position of the array which need to be create a stream(i.e.. Arrays.stream(<array object>,<startingIndex of the array,ending index>)) 
	-3.Passing an Array Object to of() method in the Stream class(i.e.. Stream.of(<array object>)).
	-4.accessing the stream() method in the Collection(i.e.. list.stream(),set.stream())
	-Stream use the two different methodologies to handle and process the stream object, they are Intermediate and Terminate methodologies.
	-Intermediate Methods which return the Stream<T> Objects after processing the stream object and we can use N no of Intermediate methods.
	-Terminate Methods will return any type and end the stream object processing and we can use only one Terminate Method at the end.
	-We can perform the Iteration,Filteration and matching operation on the elements of the Stream Object.
	-Filteration is used to filter the elements in the Stream object, based on the implementation give into it. it uses the Predicate Interface as a argument, it is a functional interface so we need to give our logic and also it return stream object so it is one of the Intermediate Method.
	-Matching is used to validate the elements in the stream object, it has methods like anyMatch(),allMatch() and noneMatch(), it also accept predicate interface as a argument. these are examples of Terminate Methods.
	
	

	