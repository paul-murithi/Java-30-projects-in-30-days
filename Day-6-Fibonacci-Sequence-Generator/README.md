### Project Overview

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1. Your task is to create a program that generates and displays Fibonacci numbers based on user input.

### Project Expectations

1. **Generate a Sequence**: The program should take an integer as input (e.g., the number of terms) and output the first _n_ numbers in the Fibonacci sequence.
2. **Display Options** (optional): Give users the option to either:
   - Display the full sequence up to the _n_-th term.
   - Calculate and display only the _n_-th term in the sequence.

### Program Flow

1. **Welcome Message**: Display a message to introduce the Fibonacci Sequence Generator.
2. **User Input**:
   - Prompt the user to enter how many terms they would like to generate.
   - Include basic input validation to ensure the entered number is positive.
3. **Fibonacci Logic**:
   - Use a loop to calculate each term in the sequence, storing and/or printing each number.
4. **Output**:
   - Print the sequence up to the specified term.
   - Optional: If the user only wants the _n_-th term, display that term alone.

### Quick Guide to Implementing

1. **Define Variables**: You’ll need two main variables to hold the last two numbers in the sequence (e.g., `a` and `b`).
2. **Loop Through Terms**: Use a loop to calculate each Fibonacci number up to the user's input.
3. **Sequence Storage** (optional): Store the sequence in a list/array for easy output, especially if users want the full sequence.

### Possible Enhancements

- **Recursive Version**: Add an option to generate the _n_-th term using recursion instead of iteration.
- **Timing**: Measure and display the time taken to calculate the sequence for large values of _n_.
- **Error Handling**: Make sure to handle any invalid input gracefully (e.g., negative numbers).
