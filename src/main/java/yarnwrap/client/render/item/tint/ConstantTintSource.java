package yarnwrap.client.render.item.tint;
public class ConstantTintSource { public net.minecraft.client.render.item.tint.ConstantTintSource wrapperContained; public ConstantTintSource(net.minecraft.client.render.item.tint.ConstantTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.ConstantTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.ConstantTintSource.CODEC = value; }

public ConstantTintSource(int value) { this.wrapperContained = new net.minecraft.client.render.item.tint.ConstantTintSource(value); }
// public com.mojang.datafixers.kinds.App method_65388(Object instance) { return wrapperContained.method_65388(instance); }
// public static com.mojang.datafixers.kinds.App method_65388(Object instance, ) { return net.minecraft.client.render.item.tint.ConstantTintSource.method_65388(instance); }

}