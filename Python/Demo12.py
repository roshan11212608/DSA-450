import cv2
pathVar=cv2.imread("C:\\Users\\91798\\OneDrive\\Desktop\\download.jpg")
image = cv2.cvtColor(pathVar, cv2.COLOR_BGR2GRAY ) 
cv2.imshow("Window Name",image)
cv2.waitKey(0)
cv2.destroyAllWindows()
print("Code by Roshan kumar yadav")
pixel=pathVar[102,102]
print(pixel)