
# Sample Unit Test Exam

## Question 3 [Total 33 Marks]

A `SalaryProcessor` component has a method called `lodgeSalaries` which contains business logic about processing of salaries. The code for the `SalaryProcessor` is shown in Figure 2 below.

```java
package io.github.username.exam.code;
import java.util.Calendar;

public class SalaryProcessor
{
    public SalaryProcessor() {}// default constructor

    public Boolean lodgeSalaries(String dataFile)
    {
        // First piece of business logic is to check that the dataFile has a valid extension.
        if (!dataFile.endsWith(".data"))
            return false; //dataFile extension is invalid
        // Next piece of business logic is to check that five days remain in
        // the month i.e. the current date is 5 days before the end of the month
        Calendar cal = Calendar.getInstance();
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        // maxDay stores the number of days in the current month.
        if (cal.get(Calendar.DAY_OF_MONTH) < maxDay - 7)
        {
            readTheDataFileAndProcessSalaries();
            return true;
        }
        else
        {
            return false;
        }
    }

    public Boolean lodgeSalaries(String dataFile)
    {
        // This code is under construction and is not currently needed
        // to unit test the business logic in the lodgeSalaries method.
    }
}
```

### Question 3.A (8 Marks)

Does the code in the `lodgeSalaries` method above have test inhibiting design? Explain your answer.

### Question 3.B (12 Marks)

Refactor the code to make it testable by introducing a layer of indirection to avoid the dependency on the date. You refactoring should include adding an interface which will allow use of a suitable stub in the unit tests.

### Question 3.C (13 Marks)

Write code or pseudocode for three unit tests to test the business logic in the `lodgeSalaries` method. Write code or pseudocode for a configurable stub to be used by your tests utilising constructor injection.
