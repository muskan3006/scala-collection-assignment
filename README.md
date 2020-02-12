| Assignment 1) |
-----------------
Description: Every Student has some marks associated with it. Student details contains its id and name.
And for Marks, there are subjectId, studentId and number of marks a student scored.

Following are the requirements which is required to gain from above scenario (i.e. Student and marks)

1)
Input:- (subjectId, percentage, pass/fail)
Output:- for input pass, evaluate that how much students(id, name) are passed in the inputted subjectId
	for input fail, evaluate that how much students(id, name) are failed in the inputted subjectId
Note:- percentage is the input which defines the minimum passing criteria
e.g. 
Pass count: 15
Fail count: 10

2)
Input:- (subjectId, count, top/bottom)
Output:- based on the last input(top/bottom), output the students details who have scored max/min in that subjectId
e.g. 
input: 1 5 top
output: 
Kunal 85
Himanshu 84
Geetika 83
Anmol 82
Mahesh 81

3)
Input:-
(top/bottom, count)
OutPut:-
Overall top/least scorer based on all the subjects score, fetch students name
count- input defines that how much students name are to be printed on console
e.g.
input: top 2

output:
Himanshu 75%
Geetika 74%


4)
Input:-
(percentage, good_scholarship, normal_or_no_scholarship)
Output:- two groups of students with the amount of scholarship
e.g.
input: 85% 2000 500
output: 
Kunal 2000
Himanshu 500
Geetika 2000
Mahesh 500

5)
Input:-
(pass/fail, percentage)
count and print the number of students and all names who are passed/fail,
Pass or fail would be decided by percentage input field.
e.g.
input: fail 30
output: 
Kunal 28%
Himanshu 29%

6) Find the student(s) who have scored 95% or above and print its details.
input: 95%
output:
Kunal 95%
Himanshu 96%
Geetika 97%

7) For every student, find its marks in detail (just like detailed Report card of a student.)
Note:- must use groupBy method of List
input: reportcard
output:
Kunal 75 70 80 75 75%
Himanshu 74 70 81 75 75%
Geetika 70 70 85 75 75%

-----------------
| Assignment 2) |
-----------------

- Find the last element of list with its index value(dont use inbuilt methods to extract last element directly)
- print the table of each element in the List
- aggregate the contents of two lists of same size into a single list
	List(1,2) and List("a", "b") results List(List(1, "a"), List(2, "b"))
- find sum and multiplication of the list (dont use inbuilt methods)
- Implement Stack and Queue using Lists.

-----------------
| Assignment 3 |
-----------------

Aim:
Implement the following problems descriptions.
1. Get the day out of a timestamp value with format: “dd-mm-yyyy HH:MM:SSS”.
Problems:
1. Complete Extractor definition for URL parsing.
object URL{
def apply(protocal:String,domain:String,path:String,
params:Map[String,String]):String = {

//definition

}
def unapply(url:String):Option[(String , String,
String,Map[String,String])] = {
//definition

}
}
Description :
val url = “https://aws.amazon.com/console/home?
state=hash&isauthcode=true&code=112”
Extract following fields:
protocal =” https”
domain = “aws.amazon.com”
path =”/console/home”
params = Map(“state” -> “hash”, “isauthcode” -> “true”, “code” ->

112)
2. Write regular expression for email parsing.
Description :

val EMAIL = “ regular expression definition”.r
val EMAIL(user, domain) = “knol@knoldus.com”

user = knol
domain = knoldus.com

Deadline:
Last date/time to submit the document is 27 January 2017, 5:00 PM. We will be
opening a form to collect your assignments.


