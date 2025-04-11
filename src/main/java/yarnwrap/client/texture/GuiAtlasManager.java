package yarnwrap.client.texture;
public class GuiAtlasManager { public net.minecraft.client.texture.GuiAtlasManager wrapperContained; public GuiAtlasManager(net.minecraft.client.texture.GuiAtlasManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set METADATA_READERS() { return wrapperContained.METADATA_READERS; }
// public void METADATA_READERS(java.util.Set value) { wrapperContained.METADATA_READERS = value; }
public yarnwrap.client.texture.Scaling getScaling(yarnwrap.client.texture.Sprite sprite) { return new yarnwrap.client.texture.Scaling(wrapperContained.getScaling(sprite.wrapperContained)); }
// public yarnwrap.client.resource.metadata.GuiResourceMetadata getGuiMetadata(yarnwrap.client.texture.Sprite sprite) { return new yarnwrap.client.resource.metadata.GuiResourceMetadata(wrapperContained.getGuiMetadata(sprite.wrapperContained)); }

}