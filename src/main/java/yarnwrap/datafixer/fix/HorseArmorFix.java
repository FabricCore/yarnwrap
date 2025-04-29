package yarnwrap.datafixer.fix;
public class HorseArmorFix { public net.minecraft.datafixer.fix.HorseArmorFix wrapperContained; public HorseArmorFix(net.minecraft.datafixer.fix.HorseArmorFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String oldNbtKey() { return wrapperContained.oldNbtKey; }
// public void oldNbtKey(java.lang.String value) { wrapperContained.oldNbtKey = value; }
// public static java.lang.String oldNbtKey() { return net.minecraft.datafixer.fix.HorseArmorFix.oldNbtKey; }
// public static void oldNbtKey(java.lang.String value, ) { net.minecraft.datafixer.fix.HorseArmorFix.oldNbtKey = value; }

// public boolean removeOldArmor() { return wrapperContained.removeOldArmor; }
// public void removeOldArmor(boolean value) { wrapperContained.removeOldArmor = value; }
// public static boolean removeOldArmor() { return net.minecraft.datafixer.fix.HorseArmorFix.removeOldArmor; }
// public static void removeOldArmor(boolean value, ) { net.minecraft.datafixer.fix.HorseArmorFix.removeOldArmor = value; }

public HorseArmorFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String entityId,java.lang.String oldNbtKey,boolean removeOldArmor) { this.wrapperContained = new net.minecraft.datafixer.fix.HorseArmorFix(outputSchema,entityId,oldNbtKey,removeOldArmor); }
// public com.mojang.serialization.Dynamic method_59885(com.mojang.serialization.Dynamic dropChanceDynamic,long slot) { return wrapperContained.method_59885(dropChanceDynamic,slot); }
// public static com.mojang.serialization.Dynamic method_59885(com.mojang.serialization.Dynamic dropChanceDynamic,long slot, ) { return net.minecraft.datafixer.fix.HorseArmorFix.method_59885(dropChanceDynamic,slot); }
// public com.mojang.serialization.Dynamic method_59886(com.mojang.serialization.Dynamic armorDropChancesDynamic) { return wrapperContained.method_59886(armorDropChancesDynamic); }
// public static com.mojang.serialization.Dynamic method_59886(com.mojang.serialization.Dynamic armorDropChancesDynamic, ) { return net.minecraft.datafixer.fix.HorseArmorFix.method_59886(armorDropChancesDynamic); }
// public com.mojang.serialization.Dynamic method_59887(com.mojang.serialization.Dynamic itemDynamic,long slot) { return wrapperContained.method_59887(itemDynamic,slot); }
// public static com.mojang.serialization.Dynamic method_59887(com.mojang.serialization.Dynamic itemDynamic,long slot, ) { return net.minecraft.datafixer.fix.HorseArmorFix.method_59887(itemDynamic,slot); }
// public com.mojang.serialization.Dynamic method_59888(com.mojang.serialization.Dynamic armorItemsDynamic) { return wrapperContained.method_59888(armorItemsDynamic); }
// public static com.mojang.serialization.Dynamic method_59888(com.mojang.serialization.Dynamic armorItemsDynamic, ) { return net.minecraft.datafixer.fix.HorseArmorFix.method_59888(armorItemsDynamic); }

}