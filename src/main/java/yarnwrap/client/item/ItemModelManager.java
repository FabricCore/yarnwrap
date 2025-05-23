package yarnwrap.client.item;
public class ItemModelManager { public net.minecraft.client.item.ItemModelManager wrapperContained; public ItemModelManager(net.minecraft.client.item.ItemModelManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function modelGetter() { return wrapperContained.modelGetter; }
// public void modelGetter(java.util.function.Function value) { wrapperContained.modelGetter = value; }
// public static java.util.function.Function modelGetter() { return net.minecraft.client.item.ItemModelManager.modelGetter; }
// public static void modelGetter(java.util.function.Function value, ) { net.minecraft.client.item.ItemModelManager.modelGetter = value; }

// public java.util.function.Function propertiesGetter() { return wrapperContained.propertiesGetter; }
// public void propertiesGetter(java.util.function.Function value) { wrapperContained.propertiesGetter = value; }
// public static java.util.function.Function propertiesGetter() { return net.minecraft.client.item.ItemModelManager.propertiesGetter; }
// public static void propertiesGetter(java.util.function.Function value, ) { net.minecraft.client.item.ItemModelManager.propertiesGetter = value; }

public ItemModelManager(yarnwrap.client.render.model.BakedModelManager bakedModelManager) { this.wrapperContained = new net.minecraft.client.item.ItemModelManager(bakedModelManager.wrapperContained); }
// public void resolveProfileComponent(yarnwrap.item.ItemStack stack) { wrapperContained.resolveProfileComponent(stack.wrapperContained); }
// public static void resolveProfileComponent(yarnwrap.item.ItemStack stack, ) { net.minecraft.client.item.ItemModelManager.resolveProfileComponent(stack.wrapperContained); }
// public void method_65594(yarnwrap.item.ItemStack profile) { wrapperContained.method_65594(profile.wrapperContained); }
// public static void method_65594(yarnwrap.item.ItemStack profile, ) { net.minecraft.client.item.ItemModelManager.method_65594(profile.wrapperContained); }
public void updateForNonLivingEntity(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.entity.Entity entity) { wrapperContained.updateForNonLivingEntity(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,entity.wrapperContained); }
// public static void updateForNonLivingEntity(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.entity.Entity entity, ) { net.minecraft.client.item.ItemModelManager.updateForNonLivingEntity(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,entity.wrapperContained); }
public void update(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.world.World world,yarnwrap.entity.LivingEntity entity,int seed) { wrapperContained.update(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }
// public static void update(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.world.World world,yarnwrap.entity.LivingEntity entity,int seed, ) { net.minecraft.client.item.ItemModelManager.update(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }
public void updateForLivingEntity(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.entity.LivingEntity entity) { wrapperContained.updateForLivingEntity(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,entity.wrapperContained); }
// public static void updateForLivingEntity(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.client.item.ItemModelManager.updateForLivingEntity(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,entity.wrapperContained); }
public void clearAndUpdate(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.world.World world,yarnwrap.entity.LivingEntity entity,int seed) { wrapperContained.clearAndUpdate(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }
// public static void clearAndUpdate(yarnwrap.client.render.item.ItemRenderState renderState,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemDisplayContext displayContext,yarnwrap.world.World world,yarnwrap.entity.LivingEntity entity,int seed, ) { net.minecraft.client.item.ItemModelManager.clearAndUpdate(renderState.wrapperContained,stack.wrapperContained,displayContext.wrapperContained,world.wrapperContained,entity.wrapperContained,seed); }
public boolean hasHandAnimationOnSwap(yarnwrap.item.ItemStack stack) { return wrapperContained.hasHandAnimationOnSwap(stack.wrapperContained); }
// public static boolean hasHandAnimationOnSwap(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.item.ItemModelManager.hasHandAnimationOnSwap(stack.wrapperContained); }

}