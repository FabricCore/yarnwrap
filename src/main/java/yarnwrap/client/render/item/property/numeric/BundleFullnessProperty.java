package yarnwrap.client.render.item.property.numeric;
public class BundleFullnessProperty { public net.minecraft.client.render.item.property.numeric.BundleFullnessProperty wrapperContained; public BundleFullnessProperty(net.minecraft.client.render.item.property.numeric.BundleFullnessProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.BundleFullnessProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.BundleFullnessProperty.CODEC = value; }


}