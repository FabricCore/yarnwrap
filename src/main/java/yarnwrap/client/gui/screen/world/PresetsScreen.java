package yarnwrap.client.gui.screen.world;
public class PresetsScreen { public net.minecraft.client.gui.screen.world.PresetsScreen wrapperContained; public PresetsScreen(net.minecraft.client.gui.screen.world.PresetsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig value) { wrapperContained.config = value.wrapperContained; }
// public yarnwrap.client.gui.screen.world.CustomizeFlatLevelScreen parent() { return new yarnwrap.client.gui.screen.world.CustomizeFlatLevelScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.world.CustomizeFlatLevelScreen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.text.Text shareText() { return new yarnwrap.text.Text(wrapperContained.shareText); }
// public void shareText(yarnwrap.text.Text value) { wrapperContained.shareText = value.wrapperContained; }
// public Object listWidget() { return wrapperContained.listWidget; }
// // public void listWidget(Object value) { wrapperContained.listWidget = value; }
// public yarnwrap.client.gui.widget.TextFieldWidget customPresetField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.customPresetField); }
// public void customPresetField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.customPresetField = value.wrapperContained; }
// public yarnwrap.text.Text listText() { return new yarnwrap.text.Text(wrapperContained.listText); }
// public void listText(yarnwrap.text.Text value) { wrapperContained.listText = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget selectPresetButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectPresetButton); }
// public void selectPresetButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.selectPresetButton = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey BIOME_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.BIOME_KEY); }
// public void BIOME_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.BIOME_KEY = value.wrapperContained; }
// public int ICON_SIZE() { return wrapperContained.ICON_SIZE; }
// public void ICON_SIZE(int value) { wrapperContained.ICON_SIZE = value; }
// public int BUTTON_HEIGHT() { return wrapperContained.BUTTON_HEIGHT; }
// public void BUTTON_HEIGHT(int value) { wrapperContained.BUTTON_HEIGHT = value; }
// public int ICON_BACKGROUND_OFFSET_X() { return wrapperContained.ICON_BACKGROUND_OFFSET_X; }
// public void ICON_BACKGROUND_OFFSET_X(int value) { wrapperContained.ICON_BACKGROUND_OFFSET_X = value; }
// public int ICON_BACKGROUND_OFFSET_Y() { return wrapperContained.ICON_BACKGROUND_OFFSET_Y; }
// public void ICON_BACKGROUND_OFFSET_Y(int value) { wrapperContained.ICON_BACKGROUND_OFFSET_Y = value; }
// public int ICON_OFFSET_X() { return wrapperContained.ICON_OFFSET_X; }
// public void ICON_OFFSET_X(int value) { wrapperContained.ICON_OFFSET_X = value; }
// public int ICON_OFFSET_Y() { return wrapperContained.ICON_OFFSET_Y; }
// public void ICON_OFFSET_Y(int value) { wrapperContained.ICON_OFFSET_Y = value; }
public yarnwrap.text.Text UNKNOWN_PRESET_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN_PRESET_TEXT); }
// public void UNKNOWN_PRESET_TEXT(yarnwrap.text.Text value) { wrapperContained.UNKNOWN_PRESET_TEXT = value.wrapperContained; }
// public yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_TEXTURE); }
// public void SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_TEXTURE = value.wrapperContained; }
public PresetsScreen(yarnwrap.client.gui.screen.world.CustomizeFlatLevelScreen parent) { this.wrapperContained = new net.minecraft.client.gui.screen.world.PresetsScreen(parent.wrapperContained); }
// public void method_19846(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19846(button.wrapperContained); }
public void updateSelectButton(boolean hasSelected) { wrapperContained.updateSelectButton(hasSelected); }
// public java.util.List parsePresetLayersString(yarnwrap.registry.RegistryEntryLookup blockLookup,java.lang.String layers) { return wrapperContained.parsePresetLayersString(blockLookup.wrapperContained,layers); }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorLayer parseLayerString(yarnwrap.registry.RegistryEntryLookup blockLookup,java.lang.String layer,int layerStartHeight) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorLayer(wrapperContained.parseLayerString(blockLookup.wrapperContained,layer,layerStartHeight)); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig parsePresetString(yarnwrap.registry.RegistryEntryLookup blockLookup,yarnwrap.registry.RegistryEntryLookup biomeLookup,yarnwrap.registry.RegistryEntryLookup structureSetLookup,yarnwrap.registry.RegistryEntryLookup placedFeatureLookup,java.lang.String preset,yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.parsePresetString(blockLookup.wrapperContained,biomeLookup.wrapperContained,structureSetLookup.wrapperContained,placedFeatureLookup.wrapperContained,preset,config.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_29061(yarnwrap.util.Identifier biomeId) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_29061(biomeId.wrapperContained)); }
// public java.lang.String getGeneratorConfigString(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.getGeneratorConfigString(config.wrapperContained); }

}