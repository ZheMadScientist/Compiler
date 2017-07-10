# CPP Compiler

 Using ANTLR V4.7
 
 Compiling in Java

## Supporting features

### Operators:
{ =, -, *, /, ==, !=, +=, *=, cout << string, cout << double , endl }

### Advanced operators:
struct, struct.inner

### Types:
double, string

#### Input cpp code sample:
```
struct Coordinates

{

double x, y;

};

struct Human

{

string name;

double weight;

Coordinates coord;

};

void main()

{

double a = 55.355;

Human Petya;

Petya.name = "Petr";

Petya.weight = 97.79;

Petya.coord.x = 55.25;

Petya.coord.x = 27.12;

cout<<Petya.name<<endl;

cout << (Petya.weight)<<endl;

Petya.weight *= Petya.weight / 10;

cout << (Petya.weight);

}
```
#### Expecting output:
```
Petr
97.79
956.288
```
