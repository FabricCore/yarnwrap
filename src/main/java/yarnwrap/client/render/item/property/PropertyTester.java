package yarnwrap.client.render.item.property;
public class PropertyTester { public net.minecraft.client.render.item.property.PropertyTester wrapperContained; public PropertyTester(net.minecraft.client.render.item.property.PropertyTester wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean test(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed,yarnwrap.item.ItemDisplayContext displayContext) { return wrapperContained.test(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed,displayContext.wrapperContained); }
// public static boolean test(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed,yarnwrap.item.ItemDisplayContext displayContext, ) { return net.minecraft.client.render.item.property.PropertyTester.test(stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed,displayContext.wrapperContained); }

}