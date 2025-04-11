package yarnwrap.client.texture;
public class StatusEffectSpriteManager { public net.minecraft.client.texture.StatusEffectSpriteManager wrapperContained; public StatusEffectSpriteManager(net.minecraft.client.texture.StatusEffectSpriteManager wrapperContained) { this.wrapperContained = wrapperContained; }

public StatusEffectSpriteManager(yarnwrap.client.texture.TextureManager textureManager) { this.wrapperContained = new net.minecraft.client.texture.StatusEffectSpriteManager(textureManager.wrapperContained); }
public yarnwrap.client.texture.Sprite getSprite(yarnwrap.registry.entry.RegistryEntry effect) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(effect.wrapperContained)); }

}