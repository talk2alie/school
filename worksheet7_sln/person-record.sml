(*Worksheet 7, Question 5*)

type fullName = {firstName:string, middleName:string, lastName:string};

fun updateLastName(name: fullName, LastName: string) = {firstName = #firstName(name), middleName = #middleName(name), lastName = lastName};

datatype gender = Female | Male | Trans | Other;

datatype maritalStatus = Divorced | Married | Separated | Single;

type employee = {name: fullName, gender: gender, maritalStatus: maritalStatus, age: int};

fun getAge(employee: employee) = #age(employee);

fun isMale(employee: employee) = #gender(employee) = Male;

fun isFemale(employee: employee) = #gender(employee) = Female;

type employeeRecord = {employee: employee, payRate: real, hoursWorked: int};

fun getRate(record: employeeRecord) = #payRate(record);

fun updateHoursWorked(record: employeeRecord, hoursWorked: int) = 
    {employee = #employee(record), payRate = #payRate(record), hoursWorked = hoursWorked};