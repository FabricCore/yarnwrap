package yarnwrap.client.gui.screen.world;
public class SelectWorldScreen { public net.minecraft.client.gui.screen.world.SelectWorldScreen wrapperContained; public SelectWorldScreen(net.minecraft.client.gui.screen.world.SelectWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.gui.widget.ButtonWidget editButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.editButton); }
// public yarnwrap.client.gui.widget.ButtonWidget recreateButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.recreateButton); }
// public yarnwrap.client.gui.screen.world.WorldListWidget levelList() { return new yarnwrap.client.gui.screen.world.WorldListWidget(wrapperContained.levelList); }
// public yarnwrap.client.gui.widget.ButtonWidget deleteButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.deleteButton); }
// public yarnwrap.client.gui.widget.TextFieldWidget searchBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.searchBox); }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.client.gui.widget.ButtonWidget selectButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectButton); }
public yarnwrap.world.gen.GeneratorOptions DEBUG_GENERATOR_OPTIONS() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.DEBUG_GENERATOR_OPTIONS); }
public void worldSelected(yarnwrap.world.level.storage.LevelSummary levelSummary) { wrapperContained.worldSelected(levelSummary.wrapperContained); }

}