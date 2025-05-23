package yarnwrap.client.render.entity.feature;
public class LlamaDecorFeatureRenderer { public net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer wrapperContained; public LlamaDecorFeatureRenderer(net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.LlamaEntityModel model() { return new yarnwrap.client.render.entity.model.LlamaEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.LlamaEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.LlamaEntityModel model() { return new yarnwrap.client.render.entity.model.LlamaEntityModel(net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.LlamaEntityModel value, ) { net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.LlamaEntityModel babyModel() { return new yarnwrap.client.render.entity.model.LlamaEntityModel(wrapperContained.babyModel); }
// public void babyModel(yarnwrap.client.render.entity.model.LlamaEntityModel value) { wrapperContained.babyModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.LlamaEntityModel babyModel() { return new yarnwrap.client.render.entity.model.LlamaEntityModel(net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer.babyModel); }
// public static void babyModel(yarnwrap.client.render.entity.model.LlamaEntityModel value, ) { net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer.babyModel = value.wrapperContained; }

// public yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer() { return new yarnwrap.client.render.entity.equipment.EquipmentRenderer(wrapperContained.equipmentRenderer); }
// public void equipmentRenderer(yarnwrap.client.render.entity.equipment.EquipmentRenderer value) { wrapperContained.equipmentRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer() { return new yarnwrap.client.render.entity.equipment.EquipmentRenderer(net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer.equipmentRenderer); }
// public static void equipmentRenderer(yarnwrap.client.render.entity.equipment.EquipmentRenderer value, ) { net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer.equipmentRenderer = value.wrapperContained; }

public LlamaDecorFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader,yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer(context.wrapperContained,loader.wrapperContained,equipmentRenderer.wrapperContained); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.render.entity.state.LlamaEntityRenderState state,yarnwrap.item.ItemStack stack,yarnwrap.registry.RegistryKey light) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained,state.wrapperContained,stack.wrapperContained,light.wrapperContained); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.render.entity.state.LlamaEntityRenderState state,yarnwrap.item.ItemStack stack,yarnwrap.registry.RegistryKey light, ) { net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer.render(matrices.wrapperContained,vertexConsumers.wrapperContained,state.wrapperContained,stack.wrapperContained,light.wrapperContained); }

}