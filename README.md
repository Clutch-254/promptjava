# Simple Java Prompt Application

This is a basic Java program that interacts with the user by prompting them for their name and age, and then displays a personalized message. The program uses the `Scanner` class to read input from the user via the console.

## Features

- **User Input**: The program prompts the user to enter their name and age.
- **Personalized Output**: The program greets the user by name and shares a message about when they started coding based on their age.

## How to Use

1. **Running the Application**:
   - Ensure you have Java installed on your system.
   - Compile the Java file using the command:
     ```bash
     javac prompt.java
     ```
   - Run the compiled class file:
     ```bash
     java prompt
     ```

2. **Interacting with the Program**:
   - When prompted with `What is your name?`, enter your name and press `Enter`.
   - When prompted with `Hello [Your Name]. How are you?`, enter your age (a whole number) and press `Enter`.
   - The program will then display a message indicating when you started coding based on the age you provided.

## Example

### Input:
```
What is your name? Alice
Hello Alice. How are you? 25
```

### Output:
```
I started coding when I was 25.
```

## Code Structure

- **Scanner Class**: Used to read input from the user.
- **System.out.print**: Displays prompts to the user.
- **System.out.printf**: Formats and displays personalized messages.

## Customization

- **Messages**: You can modify the prompts and output messages to suit your needs by editing the `System.out.print` and `System.out.printf` statements.
- **Input Handling**: You can extend the program to handle additional inputs or perform more complex operations based on user input.

## Dependencies

- **Java Development Kit (JDK)**: Ensure you have JDK installed to compile and run the application.

## License

This project is open-source and available under the MIT License. Feel free to modify and distribute it as per the license terms.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

