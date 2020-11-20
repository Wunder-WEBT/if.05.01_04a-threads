package at.htlleonding.fibonacci;

import java.util.concurrent.Callable;

public class Call_Able implements Callable<Integer> {
    private int n;

    public Call_Able(int n){
        this.n=n;
    }

    @Override
    public Integer call() throws Exception {
        return getNumber(n);
    }
    private int getNumber(int n) {
        if (n < 2)
            return 1;
        else
            return getNumber(n - 1) + getNumber(n - 2);
    }
}
