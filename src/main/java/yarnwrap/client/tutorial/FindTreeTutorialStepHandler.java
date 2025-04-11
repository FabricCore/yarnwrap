package yarnwrap.client.tutorial;
public class FindTreeTutorialStepHandler { public net.minecraft.client.tutorial.FindTreeTutorialStepHandler wrapperContained; public FindTreeTutorialStepHandler(net.minecraft.client.tutorial.FindTreeTutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DELAY() { return wrapperContained.DELAY; }
// public void DELAY(int value) { wrapperContained.DELAY = value; }
// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public void DESCRIPTION(yarnwrap.text.Text value) { wrapperContained.DESCRIPTION = value.wrapperContained; }
// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.manager); }
// public void manager(yarnwrap.client.tutorial.TutorialManager value) { wrapperContained.manager = value.wrapperContained; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.toast); }
// public void toast(yarnwrap.client.toast.TutorialToast value) { wrapperContained.toast = value.wrapperContained; }
// public boolean hasItem(yarnwrap.client.network.ClientPlayerEntity player) { return wrapperContained.hasItem(player.wrapperContained); }
public boolean hasBrokenTreeBlocks(yarnwrap.client.network.ClientPlayerEntity player) { return wrapperContained.hasBrokenTreeBlocks(player.wrapperContained); }

}