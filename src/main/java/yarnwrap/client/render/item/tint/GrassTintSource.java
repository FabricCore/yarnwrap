package yarnwrap.client.render.item.tint;
public class GrassTintSource { public net.minecraft.client.render.item.tint.GrassTintSource wrapperContained; public GrassTintSource(net.minecraft.client.render.item.tint.GrassTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.GrassTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.GrassTintSource.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65393(Object instance) { return wrapperContained.method_65393(instance); }
// public static com.mojang.datafixers.kinds.App method_65393(Object instance, ) { return net.minecraft.client.render.item.tint.GrassTintSource.method_65393(instance); }

}