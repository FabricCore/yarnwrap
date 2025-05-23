package yarnwrap.client.render.item.property.numeric;
public class UseDurationProperty { public net.minecraft.client.render.item.property.numeric.UseDurationProperty wrapperContained; public UseDurationProperty(net.minecraft.client.render.item.property.numeric.UseDurationProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.UseDurationProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.UseDurationProperty.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65672(Object instance) { return wrapperContained.method_65672(instance); }
// public static com.mojang.datafixers.kinds.App method_65672(Object instance, ) { return net.minecraft.client.render.item.property.numeric.UseDurationProperty.method_65672(instance); }
// public int getTicksUsedSoFar(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { return wrapperContained.getTicksUsedSoFar(stack.wrapperContained,user.wrapperContained); }
// public static int getTicksUsedSoFar(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user, ) { return net.minecraft.client.render.item.property.numeric.UseDurationProperty.getTicksUsedSoFar(stack.wrapperContained,user.wrapperContained); }

}