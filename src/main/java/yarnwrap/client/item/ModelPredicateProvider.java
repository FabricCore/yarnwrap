package yarnwrap.client.item;
public class ModelPredicateProvider { public net.minecraft.client.item.ModelPredicateProvider wrapperContained; public ModelPredicateProvider(net.minecraft.client.item.ModelPredicateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public float call(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed) { return wrapperContained.call(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }
// public static float call(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed, ) { return net.minecraft.client.item.ModelPredicateProvider.call(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }

}