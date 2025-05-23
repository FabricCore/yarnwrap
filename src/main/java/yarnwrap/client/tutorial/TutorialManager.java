package yarnwrap.client.tutorial;
public class TutorialManager { public net.minecraft.client.tutorial.TutorialManager wrapperContained; public TutorialManager(net.minecraft.client.tutorial.TutorialManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.tutorial.TutorialManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.tutorial.TutorialManager.client = value.wrapperContained; }

// public yarnwrap.client.tutorial.TutorialStepHandler currentHandler() { return new yarnwrap.client.tutorial.TutorialStepHandler(wrapperContained.currentHandler); }
// public void currentHandler(yarnwrap.client.tutorial.TutorialStepHandler value) { wrapperContained.currentHandler = value.wrapperContained; }
// public static yarnwrap.client.tutorial.TutorialStepHandler currentHandler() { return new yarnwrap.client.tutorial.TutorialStepHandler(net.minecraft.client.tutorial.TutorialManager.currentHandler); }
// public static void currentHandler(yarnwrap.client.tutorial.TutorialStepHandler value, ) { net.minecraft.client.tutorial.TutorialManager.currentHandler = value.wrapperContained; }

public TutorialManager(yarnwrap.client.MinecraftClient client,yarnwrap.client.option.GameOptions options) { this.wrapperContained = new net.minecraft.client.tutorial.TutorialManager(client.wrapperContained,options.wrapperContained); }
public boolean isInSurvival() { return wrapperContained.isInSurvival(); }
// public static boolean isInSurvival() { return net.minecraft.client.tutorial.TutorialManager.isInSurvival(); }
public void onSlotUpdate(yarnwrap.item.ItemStack stack) { wrapperContained.onSlotUpdate(stack.wrapperContained); }
// public static void onSlotUpdate(yarnwrap.item.ItemStack stack, ) { net.minecraft.client.tutorial.TutorialManager.onSlotUpdate(stack.wrapperContained); }
public void onBlockBreaking(yarnwrap.client.world.ClientWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float progress) { wrapperContained.onBlockBreaking(world.wrapperContained,pos.wrapperContained,state.wrapperContained,progress); }
// public static void onBlockBreaking(yarnwrap.client.world.ClientWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float progress, ) { net.minecraft.client.tutorial.TutorialManager.onBlockBreaking(world.wrapperContained,pos.wrapperContained,state.wrapperContained,progress); }
public void onUpdateMouse(double deltaX,double deltaY) { wrapperContained.onUpdateMouse(deltaX,deltaY); }
// public static void onUpdateMouse(double deltaX,double deltaY, ) { net.minecraft.client.tutorial.TutorialManager.onUpdateMouse(deltaX,deltaY); }
public void onMovement(yarnwrap.client.input.Input input) { wrapperContained.onMovement(input.wrapperContained); }
// public static void onMovement(yarnwrap.client.input.Input input, ) { net.minecraft.client.tutorial.TutorialManager.onMovement(input.wrapperContained); }
public void setStep(yarnwrap.client.tutorial.TutorialStep step) { wrapperContained.setStep(step.wrapperContained); }
// public static void setStep(yarnwrap.client.tutorial.TutorialStep step, ) { net.minecraft.client.tutorial.TutorialManager.setStep(step.wrapperContained); }
public void tick(yarnwrap.client.world.ClientWorld world,yarnwrap.util.hit.HitResult hitResult) { wrapperContained.tick(world.wrapperContained,hitResult.wrapperContained); }
// public static void tick(yarnwrap.client.world.ClientWorld world,yarnwrap.util.hit.HitResult hitResult, ) { net.minecraft.client.tutorial.TutorialManager.tick(world.wrapperContained,hitResult.wrapperContained); }
public void onInventoryOpened() { wrapperContained.onInventoryOpened(); }
// public static void onInventoryOpened() { net.minecraft.client.tutorial.TutorialManager.onInventoryOpened(); }
// public yarnwrap.text.Text keyToText(java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.keyToText(name)); }
// public static yarnwrap.text.Text keyToText(java.lang.String name, ) { return new yarnwrap.text.Text(net.minecraft.client.tutorial.TutorialManager.keyToText(name)); }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
// public static yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.tutorial.TutorialManager.getClient()); }
public void destroyHandler() { wrapperContained.destroyHandler(); }
// public static void destroyHandler() { net.minecraft.client.tutorial.TutorialManager.destroyHandler(); }
public void createHandler() { wrapperContained.createHandler(); }
// public static void createHandler() { net.minecraft.client.tutorial.TutorialManager.createHandler(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.tutorial.TutorialManager.tick(); }
public void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType) { wrapperContained.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
// public static void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType, ) { net.minecraft.client.tutorial.TutorialManager.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }

}