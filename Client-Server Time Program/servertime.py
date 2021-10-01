#191921 Pawanesh Mishra

#importing libraries
import socket                                         
import time

# create a socket object
serversocket = socket.socket() 

# get local machine name
host = socket.gethostname()                           

#port 9999 is not utilized elsewhere
port = 9999                                           

# bind to the port
serversocket.bind((host, port))                                  

# queue up to only 5 bad requests
serversocket.listen(5)                                           

while True:
    # establish a connection
    clientsocket,addr = serversocket.accept()      

    print("Connection established!! from %s" % str(addr))
    currentTime = time.ctime(time.time()) + "\r\n"
    clientsocket.send(currentTime.encode('ascii'))
    clientsocket.close()