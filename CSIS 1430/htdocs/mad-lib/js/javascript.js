     var story = prompt("Choose your story(enter 1 or 2):");
	 if (story == 1) {
	 var nouns1 = prompt("Enter your first noun:");
	 var nouns2 = prompt("Enter your second noun:");
	 var verb1 = prompt("Enter your first verb:");
	 var verb2 = prompt("Enter your second verb:");
	 var adjective1 = prompt("Enter your first adjective:");
	 var adjective2 = prompt("Enter your second adjective:");
	 document.write("This is a " + nouns1 + " " + nouns2 + ". It can do both " + verb1 + " and " + verb2 + ". It can be recognize by the " + adjective1 + " body " + "and the " + adjective2 + " parts.");}
	 else if (story == 2) {
	 var nouns1 = prompt("Enter your adjective:");
	 var nouns2 = prompt("Enter your noun:");
	 var verb1 = prompt("Enter your verb:");
	 var verb2 = prompt("Enter your verb:");
	 var adjective1 = prompt("Enter your first adjective and noun with a space between:");
	 var adjective2 = prompt("Enter your second adjective and noun with a space between:");
	 document.write("This is animal called a " + nouns1 + " " + nouns2 + ". It can " + verb1 + " and " + verb2 + ". It can be recognize by it " + adjective1 + " tail " + "and the " + adjective2 + " head.");}