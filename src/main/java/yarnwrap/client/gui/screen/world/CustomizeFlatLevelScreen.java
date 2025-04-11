package yarnwrap.client.gui.screen.world;
public class CustomizeFlatLevelScreen { public net.minecraft.client.gui.screen.world.CustomizeFlatLevelScreen wrapperContained; public CustomizeFlatLevelScreen(net.minecraft.client.gui.screen.world.CustomizeFlatLevelScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text tileText() { return new yarnwrap.text.Text(wrapperContained.tileText); }
// public void tileText(yarnwrap.text.Text value) { wrapperContained.tileText = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig value) { wrapperContained.config = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget widgetButtonRemoveLayer() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.widgetButtonRemoveLayer); }
// public void widgetButtonRemoveLayer(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.widgetButtonRemoveLayer = value.wrapperContained; }
// public yarnwrap.client.gui.screen.world.CreateWorldScreen parent() { return new yarnwrap.client.gui.screen.world.CreateWorldScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.world.CreateWorldScreen value) { wrapperContained.parent = value.wrapperContained; }
// public Object layers() { return wrapperContained.layers; }
// // public void layers(Object value) { wrapperContained.layers = value; }
// public yarnwrap.text.Text heightText() { return new yarnwrap.text.Text(wrapperContained.heightText); }
// public void heightText(yarnwrap.text.Text value) { wrapperContained.heightText = value.wrapperContained; }
// public java.util.function.Consumer configConsumer() { return wrapperContained.configConsumer; }
// public void configConsumer(java.util.function.Consumer value) { wrapperContained.configConsumer = value; }
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
// public yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_TEXTURE); }
// public void SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_TEXTURE = value.wrapperContained; }
// public void updateRemoveLayerButton() { wrapperContained.updateRemoveLayerButton(); }
// public boolean hasLayerSelected() { return wrapperContained.hasLayerSelected(); }
public void setConfig(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { wrapperContained.setConfig(config.wrapperContained); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getConfig() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.getConfig()); }

}