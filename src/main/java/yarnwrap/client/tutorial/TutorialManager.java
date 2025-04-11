package yarnwrap.client.tutorial;
public class TutorialManager { public net.minecraft.client.tutorial.TutorialManager wrapperContained; public TutorialManager(net.minecraft.client.tutorial.TutorialManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public yarnwrap.client.tutorial.BundleTutorial bundleTutorial() { return new yarnwrap.client.tutorial.BundleTutorial(wrapperContained.bundleTutorial); }
// public void bundleTutorial(yarnwrap.client.tutorial.BundleTutorial value) { wrapperContained.bundleTutorial = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.client.tutorial.TutorialStepHandler currentHandler() { return new yarnwrap.client.tutorial.TutorialStepHandler(wrapperContained.currentHandler); }
// public void currentHandler(yarnwrap.client.tutorial.TutorialStepHandler value) { wrapperContained.currentHandler = value.wrapperContained; }
public TutorialManager(yarnwrap.client.MinecraftClient client,yarnwrap.client.option.GameOptions options) { this.wrapperContained = new net.minecraft.client.tutorial.TutorialManager(client.wrapperContained,options.wrapperContained); }
public void remove(yarnwrap.client.toast.TutorialToast toast) { wrapperContained.remove(toast.wrapperContained); }
public void add(yarnwrap.client.toast.TutorialToast toast,int ticks) { wrapperContained.add(toast.wrapperContained,ticks); }
// public boolean method_31366(yarnwrap.client.toast.TutorialToast entry) { return wrapperContained.method_31366(entry.wrapperContained); }
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