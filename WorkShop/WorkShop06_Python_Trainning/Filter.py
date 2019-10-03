def my_filter(my_filter_func, my_list):
    result = []
    for item in my_list:
        if my_filter_func(item) is True:
            result.append(item)
    return result

if __name__ == '__main:__' :
    number_list = ['2,4,6,8,11']
    number_list = ['2,4,6,8,11']

    even_numbers = list(filter(even, number_list))
    even_numbers = list(my_filter(even, number_list))
    print(even_numbers)