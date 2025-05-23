package yarnwrap.client.render.item.property.numeric;
public class UseCycleProperty { public net.minecraft.client.render.item.property.numeric.UseCycleProperty wrapperContained; public UseCycleProperty(net.minecraft.client.render.item.property.numeric.UseCycleProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.UseCycleProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.UseCycleProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65671(Object instance) { return wrapperContained.method_65671(instance); }
// public static com.mojang.datafixers.kinds.App method_65671(Object instance, ) { return net.minecraft.client.render.item.property.numeric.UseCycleProperty.method_65671(instance); }

}