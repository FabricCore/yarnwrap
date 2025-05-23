package yarnwrap.client.render.item.property.numeric;
public class CountProperty { public net.minecraft.client.render.item.property.numeric.CountProperty wrapperContained; public CountProperty(net.minecraft.client.render.item.property.numeric.CountProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.CountProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.CountProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65657(Object instance) { return wrapperContained.method_65657(instance); }
// public static com.mojang.datafixers.kinds.App method_65657(Object instance, ) { return net.minecraft.client.render.item.property.numeric.CountProperty.method_65657(instance); }

}