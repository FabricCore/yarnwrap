package yarnwrap.client.render.item.property.bool;
public class CarriedProperty { public net.minecraft.client.render.item.property.bool.CarriedProperty wrapperContained; public CarriedProperty(net.minecraft.client.render.item.property.bool.CarriedProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.bool.CarriedProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.bool.CarriedProperty.CODEC = value; }


}