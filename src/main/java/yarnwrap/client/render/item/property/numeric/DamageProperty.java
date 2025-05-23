package yarnwrap.client.render.item.property.numeric;
public class DamageProperty { public net.minecraft.client.render.item.property.numeric.DamageProperty wrapperContained; public DamageProperty(net.minecraft.client.render.item.property.numeric.DamageProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.DamageProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.DamageProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65659(Object instance) { return wrapperContained.method_65659(instance); }
// public static com.mojang.datafixers.kinds.App method_65659(Object instance, ) { return net.minecraft.client.render.item.property.numeric.DamageProperty.method_65659(instance); }

}