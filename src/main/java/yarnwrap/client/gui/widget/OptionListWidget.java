package yarnwrap.client.gui.widget;
public class OptionListWidget { public net.minecraft.client.gui.widget.OptionListWidget wrapperContained; public OptionListWidget(net.minecraft.client.gui.widget.OptionListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.option.GameOptionsScreen optionsScreen() { return new yarnwrap.client.gui.screen.option.GameOptionsScreen(wrapperContained.optionsScreen); }
// public void optionsScreen(yarnwrap.client.gui.screen.option.GameOptionsScreen value) { wrapperContained.optionsScreen = value.wrapperContained; }
public void addSingleOptionEntry(yarnwrap.client.option.SimpleOption option) { wrapperContained.addSingleOptionEntry(option.wrapperContained); }
public void addWidgetEntry(yarnwrap.client.gui.widget.ClickableWidget firstWidget,yarnwrap.client.gui.widget.ClickableWidget secondWidget) { wrapperContained.addWidgetEntry(firstWidget.wrapperContained,secondWidget.wrapperContained); }
public void addAll(net.minecraft.client.option.SimpleOption[] options) { wrapperContained.addAll(options); }
public java.util.Optional getHoveredWidget(double mouseX,double mouseY) { return wrapperContained.getHoveredWidget(mouseX,mouseY); }
public yarnwrap.client.gui.widget.ClickableWidget getWidgetFor(yarnwrap.client.option.SimpleOption option) { return new yarnwrap.client.gui.widget.ClickableWidget(wrapperContained.getWidgetFor(option.wrapperContained)); }
public void addAll(java.util.List widgets) { wrapperContained.addAll(widgets); }
public void applyAllPendingValues() { wrapperContained.applyAllPendingValues(); }

}