import os, sys

arg = int(sys.argv[1])
def main():
    mehak_list = []
    kandu_list = []
    with open('kandu_' + str(arg) + '.txt', 'r+') as f:
        for line in f:
            one_line = line.split(' ')
            if(one_line[len(one_line) - 1] == '\n'):
                one_line = one_line[:len(one_line) - 1]
            one_line.sort()
            if(len(one_line) == 0):
                continue
            kandu_list.append(one_line)
        kandu_list.sort()

    with open('mehak_' + str(arg) + '.txt', 'r+') as f:
        for line in f:
            one_line = line.split(' ')
            if(one_line[len(one_line) - 1] == '\n'):
                one_line = one_line[:len(one_line) - 1]
            one_line.sort()
            if(len(one_line) == 0):
                continue
            mehak_list.append(one_line)
        mehak_list.sort()

    if( not (len(mehak_list) == len(kandu_list))):
        return -1

    for i in range(len(mehak_list)):
        len1 = len(mehak_list[i])
        len2 = len(kandu_list[i])
        if(not(len1 == len2)):
            return -1
        for j in range(len1):
            if(not(mehak_list[i][j] == kandu_list[i][j])):
                return -1
        return 1

if __name__ == '__main__':
    ans = main()
    if(ans == 1):
        print('AMAZEEE')
    else:
        print('BT')