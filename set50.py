n=int(input())
flags=False
for i in range(0,100):
  if 2**i == n:
    print('yes')
    flags=False
    break;
  else:
    flags=True
if(flags==True):
  print('no')
