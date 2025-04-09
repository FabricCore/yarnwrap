package yarnwrap.client.gui.screen.world;
public class PresetsScreen { public net.minecraft.client.gui.screen.world.PresetsScreen wrapperContained; public PresetsScreen(net.minecraft.client.gui.screen.world.PresetsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.config); }
// public yarnwrap.client.gui.screen.world.CustomizeFlatLevelScreen parent() { return new yarnwrap.client.gui.screen.world.CustomizeFlatLevelScreen(wrapperContained.parent); }
// public yarnwrap.text.Text shareText() { return new yarnwrap.text.Text(wrapperContained.shareText); }
// public Object listWidget() { return wrapperContained.listWidget; }
// public yarnwrap.client.gui.widget.TextFieldWidget customPresetField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.customPresetField); }
// public yarnwrap.text.Text listText() { return new yarnwrap.text.Text(wrapperContained.listText); }
// public yarnwrap.client.gui.widget.ButtonWidget selectPresetButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.selectPresetButton); }
// public yarnwrap.registry.RegistryKey BIOME_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.BIOME_KEY); }
// public int ICON_SIZE() { return wrapperContained.ICON_SIZE; }
// public int BUTTON_HEIGHT() { return wrapperContained.BUTTON_HEIGHT; }
// public int ICON_BACKGROUND_OFFSET_X() { return wrapperContained.ICON_BACKGROUND_OFFSET_X; }
// public int ICON_BACKGROUND_OFFSET_Y() { return wrapperContained.ICON_BACKGROUND_OFFSET_Y; }
// public int ICON_OFFSET_X() { return wrapperContained.ICON_OFFSET_X; }
// public int ICON_OFFSET_Y() { return wrapperContained.ICON_OFFSET_Y; }
public yarnwrap.text.Text UNKNOWN_PRESET_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN_PRESET_TEXT); }
// public yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_TEXTURE); }
public void updateSelectButton(boolean hasSelected) { wrapperContained.updateSelectButton(hasSelected); }
// public java.util.List parsePresetLayersString(yarnwrap.registry.RegistryEntryLookup blockLookup,java.lang.String layers) { return wrapperContained.parsePresetLayersString(blockLookup.wrapperContained,layers); }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorLayer parseLayerString(yarnwrap.registry.RegistryEntryLookup blockLookup,java.lang.String layer,int layerStartHeight) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorLayer(wrapperContained.parseLayerString(blockLookup.wrapperContained,layer,layerStartHeight)); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig parsePresetString(yarnwrap.registry.RegistryEntryLookup blockLookup,yarnwrap.registry.RegistryEntryLookup biomeLookup,yarnwrap.registry.RegistryEntryLookup structureSetLookup,yarnwrap.registry.RegistryEntryLookup placedFeatureLookup,java.lang.String preset,yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.parsePresetString(blockLookup.wrapperContained,biomeLookup.wrapperContained,structureSetLookup.wrapperContained,placedFeatureLookup.wrapperContained,preset,config.wrapperContained)); }
// public java.lang.String getGeneratorConfigString(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { return wrapperContained.getGeneratorConfigString(config.wrapperContained); }

}