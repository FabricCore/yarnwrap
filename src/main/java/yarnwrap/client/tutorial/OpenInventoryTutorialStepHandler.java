package yarnwrap.client.tutorial;
public class OpenInventoryTutorialStepHandler { public net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler wrapperContained; public OpenInventoryTutorialStepHandler(net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DELAY() { return wrapperContained.DELAY; }
// public void DELAY(int value) { wrapperContained.DELAY = value; }
// public yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.manager); }
// public void manager(yarnwrap.client.tutorial.TutorialManager value) { wrapperContained.manager = value.wrapperContained; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.toast); }
// public void toast(yarnwrap.client.toast.TutorialToast value) { wrapperContained.toast = value.wrapperContained; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public void DESCRIPTION(yarnwrap.text.Text value) { wrapperContained.DESCRIPTION = value.wrapperContained; }
public OpenInventoryTutorialStepHandler(yarnwrap.client.tutorial.TutorialManager manager) { this.wrapperContained = new net.minecraft.client.tutorial.OpenInventoryTutorialStepHandler(manager.wrapperContained); }

}