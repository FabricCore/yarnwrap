package yarnwrap.client.render.item.tint;
public class CustomModelDataTintSource { public net.minecraft.client.render.item.tint.CustomModelDataTintSource wrapperContained; public CustomModelDataTintSource(net.minecraft.client.render.item.tint.CustomModelDataTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.CustomModelDataTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.CustomModelDataTintSource.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65390(Object instance) { return wrapperContained.method_65390(instance); }
// public static com.mojang.datafixers.kinds.App method_65390(Object instance, ) { return net.minecraft.client.render.item.tint.CustomModelDataTintSource.method_65390(instance); }

}