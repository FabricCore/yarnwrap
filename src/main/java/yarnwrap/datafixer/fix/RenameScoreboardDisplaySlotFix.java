package yarnwrap.datafixer.fix;
public class RenameScoreboardDisplaySlotFix { public net.minecraft.datafixer.fix.RenameScoreboardDisplaySlotFix wrapperContained; public RenameScoreboardDisplaySlotFix(net.minecraft.datafixer.fix.RenameScoreboardDisplaySlotFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map OLD_TO_NEW_SLOT_NAMES() { return wrapperContained.OLD_TO_NEW_SLOT_NAMES; }
// public void OLD_TO_NEW_SLOT_NAMES(java.util.Map value) { wrapperContained.OLD_TO_NEW_SLOT_NAMES = value; }
public RenameScoreboardDisplaySlotFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.RenameScoreboardDisplaySlotFix(outputSchema); }
// public com.mojang.datafixers.Typed method_52489(com.mojang.datafixers.OpticFinder scoreboardTyped) { return wrapperContained.method_52489(scoreboardTyped); }
// public com.mojang.datafixers.Typed method_52490(com.mojang.datafixers.Typed scoreboardDataTyped) { return wrapperContained.method_52490(scoreboardDataTyped); }
// public com.mojang.datafixers.util.Pair method_52491(com.mojang.datafixers.util.Pair entry) { return wrapperContained.method_52491(entry); }
// public com.mojang.serialization.Dynamic method_52492(com.mojang.serialization.Dynamic scoreboardDataDynamic) { return wrapperContained.method_52492(scoreboardDataDynamic); }
// public java.lang.String getUpdatedName(java.lang.String oldName) { return wrapperContained.getUpdatedName(oldName); }
// public com.mojang.serialization.Dynamic method_52494(com.mojang.serialization.Dynamic displaySlotsDynamic) { return wrapperContained.method_52494(displaySlotsDynamic); }
// public com.mojang.serialization.Dynamic method_52495(com.mojang.serialization.Dynamic key) { return wrapperContained.method_52495(key); }

}