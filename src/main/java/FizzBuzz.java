public class FizzBuzz {
    public String execute(int value){
        if(fizz(value)) return "Fizz";
        if(value %5 == 0) return "Buzz";
        return "Fizz";
    }

    private boolean fizz(int value){
        return value %3 == 0;
    }
}
