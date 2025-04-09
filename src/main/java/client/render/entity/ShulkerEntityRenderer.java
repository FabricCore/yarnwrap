package yarnwrap.client.render.entity;
public class ShulkerEntityRenderer { public net.minecraft.client.render.entity.ShulkerEntityRenderer wrapperContained; public ShulkerEntityRenderer(net.minecraft.client.render.entity.ShulkerEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.Identifier[] COLORED_TEXTURES() { return wrapperContained.COLORED_TEXTURES; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
public yarnwrap.util.Identifier getTexture(yarnwrap.util.DyeColor shulkerColor) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(shulkerColor.wrapperContained)); }

}