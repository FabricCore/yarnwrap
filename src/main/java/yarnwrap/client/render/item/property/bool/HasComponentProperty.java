package yarnwrap.client.render.item.property.bool;
public class HasComponentProperty { public net.minecraft.client.render.item.property.bool.HasComponentProperty wrapperContained; public HasComponentProperty(net.minecraft.client.render.item.property.bool.HasComponentProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.bool.HasComponentProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.bool.HasComponentProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65642(Object instance) { return wrapperContained.method_65642(instance); }
// public static com.mojang.datafixers.kinds.App method_65642(Object instance, ) { return net.minecraft.client.render.item.property.bool.HasComponentProperty.method_65642(instance); }

}