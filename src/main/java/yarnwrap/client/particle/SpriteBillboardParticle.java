package yarnwrap.client.particle;
public class SpriteBillboardParticle { public net.minecraft.client.particle.SpriteBillboardParticle wrapperContained; public SpriteBillboardParticle(net.minecraft.client.particle.SpriteBillboardParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
public void setSprite(yarnwrap.client.particle.SpriteProvider spriteProvider) { wrapperContained.setSprite(spriteProvider.wrapperContained); }
// public void setSprite(yarnwrap.client.texture.Sprite sprite) { wrapperContained.setSprite(sprite.wrapperContained); }
public void setSpriteForAge(yarnwrap.client.particle.SpriteProvider spriteProvider) { wrapperContained.setSpriteForAge(spriteProvider.wrapperContained); }

}