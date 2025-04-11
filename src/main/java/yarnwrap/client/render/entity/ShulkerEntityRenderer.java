package yarnwrap.client.render.entity;
public class ShulkerEntityRenderer { public net.minecraft.client.render.entity.ShulkerEntityRenderer wrapperContained; public ShulkerEntityRenderer(net.minecraft.client.render.entity.ShulkerEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.Identifier[] COLORED_TEXTURES() { return wrapperContained.COLORED_TEXTURES; }
// public void COLORED_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.COLORED_TEXTURES = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier method_22792(yarnwrap.client.util.SpriteIdentifier spriteId) { return new yarnwrap.util.Identifier(wrapperContained.method_22792(spriteId.wrapperContained)); }
// public boolean method_33436(yarnwrap.entity.mob.ShulkerEntity renderPositionOffset) { return wrapperContained.method_33436(renderPositionOffset.wrapperContained); }
public yarnwrap.util.Identifier getTexture(yarnwrap.util.DyeColor shulkerColor) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(shulkerColor.wrapperContained)); }

}