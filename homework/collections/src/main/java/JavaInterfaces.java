
/*Consider the four core interfaces, Set, List, Queue, and Map.
*For each of the following four assignments, specify which of the four core 
*interfaces is best-suited, and explain how to use it to implement the assignment.*/

/*Whimsical Toys Inc (WTI) needs to record the names of all its employees. 
Every month, an employee will be chosen at random from these records to receive a free toy.*/

-- Best Interface: List
A List allows duplicate entries, so lots of employees with 
the same name can be recorded easily.
A List allows random access to elements, so you can select a random employee
by generating a random index and accessing the corresponding element in the list.
Implementation:


/*WTI has decided that each new product will be named after an employee but only first 
names will be used, and each name will be used only once. Prepare a list of unique first names.*/
-- Best Interface: Set
A Set is used to store unique elements, so it stops duplicate entries. 

/*WTI decides that it only wants to use the most popular names for its toys. 
Count up the number of employees who have each first name.*/
Best Interface: Map
A Map allows you to connect a key (a first name) with a value
 (the count of employees who have the name). 

/*WTI acquires season tickets for the local lacrosse team, to be shared by employees. 
Create a waiting list for this popular sport.*/
Best Interface: Queue
A Queue is for processing elements in a first-in, first-out (FIFO) order,
which is perfect for managing a waiting list. The first employee to request a ticket
will be the first to receive one when it becomes available.


