package yarnwrap.client.tutorial;
public class TutorialStepHandler { public net.minecraft.client.tutorial.TutorialStepHandler wrapperContained; public TutorialStepHandler(net.minecraft.client.tutorial.TutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void onSlotUpdate(yarnwrap.item.ItemStack stack) { wrapperContained.onSlotUpdate(stack.wrapperContained); }
// public static void onSlotUpdate(yarnwrap.item.ItemStack stack, ) { net.minecraft.client.tutorial.TutorialStepHandler.onSlotUpdate(stack.wrapperContained); }
public void onTarget(yarnwrap.client.world.ClientWorld world,yarnwrap.util.hit.HitResult hitResult) { wrapperContained.onTarget(world.wrapperContained,hitResult.wrapperContained); }
// public static void onTarget(yarnwrap.client.world.ClientWorld world,yarnwrap.util.hit.HitResult hitResult, ) { net.minecraft.client.tutorial.TutorialStepHandler.onTarget(world.wrapperContained,hitResult.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.tutorial.TutorialStepHandler.tick(); }
public void onBlockBreaking(yarnwrap.client.world.ClientWorld client,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float progress) { wrapperContained.onBlockBreaking(client.wrapperContained,pos.wrapperContained,state.wrapperContained,progress); }
// public static void onBlockBreaking(yarnwrap.client.world.ClientWorld client,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float progress, ) { net.minecraft.client.tutorial.TutorialStepHandler.onBlockBreaking(client.wrapperContained,pos.wrapperContained,state.wrapperContained,progress); }
public void onMouseUpdate(double deltaX,double deltaY) { wrapperContained.onMouseUpdate(deltaX,deltaY); }
// public static void onMouseUpdate(double deltaX,double deltaY, ) { net.minecraft.client.tutorial.TutorialStepHandler.onMouseUpdate(deltaX,deltaY); }
public void destroy() { wrapperContained.destroy(); }
// public static void destroy() { net.minecraft.client.tutorial.TutorialStepHandler.destroy(); }
public void onMovement(yarnwrap.client.input.Input input) { wrapperContained.onMovement(input.wrapperContained); }
// public static void onMovement(yarnwrap.client.input.Input input, ) { net.minecraft.client.tutorial.TutorialStepHandler.onMovement(input.wrapperContained); }
public void onInventoryOpened() { wrapperContained.onInventoryOpened(); }
// public static void onInventoryOpened() { net.minecraft.client.tutorial.TutorialStepHandler.onInventoryOpened(); }

}