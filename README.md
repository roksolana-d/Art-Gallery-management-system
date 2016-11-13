# Art-Gallery-management-system
It was my course work for Software Architecture using 15 different design patterns to show how art gallery exhbits should be managed. 
In particular, this system should show the halls and their exhibits, information about them for the gallery visitors. It provides 
understandable interface for user (fro now it`s console) and represents main gallery processes.

Abstract factory pattern is used for creation of paintings of High Renaissance style. This hall would be the most decorated because 
Golden frames and Bronze frames are used (through Decorator pattern as parallel to paintings objects hierarchy). Each painting class is derived from abstract painting according to the author and all of them display the main data about paintings. Paintings are created using 
different factories derived from an abstract one. PaintingApp helps to set and get paintings, add new ones.




In the future I plan to decrease the number of patterns used for flexibility of usage nd maintanance. And to create some swing interface at 
the least. Hope, that this project will grow into something useful :) 
