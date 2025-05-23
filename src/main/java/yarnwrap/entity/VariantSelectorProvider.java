package yarnwrap.entity;
public class VariantSelectorProvider { public net.minecraft.entity.VariantSelectorProvider wrapperContained; public VariantSelectorProvider(net.minecraft.entity.VariantSelectorProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List getSelectors() { return wrapperContained.getSelectors(); }
// public static java.util.List getSelectors() { return net.minecraft.entity.VariantSelectorProvider.getSelectors(); }
// public java.util.List createFallback(int priority) { return wrapperContained.createFallback(priority); }
// public static java.util.List createFallback(int priority, ) { return net.minecraft.entity.VariantSelectorProvider.createFallback(priority); }
// public java.util.List createSingle(Object condition,int priority) { return wrapperContained.createSingle(condition,priority); }
// public static java.util.List createSingle(Object condition,int priority, ) { return net.minecraft.entity.VariantSelectorProvider.createSingle(condition,priority); }
// public void method_67161(java.util.function.Function entry) { wrapperContained.method_67161(entry); }
// public static void method_67161(java.util.function.Function entry, ) { net.minecraft.entity.VariantSelectorProvider.method_67161(entry); }
// public java.util.Optional select(java.util.stream.Stream entries,java.util.function.Function providerGetter,yarnwrap.util.math.random.Random random,java.lang.Object context) { return wrapperContained.select(entries,providerGetter,random.wrapperContained,context); }
// public static java.util.Optional select(java.util.stream.Stream entries,java.util.function.Function providerGetter,yarnwrap.util.math.random.Random random,java.lang.Object context, ) { return net.minecraft.entity.VariantSelectorProvider.select(entries,providerGetter,random.wrapperContained,context); }
// public java.util.stream.Stream select(java.util.stream.Stream entries,java.util.function.Function providerGetter,java.lang.Object context) { return wrapperContained.select(entries,providerGetter,context); }
// public static java.util.stream.Stream select(java.util.stream.Stream entries,java.util.function.Function providerGetter,java.lang.Object context, ) { return net.minecraft.entity.VariantSelectorProvider.select(entries,providerGetter,context); }

}