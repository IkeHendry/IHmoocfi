# IHmoocfi
Sample of programming from mooc certificate

Programming exercise:
Cubes

Write a program that reads strings from the user until the user inputs the string "end".
As long as the input is not "end" the program should handle the input as an integer and print the cube of the integer (meaning number * number * number).

Programming exercise:
Average of positive numbers

Write a program that asks user for input until the user inputs 0. After this, the program prints the average of the positive numbers (numbers that are greater than zero).
If no positive number is inputted, the program prints "Cannot calculate the average"

Programming exercise:
Liquid containers (3 parts)

Let's create an interactive program to control two liquid containers. The containers are named "first" and "second". Each are capable of containing 100 liters of liquid at a time.
The program offers the functionality to add, move and remove liquid. Using the "add" command will add liquid to the first container, "move" will move liquid from the first container to the second container and "remove" will remove liquid from the second container.
The commands must be defined as following:
add amount adds the amount of liquid specified by the parameter to the first container. The inserted amount must be specified as an integer. The container can't hold more than a hundred liters and everything added past that will go to waste.
move amount moves the amount of liquid specified by the parameter from the first container to the second container. The given amount must be specified as an integer.
If the program is requested to move more liquid than than the first container currently holds, move all the remaining liquid. The second container can't hold more than one hundred liters of liquid and everything past that will go to waste.
remove amount removes the amount of liquid specified by the parameter from the second container. If the program is requested to remove more liquid than the container currently holds, remove all the remaining liquid.
After every command the program will print the contents of both containers. You don't have to take negative values into consideration.
All the functionality must be added to the method main in the class LiquidContainers (do not create new methods). The template already contains a loop which exits the program with the command "quit".

Programming exercise:
Liquid Containers 2.0 (2 parts)

Let's redo the previous program for handling two liquid containers. This time we'll create a class Container, which is responsible for managing the contents of a container.
Make a class called Container. The class must have a constructor which does not take any parameters, and the following methods:
public int contains() which returns the amount of liquid in a container as an integer.
public void add(int amount) which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added. A container can hold maximum of 100 units of liquid.
public void remove(int amount) which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
public String toString() which returns the container as a string formatted "amount of liquid/100", for example "32/100".
Copy the user interface you implemented for the previous example, and modify it to use the new Container class. The main method in the class LiquidContainers2 must start the program.

Programming exercise:
To do list (2 parts)

In this exercise we are going to create a program that can be used to create and modify a to-do list. Create a class called TodoList. 
It should have a constructor without parameters and the following methods:
public void add(String task) - add the task passed as a parameter to the todo list.
public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.
You may assume that the remove method is given a number that corresponds to a real task. The method only has to correctly work once after each print call.
Next, implement a class called UserInterface. It should have a constructor with two parameters. The first parameter is an instance of the class TodoList, and the second is an instance of the class Scanner. 
In addition to the constructor, the class should have the method public void start() that is used to start the text user interface. The text UI works with an eternal looping statement (while-true), and it must offer the following commands to the user:
The command stop stops the execution of the loop, after which the execution of the program advances out of the start method.
The command add asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.
The commmand list prints all the tasks on the to-do list.
The command remove asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.
The user interface is to use the TodoList and Scanner that are passed as parameters to the constructor.
