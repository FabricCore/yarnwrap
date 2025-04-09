package yarnwrap.client.gui.screen.world;
public class CustomizeFlatLevelScreen { public net.minecraft.client.gui.screen.world.CustomizeFlatLevelScreen wrapperContained; public CustomizeFlatLevelScreen(net.minecraft.client.gui.screen.world.CustomizeFlatLevelScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text tileText() { return new yarnwrap.text.Text(wrapperContained.tileText); }
// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.config); }
// public yarnwrap.client.gui.widget.ButtonWidget widgetButtonRemoveLayer() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.widgetButtonRemoveLayer); }
// public yarnwrap.client.gui.screen.world.CreateWorldScreen parent() { return new yarnwrap.client.gui.screen.world.CreateWorldScreen(wrapperContained.parent); }
// public Object layers() { return wrapperContained.layers; }
// public yarnwrap.text.Text heightText() { return new yarnwrap.text.Text(wrapperContained.heightText); }
// public java.util.function.Consumer configConsumer() { return wrapperContained.configConsumer; }
// public int ICON_SIZE() { return wrapperContained.ICON_SIZE; }
// public int BUTTON_HEIGHT() { return wrapperContained.BUTTON_HEIGHT; }
// public int ICON_BACKGROUND_OFFSET_X() { return wrapperContained.ICON_BACKGROUND_OFFSET_X; }
// public int ICON_BACKGROUND_OFFSET_Y() { return wrapperContained.ICON_BACKGROUND_OFFSET_Y; }
// public int ICON_OFFSET_X() { return wrapperContained.ICON_OFFSET_X; }
// public int ICON_OFFSET_Y() { return wrapperContained.ICON_OFFSET_Y; }
// public yarnwrap.util.Identifier SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_TEXTURE); }
// public void updateRemoveLayerButton() { wrapperContained.updateRemoveLayerButton(); }
// public boolean hasLayerSelected() { return wrapperContained.hasLayerSelected(); }
public void setConfig(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { wrapperContained.setConfig(config.wrapperContained); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getConfig() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.getConfig()); }

}