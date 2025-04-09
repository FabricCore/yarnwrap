package yarnwrap.client.texture;
public class SpriteOpener { public net.minecraft.client.texture.SpriteOpener wrapperContained; public SpriteOpener(net.minecraft.client.texture.SpriteOpener wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }

}