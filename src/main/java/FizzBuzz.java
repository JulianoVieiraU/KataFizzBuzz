public class FizzBuzz {

    public String execute(int value) {
        String var = Integer.toString(value);
        if (fizz(value))
            var = "Fizz";
        if (buzz(value)){
            if (var.equals("Fizz")) {
                var = "FizzBuzz";
            } else {
                var = "Buzz";
            }
        }

        return var;
    }

    private boolean fizz(int value){
        return value %3 == 0;
    }

    private boolean buzz(int value){
        return value %5 == 0;
    }
}
