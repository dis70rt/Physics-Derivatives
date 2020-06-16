package Derivative.Basic;

import java.util.function.DoubleFunction;

public class Derivatives {
    // approximate the limit
    public static final double DX = 0.0001;

    /**
     * @param f f(x), the function to derive
     * @return f'(x), the derivative of the f(x)
     */
    public static DoubleFunction<Double> derive(DoubleFunction<Double> f) {
        return (t) -> (f.apply(t + DX) - f.apply(t)) / DX;
    }

    public static void main(String[] args) {
        
        //{
            // f(x) = sin(x), f'(x) = cos(x)
           // DoubleFunction<Double> sinDeriv = derive(Math::sin);
            
            // f'(2π) = cos(2π) = 1.0
            //assert Math.round(sinDeriv.apply(Math.PI * 2)) == 1.0;
        //}
    }
}
