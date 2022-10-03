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


Programming exercise:
Online shop (8 parts)
In this exercise we'll create program components, that can be used to run an online store.

Warehouse
Create the class Warehouse with the following methods:
public void addProduct(String product, int price, int stock), which adds a product to the warehouse with the price and stock balance given as parameters.
public int price(String product), which returns the price of the product it received as a parameter. If the product hasn't been added to the warehouse, the method must return -99.
The products in the warehouse (and in the next part their stock) must be stored in a variable of the type Map<String, Integer>! The object created can be a HashMap, but its type must be the Map-interface, rather than any implementation of that interface.

Products stock balance
Save the stock balance of products in a variable with the Map<String, Integer> type, in the same way the prices were stored. Supplement the warehouse with the following methods: public int stock(String product) returns the current remaining stock of the product in the warehouse. If the product hasn't been added to the warehouse, the method must return 0.
public boolean take(String product) reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining. If the product was not available in the warehouse the method returns false. A products stock can't go below zero.

Listing the products
Let's add one more method to the warehouse:
public Set<String> products() returns the names of the products in the warehouse as a Set
This method is easy to implement with HashMap. You can get the products in the warehouse from either the Map storing the prices or the one storing current stock, by using the method keySet()
Items can be added to the shopping cart (which we'll add soon). An item is a product with a quantity. You for example add an item representing one bread to the cart, or add an item representing 24 coffees.

Create the class Item with the following methods:
public Item(String product, int qty, int unitPrice); a constructor that creates an item corresponding to the product given as a parameter. qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
public int price() return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
public void increaseQuantity increases the quantity by one.
public String toString() returns the string representation of the item. which must match the format shown in the example below.

Shopping cart
We finally get to implement the shopping cart class!
Internally, ShoppingCart stores products added there as Item-objects. ShoppingCart must have an instance variable with either the Map<String, Item> type, or the List<Item> type. Don't add any other instance variable to the ShoppingCart class, besides the List or Map used to store the items.
NB: If you save the items in a Map type variable, you'll finds its values() method to be quite useful for going though all the items objects stored in it for both this part of the exercise and the next.
First let's give ShoppingCart a constructor with no parameters and these methods:
public void add(String product, int price) adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
public int price() returns the total price of the shopping cart.

Printing the cart
Implement the method public void print() for the shopping cart. The method prints the Item-objects in the cart. The order they are printed in is irrelevant. 

One item per product
Let's change our cart so that if a product is being added thats already in the cart, we don't add a new item, but instead update item already in the cart by calling its increaseQuantity() method.

We now have all the parts we need for our "online store", except the store itself. Let's make that next. Our store has a warehouse that includes all our products. For each 'visit' we have a shopping cart. Every time the customer chooses a product its added to their cart if its available in the warehouse. At the same time, the stock in the warehouse is reduced by one.
Below you'll find a template for a text-based user interface for our store. Create a Store class for your project and copy-paste the code below there.

Animals (4 parts)
In this exercise you'll demonstrate how to use inheritance and interfaces.
Animal
First implement an abstract class called Animal. The class should have a constructor that takes the animal's name as a parameter. The Animal class also has non-parameterized methods eat and sleep that return nothing (void), and a non-parameterized method getName that returns the name of the animal.

The sleep method should print "(name) sleeps", and the eat method should print "(name) eats". Here (name) is the name of the animal in question.

Dog
Implement a class called Dog that inherits from Animal. Dog should have a parameterized constructor that can be used to name it. The class should also have a non-parameterized constructor, which gives the dog the name "Dog". Another method that Dog must have is the non-parameterized bark, and it should not return any value (void). Like all animals, Dog needs to have the methods eat and sleep.
Cat
Next to implement is the class Cat, that also inherits from the Animal class. Cat should have two constructors: one with a parameter, used to name the cat according to the parameter, and one without parameters, in which case the name is simply "Cat". Another method for Cat is a non-parameterized method called purr that returns no value (void). Cats should be able to eat and sleep like in the first part.
NoiseCapable
Finally, create an interface called NoiseCapable. It should define a non-parameterized method makeNoise that returns no value (void). Implement the interface in the classes Dog and Cat. The interface should take use of the bark and purr methods you've defined earlier.
