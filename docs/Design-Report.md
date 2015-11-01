Introduction
============

Overview
--------

The purpose of this system design is to define the programming rules for
the project and the basic flow of our system. The game is coded within
one class and therefore a class diagram is omitted.

Definitions and acronyms
------------------------

-   **TicTacToe** is the name of our game.

-   The **grid** is the board on which the game is played. It consists
    of 9 squares with default settings.

Rules
=====

General rules
-------------

-   Player X goes first.

-   User cannot enter coordinates outside of the grid.

-   User cannot select a square that has already been marked by himself
    or the other player.

-   When every square in the grid is marked and no winner has been
    decided the game ends in a draw.

Programming rules
-----------------

Well designed systems usually include ordered rules for the code. This
helps programmers coordinate when writing code for a new system. Rules
are important for a programmer because they can:

-   Create consistent look to the code.

-   Enable readers to understand the code more quickly.

-   Facilitate changing and maintaining of the code.

Here we will list the coding rules we intend to follow.

### Layout rules

-   Indentation with Allman style.

-   One statement per line.

-   One declaration per line.

-   No spaces between if statements, for or while loops and parenthesis

-   One blank line between method definitions and property definitions.

-   Use curly braces around blocks, even when they would be optional.

### Commenting rules

-   Comments begin with an uppercase letter.

-   One space between the comment delimiters (//) and the comment text.

-   Comments are placed above the code not by its side.

### Variable rules

-   Class names are PascalCased.

-   Properties, fields, local variables and parameters are camelCased.

-   Functions are camelCased if and only if they are not class
    constructors then they are PascalCased.

-   Variables should not start with an underscore or a dollar sign.

### Operator rules

-   Use (&&) and (||) operators when comparing to avoid exceptions and
    increase performance.
