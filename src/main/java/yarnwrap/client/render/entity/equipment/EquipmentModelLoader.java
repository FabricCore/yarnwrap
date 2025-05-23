package yarnwrap.client.render.entity.equipment;
public class EquipmentModelLoader { public net.minecraft.client.render.entity.equipment.EquipmentModelLoader wrapperContained; public EquipmentModelLoader(net.minecraft.client.render.entity.equipment.EquipmentModelLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.equipment.EquipmentModel EMPTY() { return new yarnwrap.client.render.entity.equipment.EquipmentModel(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.render.entity.equipment.EquipmentModel value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.render.entity.equipment.EquipmentModel EMPTY() { return new yarnwrap.client.render.entity.equipment.EquipmentModel(net.minecraft.client.render.entity.equipment.EquipmentModelLoader.EMPTY); }
// public static void EMPTY(yarnwrap.client.render.entity.equipment.EquipmentModel value, ) { net.minecraft.client.render.entity.equipment.EquipmentModelLoader.EMPTY = value.wrapperContained; }

// public java.util.Map models() { return wrapperContained.models; }
// public void models(java.util.Map value) { wrapperContained.models = value; }
// public static java.util.Map models() { return net.minecraft.client.render.entity.equipment.EquipmentModelLoader.models; }
// public static void models(java.util.Map value, ) { net.minecraft.client.render.entity.equipment.EquipmentModelLoader.models = value; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.render.entity.equipment.EquipmentModelLoader.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.render.entity.equipment.EquipmentModelLoader.FINDER = value.wrapperContained; }

public yarnwrap.client.render.entity.equipment.EquipmentModel get(yarnwrap.registry.RegistryKey assetKey) { return new yarnwrap.client.render.entity.equipment.EquipmentModel(wrapperContained.get(assetKey.wrapperContained)); }
// public static yarnwrap.client.render.entity.equipment.EquipmentModel get(yarnwrap.registry.RegistryKey assetKey, ) { return new yarnwrap.client.render.entity.equipment.EquipmentModel(net.minecraft.client.render.entity.equipment.EquipmentModelLoader.get(assetKey.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_65724(Object entry) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_65724(entry)); }
// public static yarnwrap.registry.RegistryKey method_65724(Object entry, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.client.render.entity.equipment.EquipmentModelLoader.method_65724(entry)); }

}