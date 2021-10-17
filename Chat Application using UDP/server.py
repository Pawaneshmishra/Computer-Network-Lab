#191921 Pawanesh Mishra

import socket
import os
server = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)

ip = socket.gethostname()
print("IP address of local machine :",ip) 
port = 1234
server.bind((ip, port))
print("Connection Established !!!")

while True:
    x = server.recvfrom(2048)
    rec_ip = x[1][0]
    rec_port = x[1][1]
    data = x[0].decode()
    print("CLIENT :",data)
    if data == "end":
        break
    message = input("SERVER : ").encode()
    server.sendto(message, (rec_ip, rec_port))
