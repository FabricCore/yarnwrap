package yarnwrap.client.render.item.property.bool;
public class CustomModelDataFlagProperty { public net.minecraft.client.render.item.property.bool.CustomModelDataFlagProperty wrapperContained; public CustomModelDataFlagProperty(net.minecraft.client.render.item.property.bool.CustomModelDataFlagProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.bool.CustomModelDataFlagProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.bool.CustomModelDataFlagProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65641(Object instance) { return wrapperContained.method_65641(instance); }
// public static com.mojang.datafixers.kinds.App method_65641(Object instance, ) { return net.minecraft.client.render.item.property.bool.CustomModelDataFlagProperty.method_65641(instance); }

}