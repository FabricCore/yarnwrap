package yarnwrap.client.data;
public class EquipmentAssetProvider { public net.minecraft.client.data.EquipmentAssetProvider wrapperContained; public EquipmentAssetProvider(net.minecraft.client.data.EquipmentAssetProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object pathResolver() { return wrapperContained.pathResolver; }
// // public void pathResolver(Object value) { wrapperContained.pathResolver = value; }
// // public static Object pathResolver() { return net.minecraft.client.data.EquipmentAssetProvider.pathResolver; }
// // public static void pathResolver(Object value, ) { net.minecraft.client.data.EquipmentAssetProvider.pathResolver = value; }

public EquipmentAssetProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.client.data.EquipmentAssetProvider(output.wrapperContained); }
// public void method_64112(java.util.Map key,yarnwrap.registry.RegistryKey model) { wrapperContained.method_64112(key,model.wrapperContained); }
// public static void method_64112(java.util.Map key,yarnwrap.registry.RegistryKey model, ) { net.minecraft.client.data.EquipmentAssetProvider.method_64112(key,model.wrapperContained); }
// public yarnwrap.client.render.entity.equipment.EquipmentModel createHumanoidOnlyModel(java.lang.String id) { return new yarnwrap.client.render.entity.equipment.EquipmentModel(wrapperContained.createHumanoidOnlyModel(id)); }
// public static yarnwrap.client.render.entity.equipment.EquipmentModel createHumanoidOnlyModel(java.lang.String id, ) { return new yarnwrap.client.render.entity.equipment.EquipmentModel(net.minecraft.client.data.EquipmentAssetProvider.createHumanoidOnlyModel(id)); }
// public void bootstrap(java.util.function.BiConsumer equipmentBiConsumer) { wrapperContained.bootstrap(equipmentBiConsumer); }
// public static void bootstrap(java.util.function.BiConsumer equipmentBiConsumer, ) { net.minecraft.client.data.EquipmentAssetProvider.bootstrap(equipmentBiConsumer); }
// public yarnwrap.client.render.entity.equipment.EquipmentModel createHumanoidAndHorseModel(java.lang.String id) { return new yarnwrap.client.render.entity.equipment.EquipmentModel(wrapperContained.createHumanoidAndHorseModel(id)); }
// public static yarnwrap.client.render.entity.equipment.EquipmentModel createHumanoidAndHorseModel(java.lang.String id, ) { return new yarnwrap.client.render.entity.equipment.EquipmentModel(net.minecraft.client.data.EquipmentAssetProvider.createHumanoidAndHorseModel(id)); }

}