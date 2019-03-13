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
	-Need to explore more
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
Optioanl
	-It used to handle the object which throws Null Pointer Exception(NPE).
	-With this , we can write the code without error-prone boilerplate code and checking the object is null or not.
	-Optional is container, which return the T(any Class Objects) object if the T oobject is not NULL. If the T is null it will do predefined operation instead of throwing NPE.
	-Optional Instance is created by using empty(),of(**),ofNullable(**) and etc.., which is a static methods which can be accessed by Class name(Optional)
	-With the help of Optioanl we can do lot of Operation of NULL objects by giving defalut value to the Object, handling the object and etc.
	-Refer the EX_018_OptionalAPI
Base64,Encoder,Decoder
	-We can encode the basic,URL,MIME type of data and we can decode it again	
	-Refer the EX_019_EncodingDecoding
Functional Interface and its Default methods
	-Refer EX_020_FuntionalInterfaces and EX_022_default-methods-funtional-interface
Concurrency API
	-HashMap
		-Is sync using sync methods in Collection, so it reduce the performance of the data structure
		-Is not thread safe
		-It is failfast
	-ConcurrentHashMap(EX_023_Concurrency_Part_One)	
		-Is Thread safe - fit for Multi-thread
		-Is sync using bucket functionality
		-It is failsafe
		-Since Java 8
			-Some pool methods are avaliable to perform ForkJoinPool
			-Three kinds of Parallel Operation can be do  forEach,search,reduce
			-Each of the operation is methos overloaded by keys,values and key-values as method arguments
			-These all method will accept the first argument as parallelism-Threshold as a parameter.(paralle executor)
	-Completable Future API(EX_024_Concurrency_Part_Two) 
		-Future interface is added in java 5 to perform Asynchronous computation, but it does not have any method which supports for combine computation and handling errors
		-CompletableFuture class is introduced in java 8, it implements Future and CompletionStage interface to handle all the drawback of Async computation.
		-It has multiple static methods to create instance of CompletableFuture  like completabledFuture(),runAsync(), supplierAsync() and etc
		-Processing Result of Completable Future
			-Methods like thenApply(),thenAccept() and thenRun() will perform the operation on the result.
		-Combining/Chaining the Completable Future
			-thenCompose(),thenCombine() and thenAcceptBoth() will perform the chaining operation Future object
		-Parallel Execution of Completable Future
			-allOf() method uses of parallel
		-Accumulator Classes(EX_025_Concurrency_Part_Three) 
			-Need to explore  more
		-ForkJoinPool (EX_026_Concurrency_Part_Four)
			-This class is in JDK from 1.7
			-But in 1.8 they have added some common pool methods in that
			-which is used in the parallel Computing like Stream adn completableFuture
			-ForkJoin implements the 'Work-Stealing Algorithm'(It ensure the no CPU is idle) to perform in the task in the seperate thread.
			-Work-Stealing Algorithm means, the CPU which has idle processor will steal the task from the busy processor
			-ForkJoin means, the single task is divided into multiple sub-task it is called as Fork and the result is returned by sub-task to it corresponding task it is called as Join
			-Need to explore more
String Class Enhancements
	-String Joiner
		-It is a utility calsses which is used to perform action on the string, present in the util package.
	-String Class
		-It has some useful methods like join of overloaded methods
File Enhancement(EX_028_FileConcept)
	-Files.list(<PATH_DIR>)	used to read the files and folders into the specific path 	
	-Files.line(<PATH_DIR>), we can read the file content line by line and do operation like search,occurance, filter and etc
	-Files.find(<Path>,<max_depth>,<mathcer>,<option>) used to search the file in a directory
		-<Path> : path object of the Directory
		-<max_depth> : How much depth need to go for the level of the directory search, INteger
		-<mathcer> : based on the given condition the search will carry,BiPredicate
		-<option> : it is vars arg. it is optional
	-Files.readAllLine(<Path>,[<Charset>]) used to read the lines in the file
	-Files.newBufferedReader(<Path>,[<Charset>])used to read the lines in the file, it will be some faster
	-Files.write(..) used to write the content into the file
Compartor Enhnacement(EX_029_CompartorConcept)
	-Before java7, We use to impletement the Compartor by 
		1.Creating a class which implement the Comparator<T> with overrided method "compare(..)" and will use the instance of the class in the Collections.sort(<Collection Object>,<Compartor Object>)
		2.We can have direct implementation by the anaymous inner class into the Collections.sort(<Collection Object>,<inner class implementation>)
	-After java 8, we can use to implement by 
		1.Lambda Expression without extra class or anaynous class
		2.list.sort(<Comparator Object>), instead of Collections.sort(..) we can use the sort method in the list interface which accept the Comparator OBject itself
		3.comparing method which is used to sort the object. it has overloaded method to perform the sorting function.This method is a static method which is present in the Compartor Interface itself, so we can access it directly by the Interface name
		4.comparing method comes with the specific type of comparing like int,long and double. comapringInt(..),comapringLong(..) and comapringDouble(..)
		5.thenComparing method is used to do sort the object as nested, for example the sorted order of the object will be the input for another sorting methodology.
		6.naturalOrder comparing methods which allow to sort the object, which has its own sorting order implicitly.
		7.nullFirst(..) and nulllast(..) used to sort the null values in the object.
		8.reserve() method is used to get the reserve order of the sorted, so we need not to do any own logic for reverse order
ThreadLocal(EX_030_ThreadLocal)
	-It is an alternative for syncroized
	-Need to explore more	
Wrapper Class
	-Integer, Long, Double,Float,Short, Byte and Boolean are the wrapper classes in java.
	-In java 8, they added many static methods which will used to handle the singed and unsigned numbers with radix to do many basic operation like get hashCode and long value, max number ,minimum number, sum number and etc
		-Signed number means Positive and negative number
		-Unsigned number means Positive number
		-radix means format of the number like binary(2),octal(8),hexa(16)
	-These method will help to convert the <Wrapper/Primitive Class Type> to String and vise versa. 
	-These method will take the radix as a one the input parameter and do the operation based on the situation.
	