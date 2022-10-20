# The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?



# List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?

- save(user)
- findById(id)
- delete(user)

The methods are defined in the *CrudRepository* class which *userRepository* extends.


# Where is the data being saved?

The data is being saved by the H2 database dependency, which can be specified to save to the current user directory, current working directory or a specific choosen directory. Since I did not specify where it should save the data, it is being saved in the default option: 



# Where is the rule for the “not empty” email address defined?




