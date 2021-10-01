#191921 Pawanesh Mishra

# importing libraries
import socket

# create a socket object
s = socket.socket() 

# get local machine name
host = socket.gethostname()                           

#9999 used as its not utilized elsewhere
port = 9999

#creating tuple
s.connect((host, port))                               

# Receive no more than 1024 bytes
tm = s.recv(1024)                                     

s.close()

print("The time of server is %s" % tm.decode('ascii'))
