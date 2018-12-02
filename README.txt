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
	-Creating a Stream in Five ways 
	-1. Empty stream 
	-2.Passing an array object to stream() in the Arrays class(i.e.. Arrays.stream(<array object>)), in this we can pass the starting and ending position of the array which need to be create a stream(i.e.. Arrays.stream(<array object>,<startingIndex of the array,ending index>)) 
	-3.Passing an Array Object to of() method in the Stream class(i.e.. Stream.of(<array object>)).
	-4.accessing the stream() method in the Collection(i.e.. list.stream(),set.stream())
	-5.Stream can be build using builder().This static method can be called by using class name(Stream.builder()) and by using add() method we can add value(Stream.builder.add(5).add(" Hai").add(null).build()) and accept generic values. To Builde particular type Stream we need to declare as Stream.<String>builer().add("5").add("hai)".	
	-Stream use the two different methodologies to handle and process the stream object, they are Intermediate and Terminate methodologies.
	-Intermediate Methods which return the Stream<T> Objects after processing the stream object and we can use N no of Intermediate methods.
	-Terminate Methods will return any type and end the stream object processing and we can use only one Terminate Method at the end.
	-We can perform the Iteration,Filteration and matching operation on the elements of the Stream Object.
	-Filteration is used to filter the elements in the Stream object, based on the implementation give into it. it uses the Predicate Interface as a argument, it is a functional interface so we need to give our logic and also it return stream object so it is one of the Intermediate Method.
	-Matching is used to validate the elements in the stream object, it has methods like anyMatch(),allMatch() and noneMatch(), it also accept predicate interface as a argument. these are examples of Terminate Methods.
	-map() is a special function which is used process the elements in the Stream object and return the desire(different type) type of Stream Object.
	-flatMap() is also a special function which is used to process the Collection Object inside the Stream Elemnts
ParallelStream
	-It is like a Stream , but it run Async(parallel multiple thread)to process the elemets in the concern object.
	-Mostly all the action can be performed on it same as Stream.
	-We can check the Stream Object is a Parallel or no by using isParallel().
	-We can again convert the Parallel Stream to Normal/Sequential Stream by using sequential()
Infinite Stream
	-Infinite Stream object	means, the stream can be institated as infinite using the iterate method in the Stream class(EX_015_InfiniteStreamAPI).
	-We should pass two parameter as base value and expression, which provide an infinite data Stream elements.
	-Infinite Stream object can be create using by generate method also, it accept the Supplier Interface as a argument, so we can give our own implementation to create a infinite Stream object(EX_016_StreamInAdvanceConcept.StreamGenerateAPI.java)
	-We can limit/control/stop the infinite stream by any Terminate Method like limit,anyMatch,count and etc. it is an eager approach.
	-For instance, limit() take a parameter which is define the iteration count of the iteration and accessed by the Stream Object.
	-For each iteration, the value of the pervious iteration will get append to the current value.
	-In JDK 8, There are infinte value provider like UUID and etc
File Stream
	-File can be Converted/readby as stream Object using the java.nio package
	-Path.get(<File Name with the path>) read the file from the mentioned path and it return the path object
	-Files.line(<Path Object>), this line method is used to read the content of the file and gives as Stream element of each line in the File.
	-Files.line(<Path Object>,<Charset code>)
Pipeline Stream
	-Pipeline means, Perform the Sequence operation on the elements, It has three parts 1.Source,2.Intermediate operation and terminal operation
	- As we already known we can use N no of intermediate methods and lastly one terminal methods on the Stream Object
	-In simple words, the chain of Stream operation is called as Pipeline(EX_016_StreamInAdvanceConcept.StreamPipelineAPI.java)
Primitive Stream
	-Stream accept onlt the Generic Type not int,long and etc
	-But there is a some Class called IntStream,LongStream and etc, which accept the Primitive values
	-Refer in EX_016_StreamInAdvanceConcept.StreamPrimitiveAPI.java
Reduce
	-reduce(<firstArgu,secondArgu>) is used to implement different functionality/behaviour on the base value/data(firstargument to the reduce method)
Collect
	- It is one of the reduction mechanism
	- collect(<Collectors Object>) is used to convert the Stream object to Collection Object.
	- This collect method can be used after or before Intermediate operation on the Stream Elements
	- There are N no of Collector object avaliable in the JDK 8, which can be send as arguments to the collect method.(i.e. collect(Collectors.toList()))
	- On the Stream Object We can Perform operation like
		*Conversion TO Collection - Collectors.toList() and etc
		*Converting Stream Elements to Single Strin - Collectors.joining() and etc
		*Numerical operation like Summing,Averaging - averaging***() ,summarizing***(),summing***() and etc
		*Grouping the Elelments - groupingBy(****) and etc
		*Grouping the Elelments based on conditions - partitioningBy(***)	
LocalDate
	-Refer the EX_017_DateAPI.LocalDateAPI.java
	-Period is a class used to manipulate the date, month and etc which is related only to the LocalDate Object
	-ChronoUnit also do the same operation on the LocalDate Object
	-For more Period and ChronoUnit Refer EX_017_DateAPI.LocalDateUsingPeriod.java
LocalTime
	-Refer the EX_017_DateAPI.LocalTimeAPI.java
	-Duration is a class used to manipulate the Hours, mins and etc which isrealted only to the LocalTime object
	-ChronoUnit also do the same operation on the LocalTime Object 
	-For more Duration and ChronoUnit Refer EX_017_DateAPI.LocalTimeUsingDuration.java
LocalDateTime
	-It is Combination of LocalTime and Localdate API with lot of Factory and overlaoded methods to perform different Operation
	-Refer the EX_017_DateAPI.LocalDateAndTimeAPI.java
	-LocalDateTime.ofInstant(<Date/calendar object>,<ZoneId>) to convert the java.util.Date and java.util.Calendar object to java.Time.* object.
	-By Converting we can extract the LocalDate and LocalTime.
	-Refer the EX_017_DateAPI.CompatibilityOldDateAndCalender.java	
	-DateTimeFormatter is used to format the date and time as custom format
	-Refer the EX_017_DateAPI.DateAndTimeFormat.java	
ZonedDateTime
	-Refer the EX_017_DateAPI.ZonedDateTimeAPI.java
	