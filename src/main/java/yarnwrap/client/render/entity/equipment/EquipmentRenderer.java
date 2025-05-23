package yarnwrap.client.render.entity.equipment;
public class EquipmentRenderer { public net.minecraft.client.render.entity.equipment.EquipmentRenderer wrapperContained; public EquipmentRenderer(net.minecraft.client.render.entity.equipment.EquipmentRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.equipment.EquipmentModelLoader equipmentModelLoader() { return new yarnwrap.client.render.entity.equipment.EquipmentModelLoader(wrapperContained.equipmentModelLoader); }
// public void equipmentModelLoader(yarnwrap.client.render.entity.equipment.EquipmentModelLoader value) { wrapperContained.equipmentModelLoader = value.wrapperContained; }
// public static yarnwrap.client.render.entity.equipment.EquipmentModelLoader equipmentModelLoader() { return new yarnwrap.client.render.entity.equipment.EquipmentModelLoader(net.minecraft.client.render.entity.equipment.EquipmentRenderer.equipmentModelLoader); }
// public static void equipmentModelLoader(yarnwrap.client.render.entity.equipment.EquipmentModelLoader value, ) { net.minecraft.client.render.entity.equipment.EquipmentRenderer.equipmentModelLoader = value.wrapperContained; }

// public java.util.function.Function layerTextures() { return wrapperContained.layerTextures; }
// public void layerTextures(java.util.function.Function value) { wrapperContained.layerTextures = value; }
// public static java.util.function.Function layerTextures() { return net.minecraft.client.render.entity.equipment.EquipmentRenderer.layerTextures; }
// public static void layerTextures(java.util.function.Function value, ) { net.minecraft.client.render.entity.equipment.EquipmentRenderer.layerTextures = value; }

// public java.util.function.Function trimSprites() { return wrapperContained.trimSprites; }
// public void trimSprites(java.util.function.Function value) { wrapperContained.trimSprites = value; }
// public static java.util.function.Function trimSprites() { return net.minecraft.client.render.entity.equipment.EquipmentRenderer.trimSprites; }
// public static void trimSprites(java.util.function.Function value, ) { net.minecraft.client.render.entity.equipment.EquipmentRenderer.trimSprites = value; }

public EquipmentRenderer(yarnwrap.client.render.entity.equipment.EquipmentModelLoader equipmentModelLoader,yarnwrap.client.texture.SpriteAtlasTexture armorTrimsAtlas) { this.wrapperContained = new net.minecraft.client.render.entity.equipment.EquipmentRenderer(equipmentModelLoader.wrapperContained,armorTrimsAtlas.wrapperContained); }
// public int getDyeColor(Object layer,int dyeColor) { return wrapperContained.getDyeColor(layer,dyeColor); }
// public static int getDyeColor(Object layer,int dyeColor, ) { return net.minecraft.client.render.entity.equipment.EquipmentRenderer.getDyeColor(layer,dyeColor); }
// public void render(Object layerType,yarnwrap.registry.RegistryKey assetKey,yarnwrap.client.model.Model model,yarnwrap.item.ItemStack stack,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.render(layerType,assetKey.wrapperContained,model.wrapperContained,stack.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public static void render(Object layerType,yarnwrap.registry.RegistryKey assetKey,yarnwrap.client.model.Model model,yarnwrap.item.ItemStack stack,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light, ) { net.minecraft.client.render.entity.equipment.EquipmentRenderer.render(layerType,assetKey.wrapperContained,model.wrapperContained,stack.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }
// public void render(Object layerType,yarnwrap.registry.RegistryKey assetKey,yarnwrap.client.model.Model model,yarnwrap.item.ItemStack stack,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.util.Identifier texture) { wrapperContained.render(layerType,assetKey.wrapperContained,model.wrapperContained,stack.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,texture.wrapperContained); }
// public static void render(Object layerType,yarnwrap.registry.RegistryKey assetKey,yarnwrap.client.model.Model model,yarnwrap.item.ItemStack stack,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.util.Identifier texture, ) { net.minecraft.client.render.entity.equipment.EquipmentRenderer.render(layerType,assetKey.wrapperContained,model.wrapperContained,stack.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,texture.wrapperContained); }
// public yarnwrap.util.Identifier method_64079(Object key) { return new yarnwrap.util.Identifier(wrapperContained.method_64079(key)); }
// public static yarnwrap.util.Identifier method_64079(Object key, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.equipment.EquipmentRenderer.method_64079(key)); }
// public yarnwrap.client.texture.Sprite method_64080(yarnwrap.client.texture.SpriteAtlasTexture key) { return new yarnwrap.client.texture.Sprite(wrapperContained.method_64080(key.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite method_64080(yarnwrap.client.texture.SpriteAtlasTexture key, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.entity.equipment.EquipmentRenderer.method_64080(key.wrapperContained)); }

}