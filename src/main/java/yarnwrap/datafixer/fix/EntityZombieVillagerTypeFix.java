package yarnwrap.datafixer.fix;
public class EntityZombieVillagerTypeFix { public net.minecraft.datafixer.fix.EntityZombieVillagerTypeFix wrapperContained; public EntityZombieVillagerTypeFix(net.minecraft.datafixer.fix.EntityZombieVillagerTypeFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TYPE_COUNT() { return wrapperContained.TYPE_COUNT; }
// public void TYPE_COUNT(int value) { wrapperContained.TYPE_COUNT = value; }
// public static int TYPE_COUNT() { return net.minecraft.datafixer.fix.EntityZombieVillagerTypeFix.TYPE_COUNT; }
// public static void TYPE_COUNT(int value, ) { net.minecraft.datafixer.fix.EntityZombieVillagerTypeFix.TYPE_COUNT = value; }

public EntityZombieVillagerTypeFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityZombieVillagerTypeFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixZombieType(com.mojang.serialization.Dynamic zombieDynamic) { return wrapperContained.fixZombieType(zombieDynamic); }
// public static com.mojang.serialization.Dynamic fixZombieType(com.mojang.serialization.Dynamic zombieDynamic, ) { return net.minecraft.datafixer.fix.EntityZombieVillagerTypeFix.fixZombieType(zombieDynamic); }
// public int clampType(int type) { return wrapperContained.clampType(type); }
// public static int clampType(int type, ) { return net.minecraft.datafixer.fix.EntityZombieVillagerTypeFix.clampType(type); }

}