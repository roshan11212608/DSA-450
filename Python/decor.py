def decor(func):
    def inner(name1):
        if name1=="Abdul":
            print("Mera Abdul Wesa Nahi hai")
        else:
            func(name1)
    return inner
@decor
def wish(name):
    print("hello ",name,"good mrng")
    
wish("Ram")
wish("Abdul")
