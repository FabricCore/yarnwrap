package yarnwrap.client.tutorial;
public class FindTreeTutorialStepHandler { public net.minecraft.client.tutorial.FindTreeTutorialStepHandler wrapperContained; public FindTreeTutorialStepHandler(net.minecraft.client.tutorial.FindTreeTutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DELAY() { return wrapperContained.DELAY; }
// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public int ticks() { return wrapperContained.ticks; }
// public yarnwrap.client.tutorial.TutorialManager manager() { return new yarnwrap.client.tutorial.TutorialManager(wrapperContained.manager); }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public yarnwrap.client.toast.TutorialToast toast() { return new yarnwrap.client.toast.TutorialToast(wrapperContained.toast); }
// public boolean hasItem(yarnwrap.client.network.ClientPlayerEntity player) { return wrapperContained.hasItem(player.wrapperContained); }
public boolean hasBrokenTreeBlocks(yarnwrap.client.network.ClientPlayerEntity player) { return wrapperContained.hasBrokenTreeBlocks(player.wrapperContained); }

}