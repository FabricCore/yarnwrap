package yarnwrap.util.math;
public class Divider { public net.minecraft.util.math.Divider wrapperContained; public Divider(net.minecraft.util.math.Divider wrapperContained) { this.wrapperContained = wrapperContained; }

// public int divisor() { return wrapperContained.divisor; }
// public void divisor(int value) { wrapperContained.divisor = value; }
// public int quotient() { return wrapperContained.quotient; }
// public void quotient(int value) { wrapperContained.quotient = value; }
// public int mod() { return wrapperContained.mod; }
// public void mod(int value) { wrapperContained.mod = value; }
// public int returnedCount() { return wrapperContained.returnedCount; }
// public void returnedCount(int value) { wrapperContained.returnedCount = value; }
// public int remainder() { return wrapperContained.remainder; }
// public void remainder(int value) { wrapperContained.remainder = value; }
public Divider(int dividend,int divisor) { this.wrapperContained = new net.minecraft.util.math.Divider(dividend,divisor); }
public java.lang.Iterable asIterable(int dividend,int divisor) { return wrapperContained.asIterable(dividend,divisor); }

}