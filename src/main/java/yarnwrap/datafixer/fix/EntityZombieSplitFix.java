package yarnwrap.datafixer.fix;
public class EntityZombieSplitFix { public net.minecraft.datafixer.fix.EntityZombieSplitFix wrapperContained; public EntityZombieSplitFix(net.minecraft.datafixer.fix.EntityZombieSplitFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier ZOMBIE_VILLAGER_TYPE() { return wrapperContained.ZOMBIE_VILLAGER_TYPE; }
// public void ZOMBIE_VILLAGER_TYPE(java.util.function.Supplier value) { wrapperContained.ZOMBIE_VILLAGER_TYPE = value; }
// public static java.util.function.Supplier ZOMBIE_VILLAGER_TYPE() { return net.minecraft.datafixer.fix.EntityZombieSplitFix.ZOMBIE_VILLAGER_TYPE; }
// public static void ZOMBIE_VILLAGER_TYPE(java.util.function.Supplier value, ) { net.minecraft.datafixer.fix.EntityZombieSplitFix.ZOMBIE_VILLAGER_TYPE = value; }

public EntityZombieSplitFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityZombieSplitFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_59811(int zombieVillagerDynamic) { return wrapperContained.method_59811(zombieVillagerDynamic); }
// public static com.mojang.serialization.Dynamic method_59811(int zombieVillagerDynamic, ) { return net.minecraft.datafixer.fix.EntityZombieSplitFix.method_59811(zombieVillagerDynamic); }
// public com.mojang.datafixers.Typed setZombieVillagerProfession(com.mojang.datafixers.Typed entityTyped,int variant) { return wrapperContained.setZombieVillagerProfession(entityTyped,variant); }
// public static com.mojang.datafixers.Typed setZombieVillagerProfession(com.mojang.datafixers.Typed entityTyped,int variant, ) { return net.minecraft.datafixer.fix.EntityZombieSplitFix.setZombieVillagerProfession(entityTyped,variant); }
// public com.mojang.serialization.Dynamic method_59813(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.method_59813(entityDynamic); }
// public static com.mojang.serialization.Dynamic method_59813(com.mojang.serialization.Dynamic entityDynamic, ) { return net.minecraft.datafixer.fix.EntityZombieSplitFix.method_59813(entityDynamic); }

}