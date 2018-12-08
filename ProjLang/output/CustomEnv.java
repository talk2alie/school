import java.util.HashMap;

public class CustomEnv implements Env {
    private final HashMap<String, Value> environment;

    public CustomEnv() {
        this(new HashMap<>());
    }

    private CustomEnv(HashMap<String, Value> values) {
        environment = values;
    }

    @Override
    public Env addBinding(String id, Value v) {
        environment.put(id, v);
        return new CustomEnv(environment);
    }

    @Override
    public Value lookup(String id) throws UnboundVar {
        Value value = environment.get(id);
        if(value == null) {
            throw new UnboundVar("No binding found");
        }
        return value;
    }

    @Override
    public Env updateBinding(String id, Value v) throws UnboundVar {
        lookup(id);
        environment.put(id, v);
        return new CustomEnv(environment);
    }
}