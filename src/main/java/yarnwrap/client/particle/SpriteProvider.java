package yarnwrap.client.particle;
public class SpriteProvider { public net.minecraft.client.particle.SpriteProvider wrapperContained; public SpriteProvider(net.minecraft.client.particle.SpriteProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.texture.Sprite getSprite(int age,int maxAge) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(age,maxAge)); }
// public static yarnwrap.client.texture.Sprite getSprite(int age,int maxAge, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.particle.SpriteProvider.getSprite(age,maxAge)); }
public yarnwrap.client.texture.Sprite getSprite(yarnwrap.util.math.random.Random random) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(random.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite getSprite(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.particle.SpriteProvider.getSprite(random.wrapperContained)); }

}