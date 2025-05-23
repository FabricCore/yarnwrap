package yarnwrap.client.render.entity.feature;
public class SaddleFeatureRenderer { public net.minecraft.client.render.entity.feature.SaddleFeatureRenderer wrapperContained; public SaddleFeatureRenderer(net.minecraft.client.render.entity.feature.SaddleFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer() { return new yarnwrap.client.render.entity.equipment.EquipmentRenderer(wrapperContained.equipmentRenderer); }
// public void equipmentRenderer(yarnwrap.client.render.entity.equipment.EquipmentRenderer value) { wrapperContained.equipmentRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer() { return new yarnwrap.client.render.entity.equipment.EquipmentRenderer(net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.equipmentRenderer); }
// public static void equipmentRenderer(yarnwrap.client.render.entity.equipment.EquipmentRenderer value, ) { net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.equipmentRenderer = value.wrapperContained; }

// public Object layerType() { return wrapperContained.layerType; }
// // public void layerType(Object value) { wrapperContained.layerType = value; }
// // public static Object layerType() { return net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.layerType; }
// // public static void layerType(Object value, ) { net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.layerType = value; }

// public java.util.function.Function saddleStackGetter() { return wrapperContained.saddleStackGetter; }
// public void saddleStackGetter(java.util.function.Function value) { wrapperContained.saddleStackGetter = value; }
// public static java.util.function.Function saddleStackGetter() { return net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.saddleStackGetter; }
// public static void saddleStackGetter(java.util.function.Function value, ) { net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.saddleStackGetter = value; }

// public yarnwrap.client.render.entity.model.EntityModel adultModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.adultModel); }
// public void adultModel(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.adultModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel adultModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.adultModel); }
// public static void adultModel(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.adultModel = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel babyModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.babyModel); }
// public void babyModel(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.babyModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel babyModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.babyModel); }
// public static void babyModel(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.babyModel = value.wrapperContained; }

// public SaddleFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer,yarnwrap.client.render.entity.model.EntityModel model,Object layerType,java.util.function.Function saddleStackGetter) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SaddleFeatureRenderer(context.wrapperContained,equipmentRenderer.wrapperContained,model.wrapperContained,layerType,saddleStackGetter); }
// public SaddleFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.equipment.EquipmentRenderer equipmentRenderer,Object layerType,java.util.function.Function saddleStackGetter,yarnwrap.client.render.entity.model.EntityModel adultModel,yarnwrap.client.render.entity.model.EntityModel babyModel) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SaddleFeatureRenderer(context.wrapperContained,equipmentRenderer.wrapperContained,layerType,saddleStackGetter,adultModel.wrapperContained,babyModel.wrapperContained); }

}