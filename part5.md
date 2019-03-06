# Part 5

Some games that the tabletop RPG players play don't use standard dice at all! They use custom dice of all sorts of different sizes and with all sorts of numbers on the faces - some with gaps, some with repeated numbers.

Change your application so that it first asks the user if they want "standard" or "custom" dice. 

If they ask for "standard" dice, then carry on as before - ask for the size and the number of rolls, then display the total.

If they ask for "custom" dice, then ask them how many faces are on their custom dice, then ask them for the number on each face of the dice, and finally ask them for a number of rolls before displaying the total.

As in the previous part, try to make sure that your main program is easy to understand from a quick read. That means that any slightly fiddly calculations or operations should be defined as their own methods. For example, you might write something like this in your main method:

```java
public static void main(String[] args) {

    // ...

    if (isCustom) {
        List<Integer> customFaces = getCustomFacesFromUser();
        int numberOfRolls = getIntegerFromUser();
        int totalRoll = calculateCustomTotal(customFaces, numberOfRolls);
        System.out.println(totalRoll);
    } else {
        int sizeOfDice = getIntegerFromUser();
        int numberOfRolls = getIntegerFromUser();
        int totalRoll = calculateStandardTotal(customFaces, numberOfRolls);
        System.out.println(totalRoll);
    }

    // ...
}
```

In that example, there are methods `getCustomFacesFromUser`, `calculateCustomTotal` and `calculateStandardTotal`. There are probably other improvements to be made as well - that's just a start! See what you can come up with, and then it's working and you're happy with the code, push it to GitHub and get some feedback.

[Part 6](part6.md) awaits...