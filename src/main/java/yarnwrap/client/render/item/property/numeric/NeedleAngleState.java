package yarnwrap.client.render.item.property.numeric;
public class NeedleAngleState { public net.minecraft.client.render.item.property.numeric.NeedleAngleState wrapperContained; public NeedleAngleState(net.minecraft.client.render.item.property.numeric.NeedleAngleState wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean wobble() { return wrapperContained.wobble; }
// public void wobble(boolean value) { wrapperContained.wobble = value; }
// public static boolean wobble() { return net.minecraft.client.render.item.property.numeric.NeedleAngleState.wobble; }
// public static void wobble(boolean value, ) { net.minecraft.client.render.item.property.numeric.NeedleAngleState.wobble = value; }

// public NeedleAngleState(boolean wobble) { this.wrapperContained = new net.minecraft.client.render.item.property.numeric.NeedleAngleState(wobble); }
public float getValue(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity user,int seed) { return wrapperContained.getValue(stack.wrapperContained,world.wrapperContained,user.wrapperContained,seed); }
// public static float getValue(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity user,int seed, ) { return net.minecraft.client.render.item.property.numeric.NeedleAngleState.getValue(stack.wrapperContained,world.wrapperContained,user.wrapperContained,seed); }
// public float getAngle(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,int seed,yarnwrap.entity.Entity user) { return wrapperContained.getAngle(stack.wrapperContained,world.wrapperContained,seed,user.wrapperContained); }
// public static float getAngle(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,int seed,yarnwrap.entity.Entity user, ) { return net.minecraft.client.render.item.property.numeric.NeedleAngleState.getAngle(stack.wrapperContained,world.wrapperContained,seed,user.wrapperContained); }
// public Object createAngler(float speedMultiplier) { return wrapperContained.createAngler(speedMultiplier); }
// public static Object createAngler(float speedMultiplier, ) { return net.minecraft.client.render.item.property.numeric.NeedleAngleState.createAngler(speedMultiplier); }
// public boolean hasWobble() { return wrapperContained.hasWobble(); }
// public static boolean hasWobble() { return net.minecraft.client.render.item.property.numeric.NeedleAngleState.hasWobble(); }
// public Object createWobblyAngler(float speedMultiplier) { return wrapperContained.createWobblyAngler(speedMultiplier); }
// public static Object createWobblyAngler(float speedMultiplier, ) { return net.minecraft.client.render.item.property.numeric.NeedleAngleState.createWobblyAngler(speedMultiplier); }
// public Object createInstantAngler() { return wrapperContained.createInstantAngler(); }
public static Object createInstantAngler() { return net.minecraft.client.render.item.property.numeric.NeedleAngleState.createInstantAngler(); }

}