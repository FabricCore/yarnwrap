package yarnwrap.datafixer.fix;
public class StatsRenameFix { public net.minecraft.datafixer.fix.StatsRenameFix wrapperContained; public StatsRenameFix(net.minecraft.datafixer.fix.StatsRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.Map replacements() { return wrapperContained.replacements; }
// public void replacements(java.util.Map value) { wrapperContained.replacements = value; }
public StatsRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.Map replacements) { this.wrapperContained = new net.minecraft.datafixer.fix.StatsRenameFix(outputSchema,name,replacements); }
// public com.mojang.datafixers.TypeRewriteRule renameObjectives() { return wrapperContained.renameObjectives(); }
// public com.mojang.datafixers.Typed method_37379(com.mojang.datafixers.OpticFinder statsTyped) { return wrapperContained.method_37379(statsTyped); }
// public com.mojang.datafixers.Typed method_37380(com.mojang.datafixers.OpticFinder statsInnerTyped) { return wrapperContained.method_37380(statsInnerTyped); }
// public com.mojang.datafixers.Typed method_37381(com.mojang.datafixers.OpticFinder customStatTyped) { return wrapperContained.method_37381(customStatTyped); }
// public java.lang.String method_37382(java.lang.String old) { return wrapperContained.method_37382(old); }
// public com.mojang.datafixers.TypeRewriteRule renameStats() { return wrapperContained.renameStats(); }
// public com.mojang.datafixers.Typed method_37384(com.mojang.datafixers.OpticFinder objectiveTyped) { return wrapperContained.method_37384(objectiveTyped); }
// public com.mojang.datafixers.Typed method_37385(com.mojang.datafixers.OpticFinder criteriaTypeTyped) { return wrapperContained.method_37385(criteriaTypeTyped); }
// public com.mojang.datafixers.Typed method_37386(com.mojang.datafixers.OpticFinder customCriteriaTypeTyped) { return wrapperContained.method_37386(customCriteriaTypeTyped); }
// public java.lang.String method_37387(java.lang.String old) { return wrapperContained.method_37387(old); }

}