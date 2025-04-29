package yarnwrap.datafixer.fix;
public class ObjectiveDisplayNameFix { public net.minecraft.datafixer.fix.ObjectiveDisplayNameFix wrapperContained; public ObjectiveDisplayNameFix(net.minecraft.datafixer.fix.ObjectiveDisplayNameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ObjectiveDisplayNameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ObjectiveDisplayNameFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_37372(com.mojang.datafixers.Typed objectiveTyped) { return wrapperContained.method_37372(objectiveTyped); }
// public static com.mojang.datafixers.Typed method_37372(com.mojang.datafixers.Typed objectiveTyped, ) { return net.minecraft.datafixer.fix.ObjectiveDisplayNameFix.method_37372(objectiveTyped); }
// public com.mojang.serialization.Dynamic method_37373(com.mojang.serialization.Dynamic objectiveDynamic) { return wrapperContained.method_37373(objectiveDynamic); }
// public static com.mojang.serialization.Dynamic method_37373(com.mojang.serialization.Dynamic objectiveDynamic, ) { return net.minecraft.datafixer.fix.ObjectiveDisplayNameFix.method_37373(objectiveDynamic); }

}