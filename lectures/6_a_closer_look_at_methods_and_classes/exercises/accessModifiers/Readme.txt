Your team has decided they want to create a class to represent users.

The class will have a simple interface.

You should be able to create a user in 3 ways.

Without sending any parameters, only sending a firstname or by sending both first name and lastname.

Along with the 3 constructor methods the User class should expose the following methods.

User fred = new User();
fred.setFirstname("fred");
fred.setLastname("west");
fred.getFirstname(); // returns "Fred"
fred.getLastname(); // returns "West"
fred.getUsername(); // returns "fred.west"

getFirstname
	return the private string firstname
setFirstname
	Takes a single string as an input parameter and saves it as propercase to the private string firstname

getLastname
	return the private string lastname
setLastname
	Takes a single string as an input parameter and saves it as propercase to the private string lastname

getUsername
	returns a string, username is the firstname and lastname in lowercase seperated by a '.'
	if the user has no lastname it is purely the firstname in lowercase without a '.'


Create a private static method for creating propercase strings (first character uppercase other characters lowercase) from any string input that can be used in setLastname and setFirstname methods.