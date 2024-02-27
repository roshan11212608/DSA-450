# Python program to demonstrate mean()
# function from the statistics module

# Importing the statistics module
import statistics as sd
import pandas as pd

# list of positive integer numbers
df=pd.read_csv(r'C:\Users\91798\OneDrive\Desktop\Meann.csv')
#data1= = [1,2,51,6,7]

#x = sd.mean(df)
sum_age=df["age"].sum()

length_n = len(df["age"])

print ("Total frequency :: ",sum_age)
print ("No.of items :: ",length_n)

Mean = sum_age/length_n

print ("Mean :: ",Mean)

