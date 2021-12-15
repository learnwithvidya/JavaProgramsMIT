class P8 {
  public static void divideByZero() {
    throw new ArithmeticException("Logical Error: Trying to divide by 0.");
  }

  public static void main(String[] args) {
    divideByZero();
  }
}

