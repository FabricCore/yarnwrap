package yarnwrap.registry;
public class ContextSwapper { public net.minecraft.registry.ContextSwapper wrapperContained; public ContextSwapper(net.minecraft.registry.ContextSwapper wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.DataResult swapContext(com.mojang.serialization.Codec codec,java.lang.Object value,Object registries) { return wrapperContained.swapContext(codec,value,registries); }
// public static com.mojang.serialization.DataResult swapContext(com.mojang.serialization.Codec codec,java.lang.Object value,Object registries, ) { return net.minecraft.registry.ContextSwapper.swapContext(codec,value,registries); }

}