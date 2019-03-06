# Part 6

If you followed the suggestion of the previous part, you may well have different pieces of code / different methods that deal with standard and custom dice. This is a sad situation to be in - after all, conceptually, we're doing exactly the same thing with both dice! Why should we have to write totally different code for each case when we always want to roll several dice and calculate the total?

## Interfaces

Another way of defining some common behaviour in Java is through using interfaces. An interface is a definition of a set of methods providing some common behaviour. One behaviour that is common between all types of dice is the ability to roll them and produce an integer. We can express this using an interface (create one by right clicking in the IntelliJ sidebar and creating a new class - then select "Interface" in the drop down of the popup that appears).

```java
public interface Dice {
    int roll();
}
```

This interface is us saying that for something to be considered a dice, it must have a `roll` method that returns an integer. But we don't say anything about the implementation - an interface is just a definition of *what* we want to do with a Dice, not *how* the Dice should do it.

To make this interface useful, you need to define some classes that *implement* it. That means defining some classes with a `roll` method and declaring to the compiler that the class implements the `Dice` interface. We'll have one for each type of dice - standard and custom:

```java
public class StandardDice implements Dice {

    // Think about what fields a StandardDice should have.
    // What information do you need to define a StandardDice?

    public StandardDice( /* Constructor inputs */ ) {
        // Constructor body - initialise the fields here
    }

    @Override
    public int roll() {
        // Fill in the implementation of roll for a StandardDice
    }
}
```

```java
public class CustomDice implements Dice {

    // Think about what fields a CustomDice should have.
    // What information do you need to define a CustomDice?

    public CustomDice( /* Constructor inputs */ ) {
        // Constructor body - initialise the fields here
    }

    @Override
    public int roll() {
        // Fill in the implementation of roll for a CustomDice
    }
}
```

In these classes, the `@Override` annotation tells the compiler that we intend this method to "override" the one defined on the interface. It is not strictly necessary to include it, but is good practice and helps to prevent errors.

## Using interfaces

The advantage of having several classes that implement a common interface is that we can write code that works no matter which actual class we are using.

Going back to our main application, we can write code like this (some details omitted):

```java
public static void main(String[] args) {

    // ...

    Dice dice = isCustom ? getCustomDiceFromUser() : getStandardDiceFromUser();
    int numberOfRolls = getIntegerFromUser();
    int totalRoll = calculateTotalRoll(dice, numberOfRolls);

    // ...
}

private static Dice getCustomDiceFromUser() {
    // ...
    return new CustomDice( /* ... */);
}

private static Dice getStandardDiceFromUser() {
    // ...
    return new StandardDice( /* ... */);
}

private static int calculateTotalRoll(Dice dice, int numberOfRolls) {
    // ...
}
```

We no longer have to write one piece of code that deals with standard dice and a totally separate piece of code that deals with custom dice. Instead, we have some common code (`calculateTotalRoll`) that works no matter what type of `Dice` we give it, and it does that by taking advantage of the common behaviour defined on the `Dice` interface.

## Your turn

Implement these ideas into your own application. Define a `Dice` interface and `StandardDice` and `CustomDice` classes as above, filling in the missing details.

Then try to update your `Main` class to look something like the example above, taking advantage of the common behaviour of `Dice`.

Once you have something working, push to GitHub and ask for some feedback from your trainer.