#Definition
This pattern encapsulates method invocations.
It decouples the requester of the command from the the object that actually performs it.
The object invoking the computation does'nt need to worry about how things are done. 

A Command object is used to encapsulate all the information
needed to perform an action or trigger an event at a later time
(queuing or call back functionality)

#Design
It involves four terms
command, receiver, invoker and client

**COMMAND**
Encapsulates all the parameters for executing the command
Command object knows about receiver and invokes a method of the receiver

**RECEIVER**
It does the actual work when command object's execute method is called 
Values for parameters of the receiver method are stored in the command

**INVOKER**
The invoker does not know anything about a concrete command, it knows only about command interface

**CLIENT**
Both an invoker object and several command objects are held by a client object. 
The client decides which commands to execute at which points. 
To execute a command, it passes the command object to the invoker object.

#Issues

#Use Cases
Multilevel Undo
Parallel processing
Thread pools 
Transactional behaviour (because of undo feature)
Wizards
