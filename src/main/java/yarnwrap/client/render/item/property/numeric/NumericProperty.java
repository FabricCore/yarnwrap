package yarnwrap.client.render.item.property.numeric;
public class NumericProperty { public net.minecraft.client.render.item.property.numeric.NumericProperty wrapperContained; public NumericProperty(net.minecraft.client.render.item.property.numeric.NumericProperty wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.client.render.item.property.numeric.NumericProperty.getCodec(); }
public float getValue(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity holder,int seed) { return wrapperContained.getValue(stack.wrapperContained,world.wrapperContained,holder.wrapperContained,seed); }
// public static float getValue(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity holder,int seed, ) { return net.minecraft.client.render.item.property.numeric.NumericProperty.getValue(stack.wrapperContained,world.wrapperContained,holder.wrapperContained,seed); }

}