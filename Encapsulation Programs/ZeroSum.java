class ZeroSum 
{
    static void main(int n) 
    {
        zeroSumSequences(n);
    }

    static void zeroSumSequences(int N) 
    {
        char[] operators = {'+', '-'};
        int totalCombinations = (int) Math.pow(2, N - 1);
        for (int i = 0; i < totalCombinations; i++) 
        {
            String expression = "1";
            int currentNum = 2;
            int temp = i;
            for (int j = 0; j < N - 1; j++) 
            {
                if (temp % 2 == 1)
                    expression += "+" + currentNum;
                else
                    expression += "-" + currentNum;
                temp /= 2;
                currentNum++;
            }
            if (evaluateExpression(expression) == 0)
                System.out.println(expression + " = 0");
        }
    }

    static int evaluateExpression(String expression) 
    {
        int sum = 0;
        int currentNumber = 0;
        char lastOperator = '+';
        for (int i = 0; i < expression.length(); i++) 
        {
            char ch = expression.charAt(i);
            if (!Character.isDigit(ch) || i == expression.length() - 1) 
            {
                if (lastOperator == '+')
                    sum += currentNumber;
                else if (lastOperator == '-')
                    sum -= currentNumber;
                lastOperator = ch;
                currentNumber = 0;
            }
        }
        return sum;
    }
}
