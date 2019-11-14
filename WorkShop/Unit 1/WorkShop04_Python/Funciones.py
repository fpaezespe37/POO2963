def print_number_pairs():
    numbers = range (20)
    even = [number for number in numbers if number % 2 == 0]
    odd = [number for number in numbers if number % 2 != 0]

    for even, odd in zip(even, odd):
        print('{} -> {}'.format(even, odd))


print_number_pairs()