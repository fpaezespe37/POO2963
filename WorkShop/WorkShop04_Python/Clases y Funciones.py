classes = []

for i in range(10):
    class Dummy:

        def _init_ (self):
            self.name = 'Dummy {}',format(i)

    classes.append(Dummy)

for item in classes:
    dummy = item()
    print (dummy.name)