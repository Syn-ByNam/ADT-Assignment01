# ADT-Assignment01
# Student Manager

This project is a simple student management system written in Java. It reads student data from a CSV file, allows sorting by different criteria (such as student number, first name, last name, and faculty), and provides an option to search students by their first name.

## Features

- **Sort student records** by:
  - Student Number
  - First Name
  - Last Name
  - Faculty
- **Search for students** by their first name.
- **Error handling** for invalid lines or data.

## Prerequisites

- **Java 8** or later is required to run the program.
- A **CSV file** containing student information.

## How to Use

1. Clone this repository to your local machine:git clone https://github.com/Syn-ByNam/ADT-Assignment01.git
2. Navigate to the project directory: cd student-manager
3. Compile the program: javac StudentManager.java
4. Run the program: java StudentManager

5. The program will display options for sorting or searching student records. You can choose one of the following options:
- `-n` : Sort by student number
- `-f` : Sort by first name
- `-l` : Sort by last name
- `-c` : Sort by faculty
- `-s` : Search by first name

6. Enter your choice and follow the prompts for sorting or searching.

## CSV File Format

The CSV file used for input should contain the following columns:
- **Student Number** (integer)
- **First Name** (string)
- **Last Name** (string)
- **Faculty** (string)

Example: 12345, John, Doe, Faculty of Engineering
67890, Jane, Smith, Faculty of Arts

## Error Handling

- If a student number is not a valid integer, the program will skip that entry and print a message indicating the invalid line.
- If the CSV file has fewer than 4 columns, the program will skip that line.
- If the file is not found or there is an error reading the file, an error message will be displayed.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

Syn-ByNam
