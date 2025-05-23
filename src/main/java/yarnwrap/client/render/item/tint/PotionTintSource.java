package yarnwrap.client.render.item.tint;
public class PotionTintSource { public net.minecraft.client.render.item.tint.PotionTintSource wrapperContained; public PotionTintSource(net.minecraft.client.render.item.tint.PotionTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.PotionTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.PotionTintSource.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65397(Object instance) { return wrapperContained.method_65397(instance); }
// public static com.mojang.datafixers.kinds.App method_65397(Object instance, ) { return net.minecraft.client.render.item.tint.PotionTintSource.method_65397(instance); }

}