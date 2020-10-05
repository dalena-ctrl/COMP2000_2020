import java.util.*;

public class StackedActors extends Actor {

    List<Actor> stack;

    public StackedActors(Actor one, Actor two) {
        stack = new ArrayList<Actor>();
        stack.add(one);
        stack.add(two);
    }

	@Override
	public void setPoly() {
        stack.get(0).setPoly();
    }

    @Override
    public float getRedness() {
        float tot = 0f;
        for (Actor a : stack) {
            tot = tot + a.getRedness();
        }
        return tot/stack.size();
    }

    @Override
    public int getMovement() {
        int curr = stack.get(0).getMovement();
        for (Actor a : stack) {
            if (a.getMovement() < curr) {
                curr = a.getMovement();
            }
        }
        return curr;
    }

    public void add(Actor a) {
        stack.add(a);  
    }
}

