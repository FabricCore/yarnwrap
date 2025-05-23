package yarnwrap.client.render.item.property.numeric;
public class CustomModelDataFloatProperty { public net.minecraft.client.render.item.property.numeric.CustomModelDataFloatProperty wrapperContained; public CustomModelDataFloatProperty(net.minecraft.client.render.item.property.numeric.CustomModelDataFloatProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.CustomModelDataFloatProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.CustomModelDataFloatProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65658(Object instance) { return wrapperContained.method_65658(instance); }
// public static com.mojang.datafixers.kinds.App method_65658(Object instance, ) { return net.minecraft.client.render.item.property.numeric.CustomModelDataFloatProperty.method_65658(instance); }

}