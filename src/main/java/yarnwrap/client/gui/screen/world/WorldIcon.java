package yarnwrap.client.gui.screen.world;
public class WorldIcon { public net.minecraft.client.gui.screen.world.WorldIcon wrapperContained; public WorldIcon(net.minecraft.client.gui.screen.world.WorldIcon wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier UNKNOWN_SERVER_ID() { return new yarnwrap.util.Identifier(wrapperContained.UNKNOWN_SERVER_ID); }
// public void UNKNOWN_SERVER_ID(yarnwrap.util.Identifier value) { wrapperContained.UNKNOWN_SERVER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier UNKNOWN_SERVER_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.world.WorldIcon.UNKNOWN_SERVER_ID); }
// public static void UNKNOWN_SERVER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.world.WorldIcon.UNKNOWN_SERVER_ID = value.wrapperContained; }

// public int ICON_WIDTH() { return wrapperContained.ICON_WIDTH; }
// public void ICON_WIDTH(int value) { wrapperContained.ICON_WIDTH = value; }
// public static int ICON_WIDTH() { return net.minecraft.client.gui.screen.world.WorldIcon.ICON_WIDTH; }
// public static void ICON_WIDTH(int value, ) { net.minecraft.client.gui.screen.world.WorldIcon.ICON_WIDTH = value; }

// public int ICON_HEIGHT() { return wrapperContained.ICON_HEIGHT; }
// public void ICON_HEIGHT(int value) { wrapperContained.ICON_HEIGHT = value; }
// public static int ICON_HEIGHT() { return net.minecraft.client.gui.screen.world.WorldIcon.ICON_HEIGHT; }
// public static void ICON_HEIGHT(int value, ) { net.minecraft.client.gui.screen.world.WorldIcon.ICON_HEIGHT = value; }

// public yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(wrapperContained.textureManager); }
// public void textureManager(yarnwrap.client.texture.TextureManager value) { wrapperContained.textureManager = value.wrapperContained; }
// public static yarnwrap.client.texture.TextureManager textureManager() { return new yarnwrap.client.texture.TextureManager(net.minecraft.client.gui.screen.world.WorldIcon.textureManager); }
// public static void textureManager(yarnwrap.client.texture.TextureManager value, ) { net.minecraft.client.gui.screen.world.WorldIcon.textureManager = value.wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.world.WorldIcon.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.world.WorldIcon.id = value.wrapperContained; }

// public yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(wrapperContained.texture); }
// public void texture(yarnwrap.client.texture.NativeImageBackedTexture value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.client.texture.NativeImageBackedTexture texture() { return new yarnwrap.client.texture.NativeImageBackedTexture(net.minecraft.client.gui.screen.world.WorldIcon.texture); }
// public static void texture(yarnwrap.client.texture.NativeImageBackedTexture value, ) { net.minecraft.client.gui.screen.world.WorldIcon.texture = value.wrapperContained; }

// public boolean closed() { return wrapperContained.closed; }
// public void closed(boolean value) { wrapperContained.closed = value; }
// public static boolean closed() { return net.minecraft.client.gui.screen.world.WorldIcon.closed; }
// public static void closed(boolean value, ) { net.minecraft.client.gui.screen.world.WorldIcon.closed = value; }

// public WorldIcon(yarnwrap.client.texture.TextureManager textureManager,yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.client.gui.screen.world.WorldIcon(textureManager.wrapperContained,id.wrapperContained); }
public void destroy() { wrapperContained.destroy(); }
// public static void destroy() { net.minecraft.client.gui.screen.world.WorldIcon.destroy(); }
public void load(yarnwrap.client.texture.NativeImage image) { wrapperContained.load(image.wrapperContained); }
// public static void load(yarnwrap.client.texture.NativeImage image, ) { net.minecraft.client.gui.screen.world.WorldIcon.load(image.wrapperContained); }
// public yarnwrap.client.gui.screen.world.WorldIcon forWorld(yarnwrap.client.texture.TextureManager textureManager,java.lang.String worldName) { return new yarnwrap.client.gui.screen.world.WorldIcon(wrapperContained.forWorld(textureManager.wrapperContained,worldName)); }
// public static yarnwrap.client.gui.screen.world.WorldIcon forWorld(yarnwrap.client.texture.TextureManager textureManager,java.lang.String worldName, ) { return new yarnwrap.client.gui.screen.world.WorldIcon(net.minecraft.client.gui.screen.world.WorldIcon.forWorld(textureManager.wrapperContained,worldName)); }
public yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTextureId()); }
// public static yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.world.WorldIcon.getTextureId()); }
// public yarnwrap.client.gui.screen.world.WorldIcon forServer(yarnwrap.client.texture.TextureManager textureManager,java.lang.String serverAddress) { return new yarnwrap.client.gui.screen.world.WorldIcon(wrapperContained.forServer(textureManager.wrapperContained,serverAddress)); }
// public static yarnwrap.client.gui.screen.world.WorldIcon forServer(yarnwrap.client.texture.TextureManager textureManager,java.lang.String serverAddress, ) { return new yarnwrap.client.gui.screen.world.WorldIcon(net.minecraft.client.gui.screen.world.WorldIcon.forServer(textureManager.wrapperContained,serverAddress)); }
// public void assertOpen() { wrapperContained.assertOpen(); }
// public static void assertOpen() { net.minecraft.client.gui.screen.world.WorldIcon.assertOpen(); }

}