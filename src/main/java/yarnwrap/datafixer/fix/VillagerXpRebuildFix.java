package yarnwrap.datafixer.fix;
public class VillagerXpRebuildFix { public net.minecraft.datafixer.fix.VillagerXpRebuildFix wrapperContained; public VillagerXpRebuildFix(net.minecraft.datafixer.fix.VillagerXpRebuildFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] LEVEL_TO_XP() { return wrapperContained.LEVEL_TO_XP; }
// public void LEVEL_TO_XP(int[] value) { wrapperContained.LEVEL_TO_XP = value; }
// public int TRADES_PER_LEVEL() { return wrapperContained.TRADES_PER_LEVEL; }
// public void TRADES_PER_LEVEL(int value) { wrapperContained.TRADES_PER_LEVEL = value; }
public VillagerXpRebuildFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesTyped) { this.wrapperContained = new net.minecraft.datafixer.fix.VillagerXpRebuildFix(outputSchema,changesTyped); }
public int levelToXp(int level) { return wrapperContained.levelToXp(level); }
// public com.mojang.datafixers.Typed method_20484(com.mojang.datafixers.OpticFinder villagerTyped) { return wrapperContained.method_20484(villagerTyped); }
// public java.lang.Integer method_20485(com.mojang.datafixers.OpticFinder recipesTyped) { return wrapperContained.method_20485(recipesTyped); }
// public com.mojang.datafixers.Typed method_20486(com.mojang.datafixers.OpticFinder entityTyped) { return wrapperContained.method_20486(entityTyped); }
// public com.mojang.datafixers.Typed fixLevel(com.mojang.datafixers.Typed villagerTyped,int level) { return wrapperContained.fixLevel(villagerTyped,level); }
// public java.util.Optional method_20489(com.mojang.datafixers.OpticFinder offersTyped) { return wrapperContained.method_20489(offersTyped); }
// public com.mojang.datafixers.Typed fixXp(com.mojang.datafixers.Typed villagerTyped,int level) { return wrapperContained.fixXp(villagerTyped,level); }
// public com.mojang.serialization.Dynamic method_28265(int villagerDynamic) { return wrapperContained.method_28265(villagerDynamic); }
// public com.mojang.serialization.Dynamic method_28266(int villagerdynamic) { return wrapperContained.method_28266(villagerdynamic); }
// public com.mojang.serialization.Dynamic method_28267(int villagerDataDynamic) { return wrapperContained.method_28267(villagerDataDynamic); }

}