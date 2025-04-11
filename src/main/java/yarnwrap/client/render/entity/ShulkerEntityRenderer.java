package yarnwrap.client.render.entity;
public class ShulkerEntityRenderer { public net.minecraft.client.render.entity.ShulkerEntityRenderer wrapperContained; public ShulkerEntityRenderer(net.minecraft.client.render.entity.ShulkerEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.Identifier[] COLORED_TEXTURES() { return wrapperContained.COLORED_TEXTURES; }
// public void COLORED_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.COLORED_TEXTURES = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public yarnwrap.util.Identifier getTexture(yarnwrap.util.DyeColor shulkerColor) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(shulkerColor.wrapperContained)); }

}