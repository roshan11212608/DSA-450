# import pandas as pd
# import statistics as sd

# #df=pd.read_csv(r'')
# df=pd.read_csv(r'C:\Users\91798\OneDrive\Desktop\Meann.csv')

# print(df)
# sum_age=df["age"].sum()
# length_age=len(df["age"])
# mean=sum_age/length_age
# print(mean)
# xx=sd.median(df["age"])
# print(xx)
import pandas_datareader as pdr

print(f'pandas_datareader version: {pdr.__version__}')
