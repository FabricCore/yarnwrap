package yarnwrap.client.gui.screen.world;
public class SelectWorldScreen { public net.minecraft.client.gui.screen.world.SelectWorldScreen wrapperContained; public SelectWorldScreen(net.minecraft.client.gui.screen.world.SelectWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.gui.widget.ButtonWidget editButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.editButton); }
// public void editButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.editButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget recreateButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.recreateButton); }
// public void recreateButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.recreateButton = value.wrapperContained; }
// public yarnwrap.client.gui.screen.world.WorldListWidget levelList() { return new yarnwrap.client.gui.screen.world.WorldListWidget(wrapperContained.levelList); }
// public void levelList(yarnwrap.client.gui.screen.world.WorldListWidget value) { wrapperContained.levelList = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget deleteButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.deleteButton); }
// public void deleteButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.deleteButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget searchBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.searchBox); }
// public void searchBox(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.searchBox = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget selectButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectButton); }
// public void selectButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.selectButton = value.wrapperContained; }
public yarnwrap.world.gen.GeneratorOptions DEBUG_GENERATOR_OPTIONS() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.DEBUG_GENERATOR_OPTIONS); }
// public void DEBUG_GENERATOR_OPTIONS(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.DEBUG_GENERATOR_OPTIONS = value.wrapperContained; }
public SelectWorldScreen(yarnwrap.client.gui.screen.Screen parent) { this.wrapperContained = new net.minecraft.client.gui.screen.world.SelectWorldScreen(parent.wrapperContained); }
// public void method_19939(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19939(button.wrapperContained); }
public void worldSelected(yarnwrap.world.level.storage.LevelSummary levelSummary) { wrapperContained.worldSelected(levelSummary.wrapperContained); }
// public void method_19941(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19941(button.wrapperContained); }
// public void method_19942(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19942(button.wrapperContained); }
// public void method_19943(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19943(button.wrapperContained); }
// public void method_19944(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19944(button.wrapperContained); }
// public void method_19945(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19945(button.wrapperContained); }
// public void method_2744(java.lang.String search) { wrapperContained.method_2744(search); }
// public void method_35739(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_35739(button.wrapperContained); }

}