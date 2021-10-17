#191921 Pawanesh Mishra

import socket
import sys
client = socket.socket(socket.AF_INET,socket.SOCK_STREAM)

server_address = ('localhost',10000)
client.connect(server_address)
print("Connecting to server :", server_address)

message = input()
client.sendall(message.encode())
while message != 'end':
    data = client.recv(1000).decode()
    if data:
        print('SERVER :', end=" ")
        print(data)
        print('ME :', end = " ")
        message = input()
        client.sendall(message.encode())
    else:
        break

client.close()