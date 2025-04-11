package yarnwrap.client.realms.gui.screen;
public class RealmsLongRunningMcoTaskScreen { public net.minecraft.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen wrapperContained; public RealmsLongRunningMcoTaskScreen(net.minecraft.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public yarnwrap.client.realms.RepeatedNarrator NARRATOR() { return new yarnwrap.client.realms.RepeatedNarrator(wrapperContained.NARRATOR); }
// public void NARRATOR(yarnwrap.client.realms.RepeatedNarrator value) { wrapperContained.NARRATOR = value.wrapperContained; }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.DirectionalLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public yarnwrap.client.realms.gui.RealmsLoadingWidget loading() { return new yarnwrap.client.realms.gui.RealmsLoadingWidget(wrapperContained.loading); }
// public void loading(yarnwrap.client.realms.gui.RealmsLoadingWidget value) { wrapperContained.loading = value.wrapperContained; }
// public java.util.List tasks() { return wrapperContained.tasks; }
// public void tasks(java.util.List value) { wrapperContained.tasks = value; }
public RealmsLongRunningMcoTaskScreen(yarnwrap.client.gui.screen.Screen parent,net.minecraft.client.realms.task.LongRunningTask[] tasks) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen(parent.wrapperContained,tasks); }
// public void method_25168(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25168(button.wrapperContained); }
// public void method_53795(yarnwrap.client.realms.gui.screen.RealmsLongRunningMcoTaskScreen child) { wrapperContained.method_53795(child.wrapperContained); }
// public void method_53796(yarnwrap.client.gui.widget.Positioner positioner) { wrapperContained.method_53796(positioner.wrapperContained); }
public void setTitle(yarnwrap.text.Text title) { wrapperContained.setTitle(title.wrapperContained); }
// public void onCancel() { wrapperContained.onCancel(); }

}