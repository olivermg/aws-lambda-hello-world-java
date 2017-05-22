package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        String output = "Hello, " + input + "!";

        context.getLogger().log("Input: " + input + ", Output: " + output);

        return output;
    }
}
