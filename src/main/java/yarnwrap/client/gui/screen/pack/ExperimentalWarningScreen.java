package yarnwrap.client.gui.screen.pack;
public class ExperimentalWarningScreen { public net.minecraft.client.gui.screen.pack.ExperimentalWarningScreen wrapperContained; public ExperimentalWarningScreen(net.minecraft.client.gui.screen.pack.ExperimentalWarningScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.text.Text MESSAGE() { return new yarnwrap.text.Text(wrapperContained.MESSAGE); }
// public void MESSAGE(yarnwrap.text.Text value) { wrapperContained.MESSAGE = value.wrapperContained; }
// public yarnwrap.text.Text DETAILS() { return new yarnwrap.text.Text(wrapperContained.DETAILS); }
// public void DETAILS(yarnwrap.text.Text value) { wrapperContained.DETAILS = value.wrapperContained; }
// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public void callback(it.unimi.dsi.fastutil.booleans.BooleanConsumer value) { wrapperContained.callback = value; }
// public java.util.Collection enabledProfiles() { return wrapperContained.enabledProfiles; }
// public void enabledProfiles(java.util.Collection value) { wrapperContained.enabledProfiles = value; }
// public yarnwrap.client.gui.widget.GridWidget grid() { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.grid); }
// public void grid(yarnwrap.client.gui.widget.GridWidget value) { wrapperContained.grid = value.wrapperContained; }
public ExperimentalWarningScreen(java.util.Collection enabledProfiles,it.unimi.dsi.fastutil.booleans.BooleanConsumer callback) { this.wrapperContained = new net.minecraft.client.gui.screen.pack.ExperimentalWarningScreen(enabledProfiles,callback); }
// public void method_45666(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_45666(button.wrapperContained); }
// public void method_45667(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_45667(button.wrapperContained); }
// public void method_45668(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_45668(button.wrapperContained); }
// public void method_49008(yarnwrap.client.gui.screen.pack.ExperimentalWarningScreen child) { wrapperContained.method_49008(child.wrapperContained); }

}