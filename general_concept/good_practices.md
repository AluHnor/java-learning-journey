# CONVENTIONS / LANGUAGE / ORDER

Some notes about guidelines and coding standards for coding.

* @Idenfitiers

    Rules for naming variables:

	    * Can contain: letters (k), digits (9), underscore (_) and currency sign ($)
	    * Must begin with a letter (but can with _ and $)
	    * Starting in camelCase
	    * Case-Sensitive
	    * Reserved words cannot be used, nor spaces
	    * A variable structured in @Final are usually written in upper case (YEAR_TOTAL_DAYS = 365)

* @Structure for coding

    Definition order (by logic): {

	    * Attributes (variables within Class) {
		    * Constructors (special methods to set initial values for object attributes) {
			    * Methods (execute blocks of code as parameters)
		    }
	    }
    }

* @Structure for package

	* Use underscore (_) between package/folder names (I've got a feel erros while my folder names has "-" between each name. EX: here-is-java)