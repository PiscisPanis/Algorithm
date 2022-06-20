if __name__ == '__main__':
    a = int(input())
    b = int(input())

    total = 0
    count = 0

    while b > 0:
        print(b % 10 * a)

        total += b % 10 * a * (10 ** count)

        b //= 10
        count += 1

    print(total)
