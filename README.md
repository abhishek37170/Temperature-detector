# Temperature Detector

A Java console program that shows a temperature reading as a colored thermometer bar, with a message describing how it feels.

## How It Works

1. Enter the current temperature in Celsius.
2. The program draws a bar of 50 squares, one per degree.
3. Squares up to your temperature are colored, and the rest are white.
4. A status message is shown after the bar.

## Color Scale

| Degrees | Color |
|---------|-------|
| 1 to 12 | 🟨 Yellow |
| 13 to 22 | 🟧 Orange |
| 23 to 50 | 🟥 Red |
| Above the reading | ⬜ White |

## Status Messages

| Temperature | Message |
|-------------|---------|
| Below 5 | ❄️ Very cold |
| 5 to 17 | 🥶 Cold |
| 18 to 29 | 😊 Comfortable |
| 30 and above | 🥵 Hot |

## Example

```
Enter the current temperature in Celsius: 20
Thermometer:
🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟧🟧🟧🟧🟧🟧🟧🟧⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜ 😊 Comfortable
```

## How to Run

1. Install the Java JDK.
2. Download `Main.java`.
3. Open a terminal in the same folder and run:

```
javac Main.java
java Main
```

Use a terminal that supports emoji and UTF-8 (VS Code's terminal works well).

## Concepts Used

- `Scanner` for user input
- `for` loops to draw the bar
- `if / else if / else` conditions
- UTF-8 output with `PrintStream` for emoji

## Possible Improvements

- Handle non-number input without crashing
- Support Fahrenheit and Kelvin
- Handle negative temperatures

## Author

abhishek37170
