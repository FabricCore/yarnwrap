package yarnwrap.client.render.item.tint;
public class TintSource { public net.minecraft.client.render.item.tint.TintSource wrapperContained; public TintSource(net.minecraft.client.render.item.tint.TintSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.client.render.item.tint.TintSource.getCodec(); }
public int getTint(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity user) { return wrapperContained.getTint(stack.wrapperContained,world.wrapperContained,user.wrapperContained); }
// public static int getTint(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity user, ) { return net.minecraft.client.render.item.tint.TintSource.getTint(stack.wrapperContained,world.wrapperContained,user.wrapperContained); }

}