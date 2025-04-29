package yarnwrap.client.texture;
public class Animator { public net.minecraft.client.texture.Animator wrapperContained; public Animator(net.minecraft.client.texture.Animator wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick(int x,int y) { wrapperContained.tick(x,y); }
// public static void tick(int x,int y, ) { net.minecraft.client.texture.Animator.tick(x,y); }

}