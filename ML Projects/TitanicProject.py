import pandas as pd
import pandas_datareader as web
import matplotlib.pyplot as plt

start_date = "2020-01-1"
end_date = "2020-12-31"
data = web.DataReader(name='TSLA', data_source='yahoo', start=start_date, end=end_date)
print(data)