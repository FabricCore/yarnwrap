package yarnwrap.client.texture;
public class TextureTickListener { public net.minecraft.client.texture.TextureTickListener wrapperContained; public TextureTickListener(net.minecraft.client.texture.TextureTickListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.texture.TextureTickListener.tick(); }

}