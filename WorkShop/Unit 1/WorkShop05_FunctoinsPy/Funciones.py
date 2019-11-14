class Student:

    university = 'ESPE'

    def __init__(self,_id,_name,_age,_career,_cell_number):
        self.id = _id
        self.name = _name
        self.age = _age
        self.career = _career
        self.cell_number = _cell_number
        

        class Phone:

            def __init__(self, _number):
                
                self.number = _number 
            def __repr__(self):
                return 'Phone({})'.format(self.number)
        self.phone = Phone(_cell_number)



    def __repr__(self):
        return 'Student({}, {}, {}, {},{})'.format(self.id, self.name, self.age, self.career, self.phone)
    
    def say_name(self):
        print('MY name is {}'.format(self.name))


student = Student(1, 'Stalin',19,'Inginieria de software','098363533')
student1 = Student(1, 'Wilson',18,'software engineering','098335333')
student.say_name()
print(student.university)
print(student.university)
print(student1.university)

#print(Phone)
print(student)