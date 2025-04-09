package yarnwrap.client.realms.gui.screen;
public class RealmsLongRunningMcoTaskScreen { public net.minecraft.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen wrapperContained; public RealmsLongRunningMcoTaskScreen(net.minecraft.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public yarnwrap.client.realms.RepeatedNarrator NARRATOR() { return new yarnwrap.client.realms.RepeatedNarrator(wrapperContained.NARRATOR); }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.layout); }
// public yarnwrap.client.realms.gui.RealmsLoadingWidget loading() { return new yarnwrap.client.realms.gui.RealmsLoadingWidget(wrapperContained.loading); }
// public java.util.List tasks() { return wrapperContained.tasks; }
public void setTitle(yarnwrap.text.Text title) { wrapperContained.setTitle(title.wrapperContained); }
// public void onCancel() { wrapperContained.onCancel(); }

}