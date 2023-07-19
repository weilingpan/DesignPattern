# reference:https://mark1002.github.io/2018/07/31/python-%E5%AF%A6%E7%8F%BE-singleton-%E6%A8%A1%E5%BC%8F/

class SingleTonNew: 
    _instance = None 
    def __new__(cls, *args, **kwargs): 
        if cls._instance is None: 
            cls._instance = super().__new__(cls) 
        return cls._instance 
         
    def __init__(self, a, b): 
        self.a = a 
        self.b = b

s1 = SingleTonNew(a=11, b=21)
print(id(s1), s1.a, s1.b) #11 21
s2 = SingleTonNew(a=10, b=2)
print(id(s1), s1.a, s1.b) #10 2
print(id(s2), s2.a, s2.b) #10 2