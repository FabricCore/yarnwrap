package yarnwrap.client.render.item.property.select;
public class SelectProperty { public net.minecraft.client.render.item.property.select.SelectProperty wrapperContained; public SelectProperty(net.minecraft.client.render.item.property.select.SelectProperty wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.client.render.item.property.select.SelectProperty.getType(); }
public java.lang.Object getValue(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity user,int seed,yarnwrap.item.ItemDisplayContext displayContext) { return wrapperContained.getValue(stack.wrapperContained,world.wrapperContained,user.wrapperContained,seed,displayContext.wrapperContained); }
// public static java.lang.Object getValue(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity user,int seed,yarnwrap.item.ItemDisplayContext displayContext, ) { return net.minecraft.client.render.item.property.select.SelectProperty.getValue(stack.wrapperContained,world.wrapperContained,user.wrapperContained,seed,displayContext.wrapperContained); }
public com.mojang.serialization.Codec valueCodec() { return wrapperContained.valueCodec(); }
// public static com.mojang.serialization.Codec valueCodec() { return net.minecraft.client.render.item.property.select.SelectProperty.valueCodec(); }

}