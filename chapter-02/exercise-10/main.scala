def equation(x: Double, n: Int): Double = {
  if (n == 0) { 1
  } else {
    if (n > 0) {
      if ((n % 2 == 0) && (n > 2)) {
        equation(equation(x, n / 2), 2)
      } else {
        x * equation(x, n - 1)
      }
    } else {
      1 / equation(x, -n)
    }
  }
}

printf("2  ^ 2  = %f\n",  equation(2, 2))
printf("10 ^ 9  = %f\n", equation(10, 9))
printf("3  ^ 3  = %f\n",  equation(3, 3))
printf("2  ^ -1 = %f\n", equation(2, -1))
printf("5  ^ 0  = %f\n",  equation(5, 0))
