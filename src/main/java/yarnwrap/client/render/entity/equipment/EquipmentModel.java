package yarnwrap.client.render.entity.equipment;
public class EquipmentModel { public net.minecraft.client.render.entity.equipment.EquipmentModel wrapperContained; public EquipmentModel(net.minecraft.client.render.entity.equipment.EquipmentModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.entity.equipment.EquipmentModel.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.entity.equipment.EquipmentModel.CODEC = value; }

// public com.mojang.serialization.Codec LAYER_LIST_CODEC() { return wrapperContained.LAYER_LIST_CODEC; }
// public void LAYER_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LAYER_LIST_CODEC = value; }
// public static com.mojang.serialization.Codec LAYER_LIST_CODEC() { return net.minecraft.client.render.entity.equipment.EquipmentModel.LAYER_LIST_CODEC; }
// public static void LAYER_LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.entity.equipment.EquipmentModel.LAYER_LIST_CODEC = value; }

// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.client.render.entity.equipment.EquipmentModel.builder(); }
// public com.mojang.datafixers.kinds.App method_63995(Object instance) { return wrapperContained.method_63995(instance); }
// public static com.mojang.datafixers.kinds.App method_63995(Object instance, ) { return net.minecraft.client.render.entity.equipment.EquipmentModel.method_63995(instance); }
// public java.util.List getLayers(Object layerType) { return wrapperContained.getLayers(layerType); }
// public static java.util.List getLayers(Object layerType, ) { return net.minecraft.client.render.entity.equipment.EquipmentModel.getLayers(layerType); }

}