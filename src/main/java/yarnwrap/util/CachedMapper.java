package yarnwrap.util;
public class CachedMapper { public net.minecraft.util.CachedMapper wrapperContained; public CachedMapper(net.minecraft.util.CachedMapper wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function mapper() { return wrapperContained.mapper; }
// public void mapper(java.util.function.Function value) { wrapperContained.mapper = value; }
// public java.lang.Object cachedInput() { return wrapperContained.cachedInput; }
// public void cachedInput(java.lang.Object value) { wrapperContained.cachedInput = value; }
// public java.lang.Object cachedOutput() { return wrapperContained.cachedOutput; }
// public void cachedOutput(java.lang.Object value) { wrapperContained.cachedOutput = value; }
public java.lang.Object map(java.lang.Object input) { return wrapperContained.map(input); }

}