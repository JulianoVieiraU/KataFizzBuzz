public class FizzBuzz {

    public String execute(int value) {
        if(fizz(value) && buzz(value)) return "FizzBuzz";

        if (fizz(value)) return "Fizz";

        if (buzz(value)) return "Buzz";

        return Integer.toString(value);
    }

    private boolean fizz(int value){
        return value %3 == 0;
    }

    private boolean buzz(int value){
        return value %5 == 0;
    }
}
