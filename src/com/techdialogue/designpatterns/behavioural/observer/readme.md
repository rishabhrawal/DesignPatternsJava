**Observer (publish/subscribe)**

**Introduction**
Also known a publish/subscribe pattern, 

It defines a one to many dependency between objects 
so that when one object changes state
all its dependent observers are notified and updated automatically.

It has a subject that maintains a list of dependents called observers,
and notifies them automatically of any state changes,
usually by calling their methods

**Application**
Used in distributed event handling in event driven software
GUI applications, MVC architecture

**Design**
#simple observer

#push pull system as implemented in java


**Problems**
Lapsed listener problem(memory leak)
because it requires both explicit registration and explicit deregistration.
This can be prevented by holding weak references(in garbage collected languages) to the observers 