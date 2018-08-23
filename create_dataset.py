import os, sys
import random

num_lines = int(sys.argv[1]) #number of lines in the final dataset
max_elements_per_line = int(sys.argv[2]) #max number of elements per line
max_range_of_element = int(sys.argv[3]) #max range of any element

def main():
	with open('big_dataset.txt', 'a+') as f:
		for i in range(num_lines):
			points_to_sample = random.sample(range(1, max_elements_per_line + 1), 1)
			one_line = random.sample(range(1, max_range_of_element + 1), points_to_sample[0])
			for j in range(len(one_line)):
				f.write(str(one_line[j]) + ' ')
			f.write('\n')
		f.close()

if __name__ == '__main__':
	main()