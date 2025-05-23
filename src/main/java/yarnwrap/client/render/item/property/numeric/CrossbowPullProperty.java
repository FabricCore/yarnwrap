package yarnwrap.client.render.item.property.numeric;
public class CrossbowPullProperty { public net.minecraft.client.render.item.property.numeric.CrossbowPullProperty wrapperContained; public CrossbowPullProperty(net.minecraft.client.render.item.property.numeric.CrossbowPullProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.CrossbowPullProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.CrossbowPullProperty.CODEC = value; }


}