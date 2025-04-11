package yarnwrap.datafixer.fix;
public class ZombieVillagerXpRebuildFix { public net.minecraft.datafixer.fix.ZombieVillagerXpRebuildFix wrapperContained; public ZombieVillagerXpRebuildFix(net.minecraft.datafixer.fix.ZombieVillagerXpRebuildFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ZombieVillagerXpRebuildFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ZombieVillagerXpRebuildFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_20492(com.mojang.serialization.Dynamic zombieVillagerDynamic) { return wrapperContained.method_20492(zombieVillagerDynamic); }

}