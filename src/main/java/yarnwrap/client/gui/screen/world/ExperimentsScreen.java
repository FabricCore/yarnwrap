package yarnwrap.client.gui.screen.world;
public class ExperimentsScreen { public net.minecraft.client.gui.screen.world.ExperimentsScreen wrapperContained; public ExperimentsScreen(net.minecraft.client.gui.screen.world.ExperimentsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INFO_WIDTH() { return wrapperContained.INFO_WIDTH; }
// public void INFO_WIDTH(int value) { wrapperContained.INFO_WIDTH = value; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget experimentToggleList() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.experimentToggleList); }
// public void experimentToggleList(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.experimentToggleList = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.resource.ResourcePackManager resourcePackManager() { return new yarnwrap.resource.ResourcePackManager(wrapperContained.resourcePackManager); }
// public void resourcePackManager(yarnwrap.resource.ResourcePackManager value) { wrapperContained.resourcePackManager = value.wrapperContained; }
// public java.util.function.Consumer applier() { return wrapperContained.applier; }
// public void applier(java.util.function.Consumer value) { wrapperContained.applier = value; }
// public it.unimi.dsi.fastutil.objects.Object2BooleanMap experiments() { return wrapperContained.experiments; }
// public void experiments(it.unimi.dsi.fastutil.objects.Object2BooleanMap value) { wrapperContained.experiments = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.text.Text INFO_TEXT() { return new yarnwrap.text.Text(wrapperContained.INFO_TEXT); }
// public void INFO_TEXT(yarnwrap.text.Text value) { wrapperContained.INFO_TEXT = value.wrapperContained; }
public ExperimentsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.resource.ResourcePackManager resourcePackManager,java.util.function.Consumer applier) { this.wrapperContained = new net.minecraft.client.gui.screen.world.ExperimentsScreen(parent.wrapperContained,resourcePackManager.wrapperContained,applier); }
// public yarnwrap.text.Text getDataPackName(yarnwrap.resource.ResourcePackProfile packProfile) { return new yarnwrap.text.Text(wrapperContained.getDataPackName(packProfile.wrapperContained)); }
// public void method_49017(yarnwrap.resource.ResourcePackProfile enabled) { wrapperContained.method_49017(enabled.wrapperContained); }
// public void method_49018(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_49018(button.wrapperContained); }
// public void method_49019(yarnwrap.client.gui.screen.world.ExperimentsScreen widget) { wrapperContained.method_49019(widget.wrapperContained); }
// public void method_49020(Object pack,yarnwrap.resource.ResourcePackProfile enabled) { wrapperContained.method_49020(pack,enabled.wrapperContained); }
// public void method_49021(java.util.List pack,java.util.List enabled) { wrapperContained.method_49021(pack,enabled); }
// public void method_49023(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_49023(button.wrapperContained); }
// public void applyAndClose() { wrapperContained.applyAndClose(); }
// public void method_52767(yarnwrap.client.gui.widget.Positioner positioner) { wrapperContained.method_52767(positioner.wrapperContained); }

}