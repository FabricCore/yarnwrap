package yarnwrap.datafixer.fix;
public class EmptyItemInVillagerTradeFix { public net.minecraft.datafixer.fix.EmptyItemInVillagerTradeFix wrapperContained; public EmptyItemInVillagerTradeFix(net.minecraft.datafixer.fix.EmptyItemInVillagerTradeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EmptyItemInVillagerTradeFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EmptyItemInVillagerTradeFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_59626(com.mojang.serialization.Dynamic villagerTradeDynamic) { return wrapperContained.method_59626(villagerTradeDynamic); }
// public static com.mojang.serialization.Dynamic method_59626(com.mojang.serialization.Dynamic villagerTradeDynamic, ) { return net.minecraft.datafixer.fix.EmptyItemInVillagerTradeFix.method_59626(villagerTradeDynamic); }

}