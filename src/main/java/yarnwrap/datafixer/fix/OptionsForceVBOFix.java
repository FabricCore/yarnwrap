package yarnwrap.datafixer.fix;
public class OptionsForceVBOFix { public net.minecraft.datafixer.fix.OptionsForceVBOFix wrapperContained; public OptionsForceVBOFix(net.minecraft.datafixer.fix.OptionsForceVBOFix wrapperContained) { this.wrapperContained = wrapperContained; }

public OptionsForceVBOFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.OptionsForceVBOFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_5123(com.mojang.serialization.Dynamic optionsDynamic) { return wrapperContained.method_5123(optionsDynamic); }
// public com.mojang.datafixers.Typed method_5124(com.mojang.datafixers.Typed optionsTyped) { return wrapperContained.method_5124(optionsTyped); }

}