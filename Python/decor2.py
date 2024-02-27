def decor(num):
    def func(num3,num2):
        if num2==0:
            print("Cannot Divide by zero")
        else:
            print(num3/num2)
    return func
@decor
def inputNum(num2,num3):
    print("")

inputNum(12,0)
#inputNum(0)