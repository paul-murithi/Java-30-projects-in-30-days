### Project Overview:

The temperature converter should allow the user to:

1. **Convert between different temperature units**:
   - Celsius to Fahrenheit
   - Fahrenheit to Celsius
   - Celsius to Kelvin
   - Kelvin to Celsius
   - Fahrenheit to Kelvin
   - Kelvin to Fahrenheit

### Core Features:

1. **User Input**:

   - Allow the user to input a temperature value and choose the units to convert from and to.
   - Validate the user’s input to ensure it is a number and a valid unit.

2. **Conversion Logic**:

   - Implement conversion formulas for the following:
     - **Celsius to Fahrenheit**: `(C * 9/5) + 32`
     - **Fahrenheit to Celsius**: `(F - 32) * 5/9`
     - **Celsius to Kelvin**: `C + 273.15`
     - **Kelvin to Celsius**: `K - 273.15`
     - **Fahrenheit to Kelvin**: `(F - 32) * 5/9 + 273.15`
     - **Kelvin to Fahrenheit**: `(K - 273.15) * 9/5 + 32`

3. **Output**:
   - Display the result to the user in a clear format.
   - If an invalid temperature or unit is entered, display an error message.

### Additional Challenges:

1. **Multiple conversions in one session**:

   - After each conversion, ask the user if they want to convert another temperature. If yes, allow them to continue without restarting the program.

2. **Unit abbreviations**:

   - Support both full names (e.g., "Celsius", "Fahrenheit", "Kelvin") and abbreviations (e.g., "C", "F", "K") for user input.

3. **Temperature history**:

   - Store the previous conversions in memory and give the user the option to view the last 5 conversions made during the session.

4. **Advanced validation**:

   - Ensure that the user can’t enter a negative value for Kelvin (since absolute zero is 0 K).

5. **Command-line argument option** (optional advanced twist):
   - Let the user pass a temperature and unit conversion as command-line arguments, bypassing the need for manual input.

### Example Flow:

1. User enters temperature `32` and chooses `Celsius` to `Fahrenheit`.
   - The program converts the temperature and prints `32°C is 89.6°F`.
2. Program asks if the user wants to perform another conversion.
3. The user chooses to convert `273.15` Kelvin to Celsius.
   - The program converts and prints `273.15K is 0°C`.
4. The user asks to view the last 2 conversions, and the program prints:
   - `32°C -> 89.6°F`
   - `273.15K -> 0°C`
