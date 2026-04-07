all:
	javac Creature.java
	javac ElementalType.java
	javac Move.java
	javac MoveSet.java
	javac Item.java
	javac Location.java
	javac Player.java
	javac GameEngine.java

run:
	java GameEngine

clean:
	rm -f *.class

