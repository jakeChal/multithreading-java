## Starting a thread

There are essentially 3 ways of starting a new thread in java:

- Extend the ```Thread``` class, and override the method ```run()``` with your code.
Create objects with this child class and then call the ```start()``` method on them.
- Implement the ```Runnable ``` interface and override the method ```run()``` with your code.
Then create ```Thread``` objects, with the constructor argument being: 
    ```java
    Thread t1 = new Thread(new ImplementationClass());
    ```
    Finally, call the ```start()``` method on them.

- Create an anonymous inner class using the second way.
