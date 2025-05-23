package yarnwrap.client.render.item.property.bool;
public class ViewEntityProperty { public net.minecraft.client.render.item.property.bool.ViewEntityProperty wrapperContained; public ViewEntityProperty(net.minecraft.client.render.item.property.bool.ViewEntityProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.bool.ViewEntityProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.bool.ViewEntityProperty.CODEC = value; }


}