package yarnwrap.client.gui;
public class CubeMapRenderer { public net.minecraft.client.gui.CubeMapRenderer wrapperContained; public CubeMapRenderer(net.minecraft.client.gui.CubeMapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FACES_COUNT() { return wrapperContained.FACES_COUNT; }
// public net.minecraft.util.Identifier[] faces() { return wrapperContained.faces; }
public java.util.concurrent.CompletableFuture loadTexturesAsync(yarnwrap.client.texture.TextureManager textureManager,java.util.concurrent.Executor executor) { return wrapperContained.loadTexturesAsync(textureManager.wrapperContained,executor); }
public void draw(yarnwrap.client.MinecraftClient client,float x,float y,float alpha) { wrapperContained.draw(client.wrapperContained,x,y,alpha); }

}