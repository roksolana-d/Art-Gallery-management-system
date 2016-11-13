# Art-Gallery-management-system
It was my course work for Software Architecture using 15 different design patterns to show how art gallery exhbits should be managed. 
In particular, this system should show the halls and their exhibits, information about them for the gallery visitors. It provides 
understandable interface for user (fro now it`s console) and represents main gallery processes. It has a nice feature using which you can see the reaction of some types of visitors on the halls.

Abstract factory pattern is used for creation of paintings of High Renaissance style. This hall would be the most decorated because 
Golden frames and Bronze frames are used (through Decorator pattern as parallel to paintings objects hierarchy). Each painting class is derived from abstract painting according to the author and all of them display the main data about paintings. Paintings are created using different factories derived from an abstract one. PaintingApp helps to set and get paintings, add new ones.

Factory method pattern is used to create paintings of impressionism style for the collection. Paintings data is set in constructors and displayed by toString() method. All the objects derived from ImpressionismPainting and are created using SimplePaintingFactory. Based on the input data (authors) object of particular type is created. Flyweight pattern is implemented through HashMap in SimplePaintingFactory class. It reuses already existing objects and creates new which helps to organize and use resources in an efficient way.

Template pattern is used here to create paintings of baroque style for a hall using abstract template. All the parameters are set in each painting class derived from abstract basing on the author. Painting itself is created using collect() method. The Null Object pattern defines the empty space for nonexistent in this hall picture for now. 

Builder pattern is used for creating sculptures. It shows the sequential way in which managers collect these objects and data about them which is displayed for users. AbstractBuilder is implemented by different builders depending on the author. Each of them sets all the
parameters(qualities) of objects to be created.There are different variations of methods for changing some qualities after the creation if it`s needed. AbstractSculpture holds the abstract level of the representation. Also, it implements cloneable interface for Prototype pattern. It allows to create a shallow copy of an object with some changed properties. For example, sculpture of the same author but different name and material. Collector is object step by step generator itself through collect() method.

Singletone pattern is used to create unique fireplace object and prohibit its recreation by private constructor. So an object can be created only through getInstance() method. The information about fireplace is displayed too.

Command pattern encapsulates different command that represent manager`s duties. So different halls are created in the Gallery class through the methods and paintings are arranged there. Each class for specific command implements the same method but in its own unique way. They implement ICommand interface and reference to the Gallery class. GalleryManager execute commands and set commands to be implemented.

Bridge pattern creates abstract level for some abstract gallery with possibilities to execute and add some commands to the system using connection (reference) with the ICommand interface. Level of concrete implementation is represented by the RemoteControl of the gallery which has buttons, some commands can be inserted there and can be implemented using buttons numbers respectively. Also, NewCommand class defines insertion of the command right in the constructor and method for effective command execution.

Visitor pattern defines hierarchy of items – collections of paintings and hierarchy of visitors (artlover, expert, regular teenager). In each painting collection class paintings are assembled into array lists and outputted for the viewer. Also, in every class there`s accept method which is implemented from ItemsCollection interface. Visitors implement GalleryVisitor interface, so they implement visit method for each type of item (paintings) collection. In visit methods they can express their impressions about collections. Proxy pattern is used for limiting access to the halls, it works as controller. It also implements Visitor interface.

Strategy pattern is used to divide users behavior. Manager and Visitor objects are extended from GalleryAppUser, so they can implement some operation in their own way and set specific behavior. Two types of behaviours are extended from common interface so they implement execute() method differently.

In the future I plan to decrease the number of patterns used for flexibility of usage nd maintanance. And to create some swing interface at the least. Hope, that this project will grow into something useful :) 
