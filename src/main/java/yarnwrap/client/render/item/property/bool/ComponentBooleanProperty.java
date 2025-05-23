package yarnwrap.client.render.item.property.bool;
public class ComponentBooleanProperty { public net.minecraft.client.render.item.property.bool.ComponentBooleanProperty wrapperContained; public ComponentBooleanProperty(net.minecraft.client.render.item.property.bool.ComponentBooleanProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.bool.ComponentBooleanProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.bool.ComponentBooleanProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67286(Object instance) { return wrapperContained.method_67286(instance); }
// public static com.mojang.datafixers.kinds.App method_67286(Object instance, ) { return net.minecraft.client.render.item.property.bool.ComponentBooleanProperty.method_67286(instance); }

}