package yarnwrap.client.item;
public class ClampedModelPredicateProvider { public net.minecraft.client.item.ClampedModelPredicateProvider wrapperContained; public ClampedModelPredicateProvider(net.minecraft.client.item.ClampedModelPredicateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public float unclampedCall(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed) { return wrapperContained.unclampedCall(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }
// public static float unclampedCall(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed, ) { return net.minecraft.client.item.ClampedModelPredicateProvider.unclampedCall(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }

}