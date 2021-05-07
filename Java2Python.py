import re

name = input("Hello. What's your name?\n")
name = name[0:1].upper() + name[1:]

try:
	invalid = True
	print("Hi, " + name + ". How old are you?")

	while invalid:
		invalid = False
		age = int(input())
		if age <= 0:
			print("That's impossible.")
			invalid = True
		elif age < 3 or age > 99:
			print("That sounds unlikely.")

	colors = ["white", "black", "gray", "yellow", "red", "blue", "green", "brown", "pink", "orange", "purple", "cyan", "magenta"]
	color = input("What's your favorite color?\n")
	color = color.lower();
	if bool(re.match("^[a-z]{3,}", color)):
		for x in colors:
			if x == color:
				exit("That's cool. " + x[0:1].upper() + x[1:] + " is a nice color.")
		print("I didn't find your color on my list. That doesn't mean that it's not a color, it just means that I have a short list.")
	else:
		print("That's definitely not a color.")
except ValueError:
	print("You didn't specify a valid integer.")