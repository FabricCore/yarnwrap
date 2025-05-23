package yarnwrap.client.render.item.property.numeric;
public class CooldownProperty { public net.minecraft.client.render.item.property.numeric.CooldownProperty wrapperContained; public CooldownProperty(net.minecraft.client.render.item.property.numeric.CooldownProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.CooldownProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.CooldownProperty.CODEC = value; }


}