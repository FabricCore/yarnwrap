package yarnwrap.client.particle;
public class SpriteBillboardParticle { public net.minecraft.client.particle.SpriteBillboardParticle wrapperContained; public SpriteBillboardParticle(net.minecraft.client.particle.SpriteBillboardParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.particle.SpriteBillboardParticle.sprite); }
// public static void sprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.particle.SpriteBillboardParticle.sprite = value.wrapperContained; }

public void setSprite(yarnwrap.client.particle.SpriteProvider spriteProvider) { wrapperContained.setSprite(spriteProvider.wrapperContained); }
// public static void setSprite(yarnwrap.client.particle.SpriteProvider spriteProvider, ) { net.minecraft.client.particle.SpriteBillboardParticle.setSprite(spriteProvider.wrapperContained); }
// public void setSprite(yarnwrap.client.texture.Sprite sprite) { wrapperContained.setSprite(sprite.wrapperContained); }
// public static void setSprite(yarnwrap.client.texture.Sprite sprite, ) { net.minecraft.client.particle.SpriteBillboardParticle.setSprite(sprite.wrapperContained); }
public void setSpriteForAge(yarnwrap.client.particle.SpriteProvider spriteProvider) { wrapperContained.setSpriteForAge(spriteProvider.wrapperContained); }
// public static void setSpriteForAge(yarnwrap.client.particle.SpriteProvider spriteProvider, ) { net.minecraft.client.particle.SpriteBillboardParticle.setSpriteForAge(spriteProvider.wrapperContained); }

}