
# Functional Testing

- Functional testing is software testing where the system is tested against the functional requirements/specifications.
- The purpose of functional testing is to assure that the software fulfils the requirements of the stakeholders.
- Functions (or features) are tested by providing them input
and examining the output.
  - Eg Add User

- To undertake functional testing you need very good knowledge of what the s/w does and also knowledge on what constitutes valid and invalid
input and output.
- Because of the vast amount of possible input data approaches are needed to manage this.
- Functional testing describes what the system does, as opposed to what the system should do.

## Equivalence partitioning

- In general when executing software, some input is taken, some processing carried out and some output is produced.
- Equivalence partitioning consists of analysing the input into sensible test cases which we can execute.
  - Tackles the problem of the vast amount of possible input which could be supplied to the s/w.
- This involved dividing the input values into equivalent groups
- Segregate the input domain into equivalence partitions that don't overlap, then produce test cases based on these.
- The idea is that any one sample of the equivalence class is representative of the entire class.

## Equivalence partitioning, Part 2

- Example 1 - A quantity field on a form accepts entry of a whole number between 1 and 100. Derive the equivalence classes and determine black box test cases based on these.
- Input conditions: 1 <= x <= 100; x is a whole number; ie 2 input conditions
- Output condition; accepted i.e. 1 output condition

**Equivalence classes:**

| Equiv classes | Criteria             | Valid/Invalid |
|---------------|----------------------|---------------|
| E1            | 1 <= x <= 100        | Valid         |
| E2            | x not a whole number | Invalid       |
| E3            | x<1                  | Invalid       |
| E4            | x>100                | Invalid       |

**Black box test cases:**  

| Test case | Input | Output        | Equivalence class covered |
|-----------|-------|---------------|---------------------------|
| TC1       | 5     | Accepted      | E1                        |
| TC2       | 5.5   | Invalid Input | E3                        |
| TC3       | 0     | Invalid Input | E3                        |
| TC4       | 102   | Invalid Input | E4                        |

**To Do:**  

1. Complete Example 2 below ie only 4 equivalence classes identified, identify the others and determine the black box test cases.
2. Complete Example 3

Example 2:  

- A program takes as input a date in the format day, month, year and based on input, outputs the previous day's date or outputs Invalid Date!
- Derive the equivalence classes and determine black box test cases based on these. Assume a default start year of 1900 and end year of 2025

Answer:

- Input conditions: `1 <= day <= 31`; `1 <= month <= 12`; `1900 <= year <= 2025`;
- day, month, year all whole numbers; ie 4 input conditions
- Output conditions: outputs previous date; Invalid date ie 2 output conditions

**Equivalence classes:**

| Equiv classes | Criteria                                                    | Valid/Invalid |                                                               Reason |
|---------------|-------------------------------------------------------------|--------------:|---------------------------------------------------------------------:|
| E1            | `not isInstance(day, int)`                                  |       Invalid |                                                                      |
| E2            | `1 <= day <= 31`                                            |        Valid* |                                                                      |
| E3            | `day < 1`                                                   |       Invalid |                                                                      |
| E4            | `day > 31`                                                  |       Invalid |                                                                      |
| E5            | `isInstance(day, int) and 1 <= day <= 31`                   |         Valid |                                                                      |
| E6            | `not isInstance(month, int)`                                |       Invalid |                                                                      |
| E7            | `1 <= month <= 12`                                          |        Valid* |                                                                      |
| E8            | `month < 1`                                                 |       Invalid |                                                                      |
| E9            | `month > 12`                                                |       Invalid |                                                                      |
| E10           | `isInstance(month, int) and 1 <= month <= 12`               |         Valid |                                                                      |
| E11           | `not isInstance(year, int)`                                 |       Invalid |                                                                      |
| E12           | `1900 <= year <= 2025`                                      |        Valid* |                                                                      |
| E13           | `year < 1900`                                               |       Invalid |                                                                      |
| E14           | `year > 2025`                                               |       Invalid |                                                                      |
| E15           | `isInstance(year, int) and 1900 <= year <= 2025`            |         Valid |                                                                      |
| E16           | `ec5 and ec10 and ec15`                                     |         Valid |                                                                      |
| E17           | `ec5 and ec10 and month = 2 and day > 29`                   |       Invalid | Feb has a maximum of 28 days and a maximum of 29 days in a leap year |
| E18           | `ec5 and ec10 and month = 2 and day = 29 and year % 4 != 0` |       Invalid | Feb has a maximum of 28 days and a maximum of 29 days in a leap year |

**Example 3**  

 -A mileage rate calculator takes as input engine capacity in CC (cubic centimeters) from 1000 to
3000 and the distance travelled in KM (Kilometers) from 1 to 1000. Based on the information entered, it
outputs the mileage rate based on the following outline pseudocode:

```python
if (cubicCentimeters in the range 1000 to 2000) and (mileage <500):
    print("mileage rate of 50 cent per KM")
elif (cubicCentimeters in the range 2001 to 3000) and (mileage <500):
    print("mileage rate of 60 cent per KM")
else:
    print("mileage rate of 45 cent per KM")
```

Derive the equivalence classes and determine black box
test cases based on these. Engine capacity and distance are
whole numbers
