package yarnwrap.client.render.item.tint;
public class FireworkTintSource { public net.minecraft.client.render.item.tint.FireworkTintSource wrapperContained; public FireworkTintSource(net.minecraft.client.render.item.tint.FireworkTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.FireworkTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.FireworkTintSource.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65392(Object instance) { return wrapperContained.method_65392(instance); }
// public static com.mojang.datafixers.kinds.App method_65392(Object instance, ) { return net.minecraft.client.render.item.tint.FireworkTintSource.method_65392(instance); }

}