package yarnwrap.client.texture;
public class StatusEffectSpriteManager { public net.minecraft.client.texture.StatusEffectSpriteManager wrapperContained; public StatusEffectSpriteManager(net.minecraft.client.texture.StatusEffectSpriteManager wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.texture.Sprite getSprite(yarnwrap.registry.entry.RegistryEntry effect) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(effect.wrapperContained)); }

}