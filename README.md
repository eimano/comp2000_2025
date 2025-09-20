Objective Of The Game - Its a minesweeper game you must reveal all cells that do not contain mines without triggering a mine

Controls Of The Game - 
Left click == Reveal a cell
Right click == Place or remove a flag on a cell you suspect contains a mine (you cant left click a flagged cell)

To Win - Reveal all non-mine cells

To Lose - Click on a mine

Generics let you write code that works with different data types as it ensures that variables only hold the type of data they’re supposed to preventing mistakes. I used generics so only Cell objects can be stored in the grid, which prevents mistakes. Since Mines and Nums both extend Cell, they fit into the same grid but still behave differently when drawn or revealed. Without generics, the grid could store any type of object, not just Cell, which could cause errors and crashes at runtime. Using generics makes sure only Cell objects are stored keeping the code Guaranted to store variables with only the intended data type helping prevent errors.

I created a drawable interface to define a paint method that all Cell objects must implement. This allows Mines and Nums to each have their own way of drawing themselves on the grid while guaranteeing that any Cell can be painted without needing to know its exact type. Using the interface enforces a consistent method across different cell types. In the future this makes it easy to add new types of cells or items like power ups or terrain without changing the existing drawing code keeping the project scalable and maintainable.

The Cell class is an abstract base class that contains shared properties and methods like:
x, y
revealed
flagged
reveal()
toggleFlag()
Mines and Nums both extend Cell inheriting these common behaviors while adding their own specific functionality like drawing a bomb for Mines or showing numbers for Nums. This avoids repeating code and ensures consistency across all cell types.inheritance allows new cell types to be added easily by extending Cell and overriding only the necessary methods making the code flexible and easy to expand.
