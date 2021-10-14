# ePortfolio-Artifact-Two
Cruise Menu System Enhanced

ePortfolio Artifact Two - Design By Elijah Hickey

This artifact is part of my ePortfolio, which can be found [here](https://ehickey96.github.io/)

This Artifact demonstrates adding complexities and advanced algorithms to an existing program. 
The program has become much more complex. It follows the dependencies, as highlighted below. 
it contains various calculators & a simulator.

Was made with Java in Eclipse.

The following rules and dependancies have been inforced

### Rules & Dependancies

1. Cruises must have a ship, and only one ship
    1. Ships must be in service, and not have another cruise at that time 
    2. The total cost of the cruise is calculated by: Base departure cost (*ship*) + (cost per mile (*ship*) * total miles (*cruise*)) + additional cruise cost (*cruise)
    3. The profit from each room type is calculated as follows: additional room fees (*cruise*) + price of specific room type (*ship*)
    4. Cruise income is the profit of each room type (*cruise*) * number of booked rooms of each type (*cruise*)
    5. Net profit is Cruise income * cruise total cost
    6. Profit percentage net profit / cruise income * 100
2. A passenger in the system must be assigned to a cruise, and thus a ship, and a room. 
3. If the price of a room changes, all cruise pricing and cost must be updated. If any of those costs are updated through the system, so too is the cost for the passengers.
4. If a cruise is added it must follow rule 1.
5. Ships can only be removed if they are no longer part of a cruise
6. Accepting recommendations from either of the calculator options will properly set all the pricing as described above.

### Current Features
Cruises can be added
Ships can be added
Passengers can be added
Various display options for cruises, ships, passengers (including sorting options for cruise profit displays)
Calculator menu with simulator options

### Original Artifact Explanation
The original artifact focused on created a menu system, and understanding getters and setters and class objects. This was very basic, and a lot of the code was present. The enhancment greatly expanded upon this.


