# The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?

Since *userController* has the *@Autowired* annotation, it injects an instance of *userRepository* on the *userController* object.

# List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?

- save(user)
- findById(id)
- delete(user)

The methods are defined in the *CrudRepository* class which *userRepository* extends.


# Where is the data being saved?

The data is being saved by the H2 database dependency, which can be specified to save in-memory or to be persistent. It saves in-memory by default.


# Where is the rule for the “not empty” email address defined?

Its applied on the *User* class with the annotation *NotBlank* which is defined in the *NotBlank* class.


