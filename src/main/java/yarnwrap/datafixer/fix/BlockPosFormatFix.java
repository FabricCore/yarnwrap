package yarnwrap.datafixer.fix;
public class BlockPosFormatFix { public net.minecraft.datafixer.fix.BlockPosFormatFix wrapperContained; public BlockPosFormatFix(net.minecraft.datafixer.fix.BlockPosFormatFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List PATROL_TARGET_ENTITY_IDS() { return wrapperContained.PATROL_TARGET_ENTITY_IDS; }
// public void PATROL_TARGET_ENTITY_IDS(java.util.List value) { wrapperContained.PATROL_TARGET_ENTITY_IDS = value; }
public BlockPosFormatFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockPosFormatFix(outputSchema); }
// public com.mojang.datafixers.TypeRewriteRule createFixRule(Object typeReference,java.lang.String id,java.util.Map oldToNewKey) { return wrapperContained.createFixRule(typeReference,id,oldToNewKey); }
// public com.mojang.datafixers.Typed fixOldBlockPosFormat(com.mojang.datafixers.Typed oldToNewKey) { return wrapperContained.fixOldBlockPosFormat(oldToNewKey); }
// public com.mojang.serialization.Dynamic fixMapItemFrames(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixMapItemFrames(dynamic); }
// public void addEntityFixes(java.util.List rules) { wrapperContained.addEntityFixes(rules); }
// public com.mojang.serialization.Dynamic method_56962(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.method_56962(entityDynamic); }
// public void addBlockEntityFixes(java.util.List rules) { wrapperContained.addBlockEntityFixes(rules); }
// public com.mojang.serialization.Dynamic method_56964(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.method_56964(tagDynamic); }
// public com.mojang.serialization.Dynamic method_56966(com.mojang.serialization.Dynamic banners) { return wrapperContained.method_56966(banners); }
// public com.mojang.serialization.Dynamic method_56967(com.mojang.serialization.Dynamic banner) { return wrapperContained.method_56967(banner); }
// public com.mojang.serialization.Dynamic method_56968(com.mojang.serialization.Dynamic frames) { return wrapperContained.method_56968(frames); }
// public com.mojang.serialization.Dynamic method_56969(com.mojang.serialization.Dynamic frame) { return wrapperContained.method_56969(frame); }

}