package yarnwrap.datafixer.fix;
public class VillagerTradeFix { public net.minecraft.datafixer.fix.VillagerTradeFix wrapperContained; public VillagerTradeFix(net.minecraft.datafixer.fix.VillagerTradeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public VillagerTradeFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.VillagerTradeFix(outputSchema); }
// public com.mojang.datafixers.Typed fixPumpkinTrade(com.mojang.datafixers.OpticFinder idOpticFinder,com.mojang.datafixers.Typed itemTyped) { return wrapperContained.fixPumpkinTrade(idOpticFinder,itemTyped); }
// public com.mojang.datafixers.util.Pair method_5190(com.mojang.datafixers.util.Pair entry) { return wrapperContained.method_5190(entry); }
// public java.lang.String method_5192(java.lang.String id) { return wrapperContained.method_5192(id); }
// public com.mojang.datafixers.Typed method_59638(com.mojang.datafixers.OpticFinder villagerTradeTyped) { return wrapperContained.method_59638(villagerTradeTyped); }
// public com.mojang.datafixers.Typed method_59639(com.mojang.datafixers.OpticFinder itemTyped) { return wrapperContained.method_59639(itemTyped); }

}