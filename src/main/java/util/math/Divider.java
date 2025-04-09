package yarnwrap.util.math;
public class Divider { public net.minecraft.util.math.Divider wrapperContained; public Divider(net.minecraft.util.math.Divider wrapperContained) { this.wrapperContained = wrapperContained; }

// public int divisor() { return wrapperContained.divisor; }
// public int quotient() { return wrapperContained.quotient; }
// public int mod() { return wrapperContained.mod; }
// public int returnedCount() { return wrapperContained.returnedCount; }
// public int remainder() { return wrapperContained.remainder; }
public java.lang.Iterable asIterable(int dividend,int divisor) { return wrapperContained.asIterable(dividend,divisor); }

}