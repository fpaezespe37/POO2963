class Student:

    university = 'ESPE'

    class Meta:
        name = 'MetaClass'

    def __init__ (self, _id, _name, _age, _career, _cell_number):
        self.id = _id
        self.name = _name
        self.age = _age
        self.career = _career
    

        class Phone:

            def __init__(self, _number):

                self.number = _number

            def __repr__(self):
                return 'Phone({})'.format(self.number)

        self.phone = Phone(_cell_number)        

    def __repr__ (self):
        return 'Student({}, {}, {}, {}, {})'.format(self.id, self.name, self.age, self.career, self.phone)

    def say_name(self):
        print('My name is {}'.format(self.name))

student = Student (1, 'Dennis', 22, 'Ing de Software','0987408437')
student.say_name()

print(student)
print(Student.university)
#print (Student.Meta.name)