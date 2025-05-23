package yarnwrap.client.render.item.tint;
public class MapColorTintSource { public net.minecraft.client.render.item.tint.MapColorTintSource wrapperContained; public MapColorTintSource(net.minecraft.client.render.item.tint.MapColorTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.MapColorTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.MapColorTintSource.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65396(Object instance) { return wrapperContained.method_65396(instance); }
// public static com.mojang.datafixers.kinds.App method_65396(Object instance, ) { return net.minecraft.client.render.item.tint.MapColorTintSource.method_65396(instance); }

}