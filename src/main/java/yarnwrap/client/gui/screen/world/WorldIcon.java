package yarnwrap.client.gui.screen.world;
public class WorldIcon { public net.minecraft.client.gui.screen.world.WorldIcon wrapperContained; public WorldIcon(net.minecraft.client.gui.screen.world.WorldIcon wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier UNKNOWN_SERVER_ID() { return new yarnwrap.util.Identifier(wrapperContained.UNKNOWN_SERVER_ID); }
// public void UNKNOWN_SERVER_ID(yarnwrap.util.Identifier value) { wrapperContained.UNKNOWN_SERVER_ID = value.wrapperContained; }
// public int ICON_WIDTH() { return wrapperContained.ICON_WIDTH; }
// public void ICON_WIDTH(int value) { wrapperContained.ICON_WIDTH = value; }
// public int ICON_HEIGHT() { return wrapperContained.ICON_HEIGHT; }
// public void ICON_HEIGHT(int value) { wrapperContained.ICON_HEIGHT = value; }
// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
// public void texture(yarnwrap.client.texture.NativeImageBackedTexture value) { wrapperContained.texture = value.wrapperContained; }
// public boolean closed() { return wrapperContained.closed; }
// public void closed(boolean value) { wrapperContained.closed = value; }
public void destroy() { wrapperContained.destroy(); }
public void load(yarnwrap.client.texture.NativeImage image) { wrapperContained.load(image.wrapperContained); }
public yarnwrap.client.gui.screen.world.WorldIcon forWorld(yarnwrap.client.texture.TextureManager textureManager,java.lang.String worldName) { return new yarnwrap.client.gui.screen.world.WorldIcon(wrapperContained.forWorld(textureManager.wrapperContained,worldName)); }
public yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTextureId()); }
public yarnwrap.client.gui.screen.world.WorldIcon forServer(yarnwrap.client.texture.TextureManager textureManager,java.lang.String serverAddress) { return new yarnwrap.client.gui.screen.world.WorldIcon(wrapperContained.forServer(textureManager.wrapperContained,serverAddress)); }
// public void assertOpen() { wrapperContained.assertOpen(); }

}