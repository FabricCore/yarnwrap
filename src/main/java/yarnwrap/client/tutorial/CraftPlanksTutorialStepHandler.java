package yarnwrap.client.tutorial;
public class CraftPlanksTutorialStepHandler { public net.minecraft.client.tutorial.CraftPlanksTutorialStepHandler wrapperContained; public CraftPlanksTutorialStepHandler(net.minecraft.client.tutorial.CraftPlanksTutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

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
public CraftPlanksTutorialStepHandler(yarnwrap.client.tutorial.TutorialManager manager) { this.wrapperContained = new net.minecraft.client.tutorial.CraftPlanksTutorialStepHandler(manager.wrapperContained); }
public boolean hasCrafted(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.registry.tag.TagKey tag) { return wrapperContained.hasCrafted(player.wrapperContained,tag.wrapperContained); }

}