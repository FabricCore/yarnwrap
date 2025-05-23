package yarnwrap.client.tutorial;
public class OpenInventoryTutorialStepHandler { public net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler wrapperContained; public OpenInventoryTutorialStepHandler(net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.manager); }
// public void manager(yarnwrap.client.tutorial.TutorialManager value) { wrapperContained.manager = value.wrapperContained; }
// public static yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.manager); }
// public static void manager(yarnwrap.client.tutorial.TutorialManager value, ) { net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.manager = value.wrapperContained; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.ticks; }
// public static void ticks(int value, ) { net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.ticks = value; }

// public yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.toast); }
// public void toast(yarnwrap.client.toast.TutorialToast value) { wrapperContained.toast = value.wrapperContained; }
// public static yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.toast); }
// public static void toast(yarnwrap.client.toast.TutorialToast value, ) { net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.toast = value.wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.TITLE = value.wrapperContained; }

// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public void DESCRIPTION(yarnwrap.text.Text value) { wrapperContained.DESCRIPTION = value.wrapperContained; }
// public static yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.DESCRIPTION); }
// public static void DESCRIPTION(yarnwrap.text.Text value, ) { net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.DESCRIPTION = value.wrapperContained; }

// public int DELAY() { return wrapperContained.DELAY; }
// public void DELAY(int value) { wrapperContained.DELAY = value; }
// public static int DELAY() { return net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.DELAY; }
// public static void DELAY(int value, ) { net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler.DELAY = value; }

public OpenInventoryTutorialStepHandler(yarnwrap.client.tutorial.TutorialManager manager) { this.wrapperContained = new net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler(manager.wrapperContained); }

}