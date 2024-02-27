import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
from sklearn import linear_model

df = pd.read_csv(r'C:\Users\91798\OneDrive\Desktop\wordcloud.csv')
print(df)
Mean=df.age.mean()
print(Mean)
A1=df.classy.fillna(Mean)
print(A1)

data=sns.lmplot(x ='age', y ='classy', data =df)
print(data)

plt.show()

