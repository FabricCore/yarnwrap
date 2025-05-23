package yarnwrap.client.data;
public class AtlasDefinitionProvider { public net.minecraft.client.data.AtlasDefinitionProvider wrapperContained; public AtlasDefinitionProvider(net.minecraft.client.data.AtlasDefinitionProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TRIM_PALETTES_ID() { return new yarnwrap.util.Identifier(wrapperContained.TRIM_PALETTES_ID); }
// public void TRIM_PALETTES_ID(yarnwrap.util.Identifier value) { wrapperContained.TRIM_PALETTES_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier TRIM_PALETTES_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.data.AtlasDefinitionProvider.TRIM_PALETTES_ID); }
// public static void TRIM_PALETTES_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.data.AtlasDefinitionProvider.TRIM_PALETTES_ID = value.wrapperContained; }

// public java.util.Map TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE() { return wrapperContained.TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE; }
// public void TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE(java.util.Map value) { wrapperContained.TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE = value; }
// public static java.util.Map TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE() { return net.minecraft.client.data.AtlasDefinitionProvider.TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE; }
// public static void TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE(java.util.Map value, ) { net.minecraft.client.data.AtlasDefinitionProvider.TRIM_ASSET_SUFFIX_TO_COLOR_PALETTE = value; }

// public java.util.List ARMOR_TRIM_PATTERN_KEYS() { return wrapperContained.ARMOR_TRIM_PATTERN_KEYS; }
// public void ARMOR_TRIM_PATTERN_KEYS(java.util.List value) { wrapperContained.ARMOR_TRIM_PATTERN_KEYS = value; }
// public static java.util.List ARMOR_TRIM_PATTERN_KEYS() { return net.minecraft.client.data.AtlasDefinitionProvider.ARMOR_TRIM_PATTERN_KEYS; }
// public static void ARMOR_TRIM_PATTERN_KEYS(java.util.List value, ) { net.minecraft.client.data.AtlasDefinitionProvider.ARMOR_TRIM_PATTERN_KEYS = value; }

// public java.util.List EQUIPMENT_MODEL_LAYER_TYPES() { return wrapperContained.EQUIPMENT_MODEL_LAYER_TYPES; }
// public void EQUIPMENT_MODEL_LAYER_TYPES(java.util.List value) { wrapperContained.EQUIPMENT_MODEL_LAYER_TYPES = value; }
// public static java.util.List EQUIPMENT_MODEL_LAYER_TYPES() { return net.minecraft.client.data.AtlasDefinitionProvider.EQUIPMENT_MODEL_LAYER_TYPES; }
// public static void EQUIPMENT_MODEL_LAYER_TYPES(java.util.List value, ) { net.minecraft.client.data.AtlasDefinitionProvider.EQUIPMENT_MODEL_LAYER_TYPES = value; }

// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// // public static Object pathResolver() { return net.minecraft.client.data.AtlasDefinitionProvider.pathResolver; }
// // public static void pathResolver(Object value, ) { net.minecraft.client.data.AtlasDefinitionProvider.pathResolver = value; }

public AtlasDefinitionProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.client.data.AtlasDefinitionProvider(output.wrapperContained); }
// public yarnwrap.util.Identifier method_67246(Object assetId) { return new yarnwrap.util.Identifier(wrapperContained.method_67246(assetId)); }
// public static yarnwrap.util.Identifier method_67246(Object assetId, ) { return new yarnwrap.util.Identifier(net.minecraft.client.data.AtlasDefinitionProvider.method_67246(assetId)); }
// public java.util.stream.Stream method_67247(yarnwrap.item.equipment.trim.ArmorTrimAssets assets) { return wrapperContained.method_67247(assets.wrapperContained); }
// public static java.util.stream.Stream method_67247(yarnwrap.item.equipment.trim.ArmorTrimAssets assets, ) { return net.minecraft.client.data.AtlasDefinitionProvider.method_67247(assets.wrapperContained); }
// public yarnwrap.client.texture.atlas.AtlasSource createDirectoryAtlasSource(yarnwrap.client.util.SpriteMapper spriteMapper) { return new yarnwrap.client.texture.atlas.AtlasSource(wrapperContained.createDirectoryAtlasSource(spriteMapper.wrapperContained)); }
// public static yarnwrap.client.texture.atlas.AtlasSource createDirectoryAtlasSource(yarnwrap.client.util.SpriteMapper spriteMapper, ) { return new yarnwrap.client.texture.atlas.AtlasSource(net.minecraft.client.data.AtlasDefinitionProvider.createDirectoryAtlasSource(spriteMapper.wrapperContained)); }
// public java.lang.String method_67249(Object trimPatternPath) { return wrapperContained.method_67249(trimPatternPath); }
// public static java.lang.String method_67249(Object trimPatternPath, ) { return net.minecraft.client.data.AtlasDefinitionProvider.method_67249(trimPatternPath); }
// public yarnwrap.client.texture.atlas.AtlasSource createSingleAtlasSource(yarnwrap.client.util.SpriteIdentifier spriteId) { return new yarnwrap.client.texture.atlas.AtlasSource(wrapperContained.createSingleAtlasSource(spriteId.wrapperContained)); }
// public static yarnwrap.client.texture.atlas.AtlasSource createSingleAtlasSource(yarnwrap.client.util.SpriteIdentifier spriteId, ) { return new yarnwrap.client.texture.atlas.AtlasSource(net.minecraft.client.data.AtlasDefinitionProvider.createSingleAtlasSource(spriteId.wrapperContained)); }
// public java.util.List createAtlasSources(java.lang.String directorySource) { return wrapperContained.createAtlasSources(directorySource); }
// public static java.util.List createAtlasSources(java.lang.String directorySource, ) { return net.minecraft.client.data.AtlasDefinitionProvider.createAtlasSources(directorySource); }
// public java.util.concurrent.CompletableFuture runForAtlas(yarnwrap.data.DataWriter writer,yarnwrap.util.Identifier atlasId,java.util.List atlasSources) { return wrapperContained.runForAtlas(writer.wrapperContained,atlasId.wrapperContained,atlasSources); }
// public static java.util.concurrent.CompletableFuture runForAtlas(yarnwrap.data.DataWriter writer,yarnwrap.util.Identifier atlasId,java.util.List atlasSources, ) { return net.minecraft.client.data.AtlasDefinitionProvider.runForAtlas(writer.wrapperContained,atlasId.wrapperContained,atlasSources); }
// public java.util.List getArmorTrimTextures() { return wrapperContained.getArmorTrimTextures(); }
// public static java.util.List getArmorTrimTextures() { return net.minecraft.client.data.AtlasDefinitionProvider.getArmorTrimTextures(); }
// public java.util.List createAtlasSources(yarnwrap.client.util.SpriteMapper spriteMapper) { return wrapperContained.createAtlasSources(spriteMapper.wrapperContained); }
// public static java.util.List createAtlasSources(yarnwrap.client.util.SpriteMapper spriteMapper, ) { return net.minecraft.client.data.AtlasDefinitionProvider.createAtlasSources(spriteMapper.wrapperContained); }
// public java.util.stream.Stream streamTrimAssets() { return wrapperContained.streamTrimAssets(); }
// public static java.util.stream.Stream streamTrimAssets() { return net.minecraft.client.data.AtlasDefinitionProvider.streamTrimAssets(); }
// public java.util.List createArmorTrimsAtlasSources() { return wrapperContained.createArmorTrimsAtlasSources(); }
// public static java.util.List createArmorTrimsAtlasSources() { return net.minecraft.client.data.AtlasDefinitionProvider.createArmorTrimsAtlasSources(); }
// public java.util.List createBlocksAtlasSources() { return wrapperContained.createBlocksAtlasSources(); }
// public static java.util.List createBlocksAtlasSources() { return net.minecraft.client.data.AtlasDefinitionProvider.createBlocksAtlasSources(); }
// public java.util.List createBannerPatternsAtlasSources() { return wrapperContained.createBannerPatternsAtlasSources(); }
// public static java.util.List createBannerPatternsAtlasSources() { return net.minecraft.client.data.AtlasDefinitionProvider.createBannerPatternsAtlasSources(); }
// public java.util.List createShieldAtlasSources() { return wrapperContained.createShieldAtlasSources(); }
// public static java.util.List createShieldAtlasSources() { return net.minecraft.client.data.AtlasDefinitionProvider.createShieldAtlasSources(); }
// public java.util.List createGuiAtlasSources() { return wrapperContained.createGuiAtlasSources(); }
// public static java.util.List createGuiAtlasSources() { return net.minecraft.client.data.AtlasDefinitionProvider.createGuiAtlasSources(); }

}