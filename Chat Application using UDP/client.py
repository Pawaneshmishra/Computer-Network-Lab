#191921 Pawanesh Mishra

import socket
import sys
client = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)

ip = input('Enter the IP of to connect : ')
port = int(input('Enter the port which to use : '))

print('Connection Established !!!')
while True:
    message = input("CLIENT :").encode()
    client.sendto(message, (ip, port))
    data, address = client.recvfrom(2048)
    
    if data.decode() ==  "end":
        print("SERVER : Bye")
        client.sendto(b"bye", (ip, port))
        break
    print("SERVER :",data.decode())