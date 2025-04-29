package yarnwrap.client.texture;
public class GuiAtlasManager { public net.minecraft.client.texture.GuiAtlasManager wrapperContained; public GuiAtlasManager(net.minecraft.client.texture.GuiAtlasManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set METADATA_READERS() { return wrapperContained.METADATA_READERS; }
// public void METADATA_READERS(java.util.Set value) { wrapperContained.METADATA_READERS = value; }
// public static java.util.Set METADATA_READERS() { return net.minecraft.client.texture.GuiAtlasManager.METADATA_READERS; }
// public static void METADATA_READERS(java.util.Set value, ) { net.minecraft.client.texture.GuiAtlasManager.METADATA_READERS = value; }

public GuiAtlasManager(yarnwrap.client.texture.TextureManager manager) { this.wrapperContained = new net.minecraft.client.texture.GuiAtlasManager(manager.wrapperContained); }
public yarnwrap.client.texture.Scaling getScaling(yarnwrap.client.texture.Sprite sprite) { return new yarnwrap.client.texture.Scaling(wrapperContained.getScaling(sprite.wrapperContained)); }
// public static yarnwrap.client.texture.Scaling getScaling(yarnwrap.client.texture.Sprite sprite, ) { return new yarnwrap.client.texture.Scaling(net.minecraft.client.texture.GuiAtlasManager.getScaling(sprite.wrapperContained)); }
// public yarnwrap.client.resource.metadata.GuiResourceMetadata getGuiMetadata(yarnwrap.client.texture.Sprite sprite) { return new yarnwrap.client.resource.metadata.GuiResourceMetadata(wrapperContained.getGuiMetadata(sprite.wrapperContained)); }
// public static yarnwrap.client.resource.metadata.GuiResourceMetadata getGuiMetadata(yarnwrap.client.texture.Sprite sprite, ) { return new yarnwrap.client.resource.metadata.GuiResourceMetadata(net.minecraft.client.texture.GuiAtlasManager.getGuiMetadata(sprite.wrapperContained)); }

}