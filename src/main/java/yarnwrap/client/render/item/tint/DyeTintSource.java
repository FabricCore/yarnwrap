package yarnwrap.client.render.item.tint;
public class DyeTintSource { public net.minecraft.client.render.item.tint.DyeTintSource wrapperContained; public DyeTintSource(net.minecraft.client.render.item.tint.DyeTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.DyeTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.DyeTintSource.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65391(Object instance) { return wrapperContained.method_65391(instance); }
// public static com.mojang.datafixers.kinds.App method_65391(Object instance, ) { return net.minecraft.client.render.item.tint.DyeTintSource.method_65391(instance); }

}