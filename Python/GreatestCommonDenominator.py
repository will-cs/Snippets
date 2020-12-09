def gcd(a, b):
    for c in range(min(a, b), 0, -1):
        if a % c == b % c == 0:
            return c
