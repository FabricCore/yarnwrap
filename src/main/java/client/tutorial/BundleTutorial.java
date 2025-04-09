package yarnwrap.client.tutorial;
public class BundleTutorial { public net.minecraft.client.tutorial.BundleTutorial wrapperContained; public BundleTutorial(net.minecraft.client.tutorial.BundleTutorial wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.manager); }
// public yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(wrapperContained.options); }
// public yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.toast); }
// public void start() { wrapperContained.start(); }
public void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType) { wrapperContained.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
// public void end() { wrapperContained.end(); }

}