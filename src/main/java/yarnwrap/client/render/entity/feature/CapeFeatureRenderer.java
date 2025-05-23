package yarnwrap.client.render.entity.feature;
public class CapeFeatureRenderer { public net.minecraft.client.render.entity.feature.CapeFeatureRenderer wrapperContained; public CapeFeatureRenderer(net.minecraft.client.render.entity.feature.CapeFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.BipedEntityModel model() { return new yarnwrap.client.render.entity.model.BipedEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.BipedEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.BipedEntityModel model() { return new yarnwrap.client.render.entity.model.BipedEntityModel(net.minecraft.client.render.entity.feature.CapeFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.BipedEntityModel value, ) { net.minecraft.client.render.entity.feature.CapeFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.client.render.entity.equipment.EquipmentModelLoader equipmentModelLoader() { return new yarnwrap.client.render.entity.equipment.EquipmentModelLoader(wrapperContained.equipmentModelLoader); }
// public void equipmentModelLoader(yarnwrap.client.render.entity.equipment.EquipmentModelLoader value) { wrapperContained.equipmentModelLoader = value.wrapperContained; }
// public static yarnwrap.client.render.entity.equipment.EquipmentModelLoader equipmentModelLoader() { return new yarnwrap.client.render.entity.equipment.EquipmentModelLoader(net.minecraft.client.render.entity.feature.CapeFeatureRenderer.equipmentModelLoader); }
// public static void equipmentModelLoader(yarnwrap.client.render.entity.equipment.EquipmentModelLoader value, ) { net.minecraft.client.render.entity.feature.CapeFeatureRenderer.equipmentModelLoader = value.wrapperContained; }

public CapeFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels modelLoader,yarnwrap.client.render.entity.equipment.EquipmentModelLoader equipmentModelLoader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.CapeFeatureRenderer(context.wrapperContained,modelLoader.wrapperContained,equipmentModelLoader.wrapperContained); }
// public boolean hasCustomModelForLayer(yarnwrap.item.ItemStack stack,Object layerType) { return wrapperContained.hasCustomModelForLayer(stack.wrapperContained,layerType); }
// public static boolean hasCustomModelForLayer(yarnwrap.item.ItemStack stack,Object layerType, ) { return net.minecraft.client.render.entity.feature.CapeFeatureRenderer.hasCustomModelForLayer(stack.wrapperContained,layerType); }

}