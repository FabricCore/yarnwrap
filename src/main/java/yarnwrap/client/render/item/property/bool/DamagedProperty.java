package yarnwrap.client.render.item.property.bool;
public class DamagedProperty { public net.minecraft.client.render.item.property.bool.DamagedProperty wrapperContained; public DamagedProperty(net.minecraft.client.render.item.property.bool.DamagedProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.bool.DamagedProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.bool.DamagedProperty.CODEC = value; }


}