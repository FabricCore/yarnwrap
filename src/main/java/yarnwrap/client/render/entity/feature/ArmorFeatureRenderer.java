package yarnwrap.client.render.entity.feature;
public class ArmorFeatureRenderer { public net.minecraft.client.render.entity.feature.ArmorFeatureRenderer wrapperContained; public ArmorFeatureRenderer(net.minecraft.client.render.entity.feature.ArmorFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.SpriteAtlasTexture armorTrimsAtlas() { return new yarnwrap.client.texture.SpriteAtlasTexture(wrapperContained.armorTrimsAtlas); }
// public void armorTrimsAtlas(yarnwrap.client.texture.SpriteAtlasTexture value) { wrapperContained.armorTrimsAtlas = value.wrapperContained; }
// public java.util.Map ARMOR_TEXTURE_CACHE() { return wrapperContained.ARMOR_TEXTURE_CACHE; }
// public void ARMOR_TEXTURE_CACHE(java.util.Map value) { wrapperContained.ARMOR_TEXTURE_CACHE = value; }
// public yarnwrap.client.render.entity.model.BipedEntityModel innerModel() { return new yarnwrap.client.render.entity.model.BipedEntityModel(wrapperContained.innerModel); }
// public void innerModel(yarnwrap.client.render.entity.model.BipedEntityModel value) { wrapperContained.innerModel = value.wrapperContained; }
// public yarnwrap.client.render.entity.model.BipedEntityModel outerModel() { return new yarnwrap.client.render.entity.model.BipedEntityModel(wrapperContained.outerModel); }
// public void outerModel(yarnwrap.client.render.entity.model.BipedEntityModel value) { wrapperContained.outerModel = value.wrapperContained; }
// public void renderArmorParts(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.render.entity.model.BipedEntityModel model) { wrapperContained.renderArmorParts(matrices.wrapperContained,vertexConsumers.wrapperContained,light,model.wrapperContained); }
// public void renderArmor(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot armorSlot,int light,yarnwrap.client.render.entity.model.BipedEntityModel model) { wrapperContained.renderArmor(matrices.wrapperContained,vertexConsumers.wrapperContained,entity.wrapperContained,armorSlot.wrapperContained,light,model.wrapperContained); }
// public void setVisible(yarnwrap.client.render.entity.model.BipedEntityModel bipedModel,yarnwrap.entity.EquipmentSlot slot) { wrapperContained.setVisible(bipedModel.wrapperContained,slot.wrapperContained); }
// public yarnwrap.client.render.entity.model.BipedEntityModel getModel(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.client.render.entity.model.BipedEntityModel(wrapperContained.getModel(slot.wrapperContained)); }
// public boolean usesInnerModel(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.usesInnerModel(slot.wrapperContained); }
// public void renderTrim(yarnwrap.registry.entry.RegistryEntry armorMaterial,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.trim.ArmorTrim trim,yarnwrap.client.render.entity.model.BipedEntityModel model,boolean leggings) { wrapperContained.renderTrim(armorMaterial.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,trim.wrapperContained,model.wrapperContained,leggings); }
// public void renderGlint(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.render.entity.model.BipedEntityModel model) { wrapperContained.renderGlint(matrices.wrapperContained,vertexConsumers.wrapperContained,light,model.wrapperContained); }

}