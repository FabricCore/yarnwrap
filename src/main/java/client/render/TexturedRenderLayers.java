package yarnwrap.client.render;
public class TexturedRenderLayers { public net.minecraft.client.render.TexturedRenderLayers wrapperContained; public TexturedRenderLayers(net.minecraft.client.render.TexturedRenderLayers wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.RenderLayer ENTITY_SOLID() { return new yarnwrap.client.render.RenderLayer(wrapperContained.ENTITY_SOLID); }
// public yarnwrap.client.render.RenderLayer ENTITY_CUTOUT() { return new yarnwrap.client.render.RenderLayer(wrapperContained.ENTITY_CUTOUT); }
// public yarnwrap.client.render.RenderLayer ENTITY_TRANSLUCENT_CULL() { return new yarnwrap.client.render.RenderLayer(wrapperContained.ENTITY_TRANSLUCENT_CULL); }
public yarnwrap.util.Identifier SHULKER_BOXES_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SHULKER_BOXES_ATLAS_TEXTURE); }
public yarnwrap.util.Identifier BEDS_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BEDS_ATLAS_TEXTURE); }
public yarnwrap.util.Identifier BANNER_PATTERNS_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BANNER_PATTERNS_ATLAS_TEXTURE); }
public yarnwrap.util.Identifier SHIELD_PATTERNS_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SHIELD_PATTERNS_ATLAS_TEXTURE); }
public yarnwrap.util.Identifier SIGNS_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SIGNS_ATLAS_TEXTURE); }
public yarnwrap.util.Identifier CHEST_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CHEST_ATLAS_TEXTURE); }
public yarnwrap.client.util.SpriteIdentifier SHULKER_TEXTURE_ID() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHULKER_TEXTURE_ID); }
public java.util.List COLORED_SHULKER_BOXES_TEXTURES() { return wrapperContained.COLORED_SHULKER_BOXES_TEXTURES; }
public java.util.Map SIGN_TYPE_TEXTURES() { return wrapperContained.SIGN_TYPE_TEXTURES; }
public net.minecraft.client.util.SpriteIdentifier[] BED_TEXTURES() { return wrapperContained.BED_TEXTURES; }
// public yarnwrap.client.render.RenderLayer SHULKER_BOXES_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.SHULKER_BOXES_RENDER_LAYER); }
// public yarnwrap.client.render.RenderLayer BEDS_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.BEDS_RENDER_LAYER); }
// public yarnwrap.client.render.RenderLayer BANNER_PATTERNS_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.BANNER_PATTERNS_RENDER_LAYER); }
// public yarnwrap.client.render.RenderLayer SHIELD_PATTERNS_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.SHIELD_PATTERNS_RENDER_LAYER); }
// public yarnwrap.client.render.RenderLayer SIGN_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.SIGN_RENDER_LAYER); }
// public yarnwrap.client.render.RenderLayer CHEST_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.CHEST_RENDER_LAYER); }
// public yarnwrap.client.render.RenderLayer ITEM_ENTITY_TRANSLUCENT_CULL() { return new yarnwrap.client.render.RenderLayer(wrapperContained.ITEM_ENTITY_TRANSLUCENT_CULL); }
// public java.util.Map BANNER_PATTERN_TEXTURES() { return wrapperContained.BANNER_PATTERN_TEXTURES; }
// public java.util.Map SHIELD_PATTERN_TEXTURES() { return wrapperContained.SHIELD_PATTERN_TEXTURES; }
public java.util.Map HANGING_SIGN_TYPE_TEXTURES() { return wrapperContained.HANGING_SIGN_TYPE_TEXTURES; }
// public yarnwrap.client.render.RenderLayer ARMOR_TRIMS_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.ARMOR_TRIMS_RENDER_LAYER); }
public yarnwrap.util.Identifier ARMOR_TRIMS_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ARMOR_TRIMS_ATLAS_TEXTURE); }
public yarnwrap.util.Identifier DECORATED_POT_ATLAS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DECORATED_POT_ATLAS_TEXTURE); }
public java.util.Map DECORATED_POT_PATTERN_TEXTURES() { return wrapperContained.DECORATED_POT_PATTERN_TEXTURES; }
// public yarnwrap.client.render.RenderLayer ARMOR_TRIMS_DECAL_RENDER_LAYER() { return new yarnwrap.client.render.RenderLayer(wrapperContained.ARMOR_TRIMS_DECAL_RENDER_LAYER); }
public yarnwrap.client.util.SpriteIdentifier BANNER_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.BANNER_BASE); }
public yarnwrap.client.util.SpriteIdentifier SHIELD_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.SHIELD_BASE); }
public yarnwrap.client.util.SpriteIdentifier DECORATED_POT_BASE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.DECORATED_POT_BASE); }
public yarnwrap.client.util.SpriteIdentifier DECORATED_POT_SIDE() { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.DECORATED_POT_SIDE); }
public yarnwrap.client.render.RenderLayer getBannerPatterns() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getBannerPatterns()); }
public yarnwrap.client.util.SpriteIdentifier getChestTextureId(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.block.enums.ChestType type,boolean christmas) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getChestTextureId(blockEntity.wrapperContained,type.wrapperContained,christmas)); }
// public yarnwrap.client.util.SpriteIdentifier getChestTextureId(yarnwrap.block.enums.ChestType type,yarnwrap.client.util.SpriteIdentifier single,yarnwrap.client.util.SpriteIdentifier left,yarnwrap.client.util.SpriteIdentifier right) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getChestTextureId(type.wrapperContained,single.wrapperContained,left.wrapperContained,right.wrapperContained)); }
// public yarnwrap.client.util.SpriteIdentifier createSignTextureId(yarnwrap.block.WoodType type) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.createSignTextureId(type.wrapperContained)); }
// public yarnwrap.client.util.SpriteIdentifier createChestTextureId(java.lang.String variant) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.createChestTextureId(variant)); }
public yarnwrap.client.render.RenderLayer getShieldPatterns() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getShieldPatterns()); }
public yarnwrap.client.render.RenderLayer getBeds() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getBeds()); }
public yarnwrap.client.render.RenderLayer getShulkerBoxes() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getShulkerBoxes()); }
public yarnwrap.client.render.RenderLayer getSign() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getSign()); }
public yarnwrap.client.render.RenderLayer getChest() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getChest()); }
public yarnwrap.client.render.RenderLayer getEntitySolid() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntitySolid()); }
public yarnwrap.client.render.RenderLayer getEntityCutout() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityCutout()); }
public yarnwrap.client.render.RenderLayer getEntityTranslucentCull() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityTranslucentCull()); }
public yarnwrap.client.render.RenderLayer getItemEntityTranslucentCull() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getItemEntityTranslucentCull()); }
public yarnwrap.client.util.SpriteIdentifier getBannerPatternTextureId(yarnwrap.registry.entry.RegistryEntry pattern) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getBannerPatternTextureId(pattern.wrapperContained)); }
public yarnwrap.client.util.SpriteIdentifier getSignTextureId(yarnwrap.block.WoodType signType) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getSignTextureId(signType.wrapperContained)); }
public yarnwrap.client.util.SpriteIdentifier getShieldPatternTextureId(yarnwrap.registry.entry.RegistryEntry pattern) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getShieldPatternTextureId(pattern.wrapperContained)); }
public yarnwrap.client.util.SpriteIdentifier getHangingSignTextureId(yarnwrap.block.WoodType signType) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getHangingSignTextureId(signType.wrapperContained)); }
// public yarnwrap.client.util.SpriteIdentifier createHangingSignTextureId(yarnwrap.block.WoodType type) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.createHangingSignTextureId(type.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getHangingSign() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getHangingSign()); }
public yarnwrap.client.render.RenderLayer getArmorTrims(boolean decal) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getArmorTrims(decal)); }
public yarnwrap.client.util.SpriteIdentifier getDecoratedPotPatternTextureId(yarnwrap.registry.RegistryKey potPatternKey) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.getDecoratedPotPatternTextureId(potPatternKey.wrapperContained)); }
// public yarnwrap.client.util.SpriteIdentifier createDecoratedPotPatternTextureId(yarnwrap.util.Identifier patternId) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.createDecoratedPotPatternTextureId(patternId.wrapperContained)); }

}