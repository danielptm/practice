def is_prime_easy(num):
    """
    Uses the basic tricks of checking if a number is prime.
    Criteria: If its suffix ends in 0, 2, 4, 6, 8
    Criteria2: If it is greater than 5 but suffix is 5
    Criteria3: If all numbers add up to a number that is divisible by 3.
    """
    not_prime_suffixes = [0, 2, 4, 6, 8]
    stringified = str(num)
    for item in not_prime_suffixes:
        if stringified[len(stringified) - 1] == str(item):
            return False
    div_by_three_nums = []
    if len(stringified) > 1:
        div_by_three_nums = stringified.split()
    else:
        div_by_three_nums.append(stringified)
    div_by_three_sum = 0
    for item in div_by_three_nums:
        n = int(item)
        div_by_three_sum = div_by_three_sum + n
    if div_by_three_sum % 3 == 0:
        return False
    if num > 5 and num % 5 == 0:
        return False



def is_prime_naiive(number):
    factors = get_all_factors_for_number(number)
    if factors is None:
        return False
    if len(factors) > 2:
        return False
    return True

def get_all_factors_for_number(number):
    result = []
    for i in range(1, number, 1):
        if number % i == 0:
            result.append(i)
        if len(result) > 2:
            return None
    result.append(number)
    return result

def sum_nums_div_3(number):
    stringified = str(number)
    split = stringified.split()
    sum_num = 0
    for item in split:
        sum_num = sum_num + int(item)
    if sum_num % 3 == 0:
        return True
    return False

