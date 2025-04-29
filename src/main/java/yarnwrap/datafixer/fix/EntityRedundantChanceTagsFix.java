package yarnwrap.datafixer.fix;
public class EntityRedundantChanceTagsFix { public net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix wrapperContained; public EntityRedundantChanceTagsFix(net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec FLOAT_LIST_CODEC() { return wrapperContained.FLOAT_LIST_CODEC; }
// public void FLOAT_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.FLOAT_LIST_CODEC = value; }
// public static com.mojang.serialization.Codec FLOAT_LIST_CODEC() { return net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix.FLOAT_LIST_CODEC; }
// public static void FLOAT_LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix.FLOAT_LIST_CODEC = value; }

public EntityRedundantChanceTagsFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_28188(com.mojang.serialization.Dynamic entityTyped) { return wrapperContained.method_28188(entityTyped); }
// public static com.mojang.serialization.Dynamic method_28188(com.mojang.serialization.Dynamic entityTyped, ) { return net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix.method_28188(entityTyped); }
// public java.lang.Boolean method_30072(int chances) { return wrapperContained.method_30072(chances); }
// public static java.lang.Boolean method_30072(int chances, ) { return net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix.method_30072(chances); }
// public boolean hasZeroDropChance(com.mojang.serialization.OptionalDynamic listTag,int expectedLength) { return wrapperContained.hasZeroDropChance(listTag,expectedLength); }
// public static boolean hasZeroDropChance(com.mojang.serialization.OptionalDynamic listTag,int expectedLength, ) { return net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix.hasZeroDropChance(listTag,expectedLength); }
// public boolean method_30074(java.lang.Float chance) { return wrapperContained.method_30074(chance); }
// public static boolean method_30074(java.lang.Float chance, ) { return net.minecraft.datafixer.fix.EntityRedundantChanceTagsFix.method_30074(chance); }

}