package yarnwrap.util;
public class CachedMapper { public net.minecraft.util.CachedMapper wrapperContained; public CachedMapper(net.minecraft.util.CachedMapper wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function mapper() { return wrapperContained.mapper; }
// public void mapper(java.util.function.Function value) { wrapperContained.mapper = value; }
// public static java.util.function.Function mapper() { return net.minecraft.util.CachedMapper.mapper; }
// public static void mapper(java.util.function.Function value, ) { net.minecraft.util.CachedMapper.mapper = value; }

// public java.lang.Object cachedInput() { return wrapperContained.cachedInput; }
// public void cachedInput(java.lang.Object value) { wrapperContained.cachedInput = value; }
// // public static java.lang.Object cachedInput() { return net.minecraft.util.CachedMapper.cachedInput; }
// public static void cachedInput(java.lang.Object value, ) { net.minecraft.util.CachedMapper.cachedInput = value; }

// public java.lang.Object cachedOutput() { return wrapperContained.cachedOutput; }
// public void cachedOutput(java.lang.Object value) { wrapperContained.cachedOutput = value; }
// // public static java.lang.Object cachedOutput() { return net.minecraft.util.CachedMapper.cachedOutput; }
// public static void cachedOutput(java.lang.Object value, ) { net.minecraft.util.CachedMapper.cachedOutput = value; }

public CachedMapper(java.util.function.Function mapper) { this.wrapperContained = new net.minecraft.util.CachedMapper(mapper); }
public java.lang.Object map(java.lang.Object input) { return wrapperContained.map(input); }
// public static java.lang.Object map(java.lang.Object input, ) { return net.minecraft.util.CachedMapper.map(input); }

}