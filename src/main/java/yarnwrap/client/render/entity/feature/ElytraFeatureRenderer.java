package yarnwrap.client.render.entity.feature;
public class ElytraFeatureRenderer { public net.minecraft.client.render.entity.feature.ElytraFeatureRenderer wrapperContained; public ElytraFeatureRenderer(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.ElytraEntityModel model() { return new yarnwrap.client.render.entity.model.ElytraEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.ElytraEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ElytraEntityModel model() { return new yarnwrap.client.render.entity.model.ElytraEntityModel(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.ElytraEntityModel value, ) { net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.ElytraEntityModel babyModel() { return new yarnwrap.client.render.entity.model.ElytraEntityModel(wrapperContained.babyModel); }
// public void babyModel(yarnwrap.client.render.entity.model.ElytraEntityModel value) { wrapperContained.babyModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ElytraEntityModel babyModel() { return new yarnwrap.client.render.entity.model.ElytraEntityModel(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.babyModel); }
// public static void babyModel(yarnwrap.client.render.entity.model.ElytraEntityModel value, ) { net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.babyModel = value.wrapperContained; }

// public yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer() { return new yarnwrap.client.render.entity.equipment.EquipmentRenderer(wrapperContained.equipmentRenderer); }
// public void equipmentRenderer(yarnwrap.client.render.entity.equipment.EquipmentRenderer value) { wrapperContained.equipmentRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer() { return new yarnwrap.client.render.entity.equipment.EquipmentRenderer(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.equipmentRenderer); }
// public static void equipmentRenderer(yarnwrap.client.render.entity.equipment.EquipmentRenderer value, ) { net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.equipmentRenderer = value.wrapperContained; }

public ElytraFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader,yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.ElytraFeatureRenderer(context.wrapperContained,loader.wrapperContained,equipmentRenderer.wrapperContained); }
// public yarnwrap.util.Identifier getTexture(yarnwrap.client.render.entity.state.BipedEntityRenderState state) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(state.wrapperContained)); }
// public static yarnwrap.util.Identifier getTexture(yarnwrap.client.render.entity.state.BipedEntityRenderState state, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.getTexture(state.wrapperContained)); }

}