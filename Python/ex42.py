## Animal is-a object (yes, sort of confusing) look at the extra credit (附加练习)
class Animal(object):
    pass

## 定义Dog是一个Animal项目
class Dog(Animal):

    def __init__(self, name):
        ## 接受一个参数name，赋值为实例变量self.name
        self.name = name

## 定义Cat是一个Animal项目
class Cat(Animal):

    def __init__(self, name):
        ## 和上面一样
        self.name = name

## 定义Person是一个项目
class Person(object):

    def __init__(self, name):
        ## 和上面一样
        self.name = name

        ## Person has-a pet of some kind
        self.pet = None

## 定义Employee是一个Person项目
class Employee(Person):

    def __init__(self, name, salary):
        ## ?? hmm what is this strange magic?
        super(Employee, self).__init__(name)
        ## ??
        self.salary = salary

## ??
class Fish(object):
    pass

## ??
class Salmon(Fish):
    pass

## ??
class Halibut(Fish):
    pass


## rover is-a Dog
rover = Dog("Rover")

## ??
satan = Cat("Satan")

## ??
mary = Person("Mary")

## ??
mary.pet = satan

## ??
frank = Employee("Frank", 120000)

## ??
frank.pet = rover

## ??
flipper = Fish()

## ??
crouse = Salmon()

## ??
harry = Halibut()
