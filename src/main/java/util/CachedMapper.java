package yarnwrap.util;
public class CachedMapper { public net.minecraft.util.CachedMapper wrapperContained; public CachedMapper(net.minecraft.util.CachedMapper wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function mapper() { return wrapperContained.mapper; }
// public java.lang.Object cachedInput() { return wrapperContained.cachedInput; }
// public java.lang.Object cachedOutput() { return wrapperContained.cachedOutput; }
public java.lang.Object map(java.lang.Object input) { return wrapperContained.map(input); }

}