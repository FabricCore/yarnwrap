package yarnwrap.client.gui.widget;
public class OptionListWidget { public net.minecraft.client.gui.widget.OptionListWidget wrapperContained; public OptionListWidget(net.minecraft.client.gui.widget.OptionListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.option.GameOptionsScreen optionsScreen() { return new yarnwrap.client.gui.screen.option.GameOptionsScreen(wrapperContained.optionsScreen); }
// public void optionsScreen(yarnwrap.client.gui.screen.option.GameOptionsScreen value) { wrapperContained.optionsScreen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.option.GameOptionsScreen optionsScreen() { return new yarnwrap.client.gui.screen.option.GameOptionsScreen(net.minecraft.client.gui.widget.OptionListWidget.optionsScreen); }
// public static void optionsScreen(yarnwrap.client.gui.screen.option.GameOptionsScreen value, ) { net.minecraft.client.gui.widget.OptionListWidget.optionsScreen = value.wrapperContained; }

public OptionListWidget(yarnwrap.client.MinecraftClient client,int width,yarnwrap.client.gui.screen.option.GameOptionsScreen optionsScreen) { this.wrapperContained = new net.minecraft.client.gui.widget.OptionListWidget(client.wrapperContained,width,optionsScreen.wrapperContained); }
public void addSingleOptionEntry(yarnwrap.client.option.SimpleOption option) { wrapperContained.addSingleOptionEntry(option.wrapperContained); }
// public static void addSingleOptionEntry(yarnwrap.client.option.SimpleOption option, ) { net.minecraft.client.gui.widget.OptionListWidget.addSingleOptionEntry(option.wrapperContained); }
public void addWidgetEntry(yarnwrap.client.gui.widget.ClickableWidget firstWidget,yarnwrap.client.gui.widget.ClickableWidget secondWidget) { wrapperContained.addWidgetEntry(firstWidget.wrapperContained,secondWidget.wrapperContained); }
// public static void addWidgetEntry(yarnwrap.client.gui.widget.ClickableWidget firstWidget,yarnwrap.client.gui.widget.ClickableWidget secondWidget, ) { net.minecraft.client.gui.widget.OptionListWidget.addWidgetEntry(firstWidget.wrapperContained,secondWidget.wrapperContained); }
public void addAll(net.minecraft.client.option.SimpleOption[] options) { wrapperContained.addAll(options); }
// public static void addAll(net.minecraft.client.option.SimpleOption[] options, ) { net.minecraft.client.gui.widget.OptionListWidget.addAll(options); }
public java.util.Optional getHoveredWidget(double mouseX,double mouseY) { return wrapperContained.getHoveredWidget(mouseX,mouseY); }
// public static java.util.Optional getHoveredWidget(double mouseX,double mouseY, ) { return net.minecraft.client.gui.widget.OptionListWidget.getHoveredWidget(mouseX,mouseY); }
public yarnwrap.client.gui.widget.ClickableWidget getWidgetFor(yarnwrap.client.option.SimpleOption option) { return new yarnwrap.client.gui.widget.ClickableWidget(wrapperContained.getWidgetFor(option.wrapperContained)); }
// public static yarnwrap.client.gui.widget.ClickableWidget getWidgetFor(yarnwrap.client.option.SimpleOption option, ) { return new yarnwrap.client.gui.widget.ClickableWidget(net.minecraft.client.gui.widget.OptionListWidget.getWidgetFor(option.wrapperContained)); }
public void addAll(java.util.List widgets) { wrapperContained.addAll(widgets); }
// public static void addAll(java.util.List widgets, ) { net.minecraft.client.gui.widget.OptionListWidget.addAll(widgets); }
public void applyAllPendingValues() { wrapperContained.applyAllPendingValues(); }
// public static void applyAllPendingValues() { net.minecraft.client.gui.widget.OptionListWidget.applyAllPendingValues(); }

}