package yarnwrap.test;
public class UnknownTestException { public net.minecraft.test.UnknownTestException wrapperContained; public UnknownTestException(net.minecraft.test.UnknownTestException wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Throwable throwable() { return wrapperContained.throwable; }
// public void throwable(java.lang.Throwable value) { wrapperContained.throwable = value; }
// public static java.lang.Throwable throwable() { return net.minecraft.test.UnknownTestException.throwable; }
// public static void throwable(java.lang.Throwable value, ) { net.minecraft.test.UnknownTestException.throwable = value; }

public UnknownTestException(java.lang.Throwable throwable) { this.wrapperContained = new net.minecraft.test.UnknownTestException(throwable); }

}