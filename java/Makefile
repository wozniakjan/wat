TARGET  = wat.jar
SRC     = src
BIN     = bin
PARAM   = -g
MANIFEST= $(SRC)/manifest.txt
.SUFFIXES: .java .class

CC = javac

SOURCE  := $(wildcard $(SRC)/*.java)
BINS    := $(patsubst src%, bin%, $(SOURCE))  #temp variable
CLASS   := $(BINS:.java=.class)               #list of object files

#create .java from .class
$(BIN)/%.class: $(SRC)/%.java
	$(CC) $(PARAM) $< -d $(BIN)

$(TARGET): dirs $(CLASS) $(SOURCE)
	jar mcf0 $(MANIFEST) $(BIN)/$(TARGET) $(CLASS)

run:
	java -jar $(BIN)/$(TARGET)

#Create directories
dirs:
	@-if [ ! -e $(BIN) ]; then mkdir $(BIN); fi;

clean:
	rm -rf $(BIN)/*
