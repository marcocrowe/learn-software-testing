# Software Testing - Exam Paper - 2023 - Summer

**Time Allowed**: 2 hours

**Instructions**:  Answer any 3 questions. All questions carry equal

**Marks and marks will be scaled to 100.**

The use of programmable or text storing calculators is expressly forbidden.

Please note that where a candidate answers more than the required number of questions, the examiner will mark all questions attempted and then select the highest scoring ones.

There are no additional requirements for this paper.

## Question 1 - (Total 33 Marks)

### Question 1 Part 1 (11 Marks)

Do you think that all bugs can be removed by software testing? Explain your answer and give your understanding of the goal of software testing in your explanation.

### Question 1 Part 2 (11 Marks)

Do you think scenarios and use cases can be used for black box testing? Explain your answer?

### Question 1 Part 3 (11 Marks)

Explain your understanding of integration testing. Do you think you will use integration testing in the future, explain your answer?

## Question 2 (Total 33 Marks)

### Question 2 Part 1 (11 Marks)

Develop a Control-flow graph for the code shown in Figure 1 below and determine the complexity. Suppose software testing has been employed so that TER1 = 1 and TER2 = 1, would you recommend further testing and explain your answer.

### Question 2 Part 2 (11 Marks)

Develop the branch table for the code shown in Figure 1.

### Question 2 Part 3 (11 Marks)

Develop the block table for the code shown in Figure 1 below.

```java
for(int i = 1; i <= 2; i++)
{
    for(int j = 1; j <= 2; j++)
    {
        thirdPieEater.turn("Right");
        if(grid.pieInSight(thirdPieEater) == true)
        {
            thirdPieEater.eatPie(grid);
        }
        else
        {
            thirdPieEater.reportStatus();
        }
    }
    if(grid.clearAhead(thirdPieEater) == true)
    {
        for(int j = 1; j <= 2; j++)
        {
            thirdPieEater.walk(grid);
        }
    }
}
thirdPieEater.reportStatus();
```

> Figure 1

## Question 3 (Total 33 Marks)

An InvoiceLoader component has a method called loadInvoices which contains business logic about processing of invoice data. The code for the loadInvoices is shown in Figure 2.

```java
package io.github.username.invoice.loader;

import java.util.Calendar;

public class InvoiceLoader
{
  public InvoiceLoader() { }// default constructor

  public Boolean loadInvoice(String dataFile)
  {
    // First piece of business logic is to check that the dataFile has a valid extension.
    if(!dataFile.endsWith(".dat"))
    {
      return false; //dataFile extension is invalid
    }
    // Next piece of business logic is to check that it's Friday as this is the only day of the week that invoices are loaded.
    Calendar cal = Calendar.getInstance();
    if(cal.get(Calendar.DAY_OF_MONTH) == Calendar.FRIDAY)
    {
      readTheDataFileAndLoadTheInvoices();
      return true;
    }
    else
    {
      return false;
    }
  }
  public void readTheDataFileAndLoadTheInvoices()
  {
    /*
     * This code is under construction and is not currently needed
     * to unit test the business logic in the processStock method.
     */
  }
}
```

> Figure 2

### Question 3 Part 1 (8 Marks)

When you develop production code you will need seams to ensure your code is testable, explain what a seam is and how you will use them in your unit tests.

### Question 3 Part 2 (12 Marks)

Refactor the loadInvoices to make it testable by introducing a layer of indirection to avoid the dependency i.e. write code or pseudocode. You refactoring should include adding an interface which will allow use of a configurable stub in the unit tests.

### Question 3 Part 3 (13 Marks)

Write code or pseudocode for three unit tests to test the business logic in the loadInvoices method. Write code or pseudocode for a configurable stub to be used by your tests utilising constructor injection.

## Question 4 (Total 33 Marks)

### Question 4 Part 1 (10 Marks)

Explain the relationship between Equivalence Classes/Partitions and Boundary Value Analysis. Use a simple example to illustrate your answer.

### Question 4 Part 2 (23 Marks)

A shopping website offers different discounts depending upon each transaction made by the customer. The user enters the purchase amount, then presses the OK button. For example if a purchase is in the range €1 to €50 then no discount is displayed, a purchase over €50 and up to €200 have 5% discount calculated and displayed. Purchases between €201 and up to €500 have 10% discount calculated and displayed, and purchases over €501 have a 15% discount calculated and displayed. The maximum purchase amount that can be entered is €1000 and the minimum amount is €1 and invalid input of any kind results in a warning message Invalid Input.

Derive the equivalence classes and determine black box test cases based on these and utilise boundary value analysis.

## Paper College Details

College: Technological University Of The Shannon: Midlands Midwest  
Module Title: Software Testing  
Module Code: SODV06010  
Year of Study: 2  
Year: 2023 - Summer  

### Programmes

| Code           | Programme                                          |
|----------------|----------------------------------------------------|
| LC\_KMWCM\_KMY | Bsc. (Honours) Mobile and Web Computing            |
| LC\_KISYM\_KMY | Bsc. (Honours) Internet Systems Development        |
| LC\_KCPTM\_JMY | Bsc. Computing                                     |
| LC\_KSOFM\_KMY | Bsc. (Honours) Software Development                |
| LC\_KISYM\_JMY | Bsc. Internet Systems Development                  |
| LC\_KMWCM\_JMY | Bsc. Mobile and Web Computing                      |

### Examiners

| Examiner           |          |
|--------------------|----------|
| Mr. Brendan Watson | Internal |
| Mr. Andrew Shields | External |
