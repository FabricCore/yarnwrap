package yarnwrap.util.math;
public class Divider { public net.minecraft.util.math.Divider wrapperContained; public Divider(net.minecraft.util.math.Divider wrapperContained) { this.wrapperContained = wrapperContained; }

// public int divisor() { return wrapperContained.divisor; }
// public void divisor(int value) { wrapperContained.divisor = value; }
// public static int divisor() { return net.minecraft.util.math.Divider.divisor; }
// public static void divisor(int value, ) { net.minecraft.util.math.Divider.divisor = value; }

// public int quotient() { return wrapperContained.quotient; }
// public void quotient(int value) { wrapperContained.quotient = value; }
// public static int quotient() { return net.minecraft.util.math.Divider.quotient; }
// public static void quotient(int value, ) { net.minecraft.util.math.Divider.quotient = value; }

// public int mod() { return wrapperContained.mod; }
// public void mod(int value) { wrapperContained.mod = value; }
// public static int mod() { return net.minecraft.util.math.Divider.mod; }
// public static void mod(int value, ) { net.minecraft.util.math.Divider.mod = value; }

// public int returnedCount() { return wrapperContained.returnedCount; }
// public void returnedCount(int value) { wrapperContained.returnedCount = value; }
// public static int returnedCount() { return net.minecraft.util.math.Divider.returnedCount; }
// public static void returnedCount(int value, ) { net.minecraft.util.math.Divider.returnedCount = value; }

// public int remainder() { return wrapperContained.remainder; }
// public void remainder(int value) { wrapperContained.remainder = value; }
// public static int remainder() { return net.minecraft.util.math.Divider.remainder; }
// public static void remainder(int value, ) { net.minecraft.util.math.Divider.remainder = value; }

public Divider(int dividend,int divisor) { this.wrapperContained = new net.minecraft.util.math.Divider(dividend,divisor); }
// public java.lang.Iterable asIterable(int dividend,int divisor) { return wrapperContained.asIterable(dividend,divisor); }
// public static java.lang.Iterable asIterable(int dividend,int divisor, ) { return net.minecraft.util.math.Divider.asIterable(dividend,divisor); }

}