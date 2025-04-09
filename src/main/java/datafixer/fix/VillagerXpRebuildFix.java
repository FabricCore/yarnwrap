package yarnwrap.datafixer.fix;
public class VillagerXpRebuildFix { public net.minecraft.datafixer.fix.VillagerXpRebuildFix wrapperContained; public VillagerXpRebuildFix(net.minecraft.datafixer.fix.VillagerXpRebuildFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] LEVEL_TO_XP() { return wrapperContained.LEVEL_TO_XP; }
// public int TRADES_PER_LEVEL() { return wrapperContained.TRADES_PER_LEVEL; }
public int levelToXp(int level) { return wrapperContained.levelToXp(level); }
// public com.mojang.datafixers.Typed fixLevel(com.mojang.datafixers.Typed villagerTyped,int level) { return wrapperContained.fixLevel(villagerTyped,level); }
// public com.mojang.datafixers.Typed fixXp(com.mojang.datafixers.Typed villagerTyped,int level) { return wrapperContained.fixXp(villagerTyped,level); }

}