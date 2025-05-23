package yarnwrap.datafixer.fix;
public class PlayerEquipmentFix { public net.minecraft.datafixer.fix.PlayerEquipmentFix wrapperContained; public PlayerEquipmentFix(net.minecraft.datafixer.fix.PlayerEquipmentFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map SLOT_ID_MAP() { return wrapperContained.SLOT_ID_MAP; }
// public void SLOT_ID_MAP(java.util.Map value) { wrapperContained.SLOT_ID_MAP = value; }
// public static java.util.Map SLOT_ID_MAP() { return net.minecraft.datafixer.fix.PlayerEquipmentFix.SLOT_ID_MAP; }
// public static void SLOT_ID_MAP(java.util.Map value, ) { net.minecraft.datafixer.fix.PlayerEquipmentFix.SLOT_ID_MAP = value; }

public PlayerEquipmentFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.PlayerEquipmentFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_67507(com.mojang.serialization.Dynamic playerDynamic) { return wrapperContained.method_67507(playerDynamic); }
// public static com.mojang.serialization.Dynamic method_67507(com.mojang.serialization.Dynamic playerDynamic, ) { return net.minecraft.datafixer.fix.PlayerEquipmentFix.method_67507(playerDynamic); }
// public com.mojang.serialization.Dynamic method_67508(java.util.Map inventoryDynamic) { return wrapperContained.method_67508(inventoryDynamic); }
// public static com.mojang.serialization.Dynamic method_67508(java.util.Map inventoryDynamic, ) { return net.minecraft.datafixer.fix.PlayerEquipmentFix.method_67508(inventoryDynamic); }

}