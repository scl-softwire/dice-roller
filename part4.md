# Part 4

It turns out that these tabletop RPG players don't actualyl care about all of the individual values on each of the dice - they just care about the sum. Update your application so that instead of displaying the result of each roll, it just shows the total of all rolls.

After doing this, your main method will probably look something like this:

```java
public static void main(String[] args) {

    // Some code that welcomes the user...

    // Some code that asks for a size of dice...

    // Some code that asks for a number of dice rolls...

    // Some code that calculates the total roll...

    // Some code that displays the result...
}
```

When you have a single method doing lots of different single tasks like this, that is a good time to ask the question of whether any of those single tasks could be turned into a method of its own. The advantage of this is that it makes your code easier to understand, because you can give that method a name which makes it obvious to someone reading your code what it does without them necessarily having to read every line of code to work it out!

For example, you'll probably have written a chunk of code that calculates the sum of a series of dice rolls. How much easier would your code be to read if you could replace that chunk of code with the single line:

```java
int sumOfRolls = calculateSumOfRolls(sizeOfDice, numberOfRolls);
```

Splitting code into small methods also helps you keep on top of your application. Without splitting individual tasks into their own methods, as your application grows, you'll end up with a few very large methods, with possibly hundreds of lines of code. It eventually becomes very difficult to add anything to those methods, because in order to do so you have to look through hundreds of lines of code to find the right place to add new code, and also be very careful that your new code doesn't affect anything in unexpected ways.

If each method is small, containing only a few descriptive lines of code that call other small, well-named methods, then it's much easier to make changes.

Try and make your application as easy to understand as possible, and then push to GitHub and ask your trainer for their feedback. Then carry on to [Part 5](part5.md).