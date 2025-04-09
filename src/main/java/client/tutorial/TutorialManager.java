package yarnwrap.client.tutorial;
public class TutorialManager { public net.minecraft.client.tutorial.TutorialManager wrapperContained; public TutorialManager(net.minecraft.client.tutorial.TutorialManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public yarnwrap.client.tutorial.BundleTutorial bundleTutorial() { return new yarnwrap.client.tutorial.BundleTutorial(wrapperContained.bundleTutorial); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.client.tutorial.TutorialStepHandler currentHandler() { return new yarnwrap.client.tutorial.TutorialStepHandler(wrapperContained.currentHandler); }
public void remove(yarnwrap.client.toast.TutorialToast toast) { wrapperContained.remove(toast.wrapperContained); }
public void add(yarnwrap.client.toast.TutorialToast toast,int ticks) { wrapperContained.add(toast.wrapperContained,ticks); }
public void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType) { wrapperContained.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
public boolean isInSurvival() { return wrapperContained.isInSurvival(); }
public void onSlotUpdate(yarnwrap.item.ItemStack stack) { wrapperContained.onSlotUpdate(stack.wrapperContained); }
public void onBlockBreaking(yarnwrap.client.world.ClientWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float progress) { wrapperContained.onBlockBreaking(world.wrapperContained,pos.wrapperContained,state.wrapperContained,progress); }
public void onUpdateMouse(double deltaX,double deltaY) { wrapperContained.onUpdateMouse(deltaX,deltaY); }
public void onMovement(yarnwrap.client.input.Input input) { wrapperContained.onMovement(input.wrapperContained); }
public void setStep(yarnwrap.client.tutorial.TutorialStep step) { wrapperContained.setStep(step.wrapperContained); }
public void tick(yarnwrap.client.world.ClientWorld world,yarnwrap.util.hit.HitResult hitResult) { wrapperContained.tick(world.wrapperContained,hitResult.wrapperContained); }
public void onInventoryOpened() { wrapperContained.onInventoryOpened(); }
public yarnwrap.text.Text keyToText(java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.keyToText(name)); }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
public void destroyHandler() { wrapperContained.destroyHandler(); }
public void createHandler() { wrapperContained.createHandler(); }
public void tick() { wrapperContained.tick(); }

}