package yarnwrap.client.gui.screen.option;
public class GameOptionsScreen { public net.minecraft.client.gui.screen.option.GameOptionsScreen wrapperContained; public GameOptionsScreen(net.minecraft.client.gui.screen.option.GameOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.client.option.GameOptions gameOptions() { return new yarnwrap.client.option.GameOptions(wrapperContained.gameOptions); }
public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public yarnwrap.client.gui.widget.OptionListWidget body() { return new yarnwrap.client.gui.widget.OptionListWidget(wrapperContained.body); }
// public void initFooter() { wrapperContained.initFooter(); }
// public void initHeader() { wrapperContained.initHeader(); }
// public void addOptions() { wrapperContained.addOptions(); }
// public void initBody() { wrapperContained.initBody(); }

}