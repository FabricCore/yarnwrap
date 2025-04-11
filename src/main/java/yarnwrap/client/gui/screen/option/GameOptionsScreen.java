package yarnwrap.client.gui.screen.option;
public class GameOptionsScreen { public net.minecraft.client.gui.screen.option.GameOptionsScreen wrapperContained; public GameOptionsScreen(net.minecraft.client.gui.screen.option.GameOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.option.GameOptions gameOptions() { return new yarnwrap.client.option.GameOptions(wrapperContained.gameOptions); }
// public void gameOptions(yarnwrap.client.option.GameOptions value) { wrapperContained.gameOptions = value.wrapperContained; }
public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public yarnwrap.client.gui.widget.OptionListWidget body() { return new yarnwrap.client.gui.widget.OptionListWidget(wrapperContained.body); }
// public void body(yarnwrap.client.gui.widget.OptionListWidget value) { wrapperContained.body = value.wrapperContained; }
// public GameOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.option.GameOptionsScreen(parent.wrapperContained,gameOptions.wrapperContained,title.wrapperContained); }
// public void initFooter() { wrapperContained.initFooter(); }
// public void method_57731(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_57731(button.wrapperContained); }
// public void initHeader() { wrapperContained.initHeader(); }
// public void addOptions() { wrapperContained.addOptions(); }
// public void initBody() { wrapperContained.initBody(); }

}