#--------------> longest substring <-----------------

# def findsub(word,start,end):
#     sindex = -1
#     eindex = -1
#     curr = -1
#     for i in range(len(word)):
#         curr_char = word[i]
#         if curr_char==start:
#             curr = i
#         elif curr_char==end and curr!=-1:
#             if sindex == -1 or (i-curr) > (eindex - sindex):
#                 sindex = curr
#                 eindex = i
#                 curr = -1
    
#     if sindex!=-1 and eindex!=-1:
#         return word[sindex:eindex+1]
#     else:
#         return "no valid"
            

# word = 'abcdefgh'
# start = 'a'
# end = 'e'
# substring = findsub(word,start,end)
# print(f"the substring is {substring}")


#-------------> find perfect number <---------------------------

# import math


# def find(num):
#     if num<0:
#         return -1
#     elif findperfect(num):
#         result = math.sqrt(num)
#         return f"perfect number: {result}"
#     else:
#         return num*(num+1)/2
# def findperfect(num):
#     if num<0:
#         return False
#     divisor_sum = sum([divisor for divisor in range(1,num) if num%divisor==0])
#     return divisor_sum==num

# num = 6
# number = find(num)
# print(number)

#-------> pattern <--------------
# n=5
# num=1
# for i in range(1,n+1):
#     for j in range(1,i+1):
#         print(num, end=" ")
#     num = num+1
#     print()
    
    