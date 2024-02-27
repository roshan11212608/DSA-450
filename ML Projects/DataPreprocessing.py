# importing libraries  
import numpy as nm  
import matplotlib.pyplot as mtp  
import pandas as pd  
  
#importing datasets  
data_set= pd.read_csv('C:\Users\91798\OneDrive\Desktop\wordcloud.csv')  
  
#Extracting Independent Variable  
x= data_set.iloc[:, :-1].values  
  
#Extracting Dependent variable  
y= data_set.iloc[:, 3].values  
  
#handling missing data(Replacing missing data with the mean value)  
from sklearn.preprocessing import Imputer  
imputer= Imputer(missing_values ='NaN', strategy='mean', axis = 0)  
  
#Fitting imputer object to the independent varibles x.   
imputerimputer= imputer.fit(x[:, 1:3])  
  
#Replacing missing data with the calculated mean value  
x[:, 1:3]= imputer.transform(x[:, 1:3])  
  
#for Country Variable  
from sklearn.preprocessing import LabelEncoder, OneHotEncoder  
label_encoder_x= LabelEncoder()  
x[:, 0]= label_encoder_x.fit_transform(x[:, 0])  
  
#Encoding for dummy variables  
onehot_encoder= OneHotEncoder(categorical_features= [0])    
x= onehot_encoder.fit_transform(x).toarray()  
  
#encoding for purchased variable  
labelencoder_y= LabelEncoder()  
y= labelencoder_y.fit_transform(y)  
  
# Splitting the dataset into training and test set.  
from sklearn.model_selection import train_test_split  
x_train, x_test, y_train, y_test= train_test_split(x, y, test_size= 0.2, random_state=0)  
  
#Feature Scaling of datasets  
from sklearn.preprocessing import StandardScaler  
st_x= StandardScaler()  
x_train= st_x.fit_transform(x_train)  
x_test= st_x.transform(x_test)  