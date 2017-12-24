Telescoping constructor problem:
This occurs when the increase of object constructor parameter combination 
leads to an exponential list of constructors.

This is an anti-pattern.

Instead of using numerous constructors, 
the builder pattern uses another object, a builder, 
that receives each initialization parameter step by step 
and then returns the resulting constructed object at once.

only the required parameters are set via builder
and finally build() method is called to return the object.

