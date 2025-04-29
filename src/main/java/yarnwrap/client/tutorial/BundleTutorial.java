package yarnwrap.client.tutorial;
public class BundleTutorial { public net.minecraft.client.tutorial.BundleTutorial wrapperContained; public BundleTutorial(net.minecraft.client.tutorial.BundleTutorial wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.manager); }
// public void manager(yarnwrap.client.tutorial.TutorialManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(net.minecraft.client.tutorial.BundleTutorial.manager); }
// public static void manager(yarnwrap.client.tutorial.TutorialManager value, ) { net.minecraft.client.tutorial.BundleTutorial.manager = value.wrapperContained; }

// public yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(wrapperContained.options); }
// public void options(yarnwrap.client.option.GameOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(net.minecraft.client.tutorial.BundleTutorial.options); }
// public static void options(yarnwrap.client.option.GameOptions value, ) { net.minecraft.client.tutorial.BundleTutorial.options = value.wrapperContained; }

// public yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.toast); }
// public void toast(yarnwrap.client.toast.TutorialToast value) { wrapperContained.toast = value.wrapperContained; }
// public static yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(net.minecraft.client.tutorial.BundleTutorial.toast); }
// public static void toast(yarnwrap.client.toast.TutorialToast value, ) { net.minecraft.client.tutorial.BundleTutorial.toast = value.wrapperContained; }

public BundleTutorial(yarnwrap.client.tutorial.TutorialManager manager,yarnwrap.client.option.GameOptions options) { this.wrapperContained = new net.minecraft.client.tutorial.BundleTutorial(manager.wrapperContained,options.wrapperContained); }
// public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.client.tutorial.BundleTutorial.start(); }
public void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType) { wrapperContained.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
// public static void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType, ) { net.minecraft.client.tutorial.BundleTutorial.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
// public void end() { wrapperContained.end(); }
// public static void end() { net.minecraft.client.tutorial.BundleTutorial.end(); }

}