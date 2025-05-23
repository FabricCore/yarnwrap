package yarnwrap.client.render.item.property.bool;
public class ExtendedViewProperty { public net.minecraft.client.render.item.property.bool.ExtendedViewProperty wrapperContained; public ExtendedViewProperty(net.minecraft.client.render.item.property.bool.ExtendedViewProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.bool.ExtendedViewProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.bool.ExtendedViewProperty.CODEC = value; }


}