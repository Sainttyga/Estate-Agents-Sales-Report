# Estate Agents Sales Report

## Overview
This project is a simple Java application for managing property sales by estate agents. It includes functionalities to calculate total sales, commission earned, and identify the top-performing estate agent based on sales figures.

## Features
- Calculate total sales for each estate agent.
- Compute commission based on total sales.
- Identify the top-performing estate agent.

## Classes
- **EstateAgent**: Implements `iEstateAgent` interface, provides methods for sales calculation, commission calculation, and identifying top agents.
- **PropertySales**: Main class demonstrating the functionality with hardcoded data.
- **PropertySalesTest**: JUnit tests for validating calculations in the `EstateAgent` class.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE such as or NetBeans (Java with Maven -> Java Application)

### Installation
1. Clone the repository:
   ```bash
   https://github.com/Sainttyga/Estate-Agents-Sales-Report.git
   ```
2. Open the project in your IDE.

### Running Application and Tests
- **Running the Application**: Execute the `main` method in `PropertySales` class.
- **Running Tests**: Use JUnit to run tests in `PropertySalesTest` class.

### Usage
Example Output:  
ESTATE AGENTS SALES REPORT  
                     JAN             FEB             MAR  
`------------------------------------------------------------`  
Joe Bloggs       800,000.00     1,500,000.00     2,000,000.00  
Jane Doe         700,000.00     1,200,000.00     1,600,000.00  
  
Total property sales for Joe Bloggs: R 4,300,000.00  
Total property sales for Jane Doe: R 3,500,000.00  

Sales Commission for Joe Bloggs: R 86,000.00  
Sales Commission for Jane Doe: R 70,000.00  
  
Top performing estate agent: Joe Bloggs  

### Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please submit an issue or create a pull request.

## Acknowledgements

- This project uses `JOptionPane` for GUI interactions.
- JUnit 5 is used for unit testing.

