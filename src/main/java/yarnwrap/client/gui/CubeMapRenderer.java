package yarnwrap.client.gui;
public class CubeMapRenderer { public net.minecraft.client.gui.CubeMapRenderer wrapperContained; public CubeMapRenderer(net.minecraft.client.gui.CubeMapRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FACES_COUNT() { return wrapperContained.FACES_COUNT; }
// public void FACES_COUNT(int value) { wrapperContained.FACES_COUNT = value; }
// public static int FACES_COUNT() { return net.minecraft.client.gui.CubeMapRenderer.FACES_COUNT; }
// public static void FACES_COUNT(int value, ) { net.minecraft.client.gui.CubeMapRenderer.FACES_COUNT = value; }

// public net.minecraft.util.Identifier[] faces() { return wrapperContained.faces; }
// public void faces(net.minecraft.util.Identifier[] value) { wrapperContained.faces = value; }
// public static net.minecraft.util.Identifier[] faces() { return net.minecraft.client.gui.CubeMapRenderer.faces; }
// public static void faces(net.minecraft.util.Identifier[] value, ) { net.minecraft.client.gui.CubeMapRenderer.faces = value; }

public CubeMapRenderer(yarnwrap.util.Identifier faces) { this.wrapperContained = new net.minecraft.client.gui.CubeMapRenderer(faces.wrapperContained); }
public java.util.concurrent.CompletableFuture loadTexturesAsync(yarnwrap.client.texture.TextureManager textureManager,java.util.concurrent.Executor executor) { return wrapperContained.loadTexturesAsync(textureManager.wrapperContained,executor); }
// public static java.util.concurrent.CompletableFuture loadTexturesAsync(yarnwrap.client.texture.TextureManager textureManager,java.util.concurrent.Executor executor, ) { return net.minecraft.client.gui.CubeMapRenderer.loadTexturesAsync(textureManager.wrapperContained,executor); }
public void draw(yarnwrap.client.MinecraftClient client,float x,float y,float alpha) { wrapperContained.draw(client.wrapperContained,x,y,alpha); }
// public static void draw(yarnwrap.client.MinecraftClient client,float x,float y,float alpha, ) { net.minecraft.client.gui.CubeMapRenderer.draw(client.wrapperContained,x,y,alpha); }

}