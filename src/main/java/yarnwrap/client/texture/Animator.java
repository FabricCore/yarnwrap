package yarnwrap.client.texture;
public class Animator { public net.minecraft.client.texture.Animator wrapperContained; public Animator(net.minecraft.client.texture.Animator wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick(int x,int y,com.mojang.blaze3d.textures.GpuTexture texture) { wrapperContained.tick(x,y,texture); }
// public static void tick(int x,int y,com.mojang.blaze3d.textures.GpuTexture texture, ) { net.minecraft.client.texture.Animator.tick(x,y,texture); }

}