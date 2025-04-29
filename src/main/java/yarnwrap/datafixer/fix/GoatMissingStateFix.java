package yarnwrap.datafixer.fix;
public class GoatMissingStateFix { public net.minecraft.datafixer.fix.GoatMissingStateFix wrapperContained; public GoatMissingStateFix(net.minecraft.datafixer.fix.GoatMissingStateFix wrapperContained) { this.wrapperContained = wrapperContained; }

public GoatMissingStateFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.GoatMissingStateFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_44319(com.mojang.serialization.Dynamic goatDynamic) { return wrapperContained.method_44319(goatDynamic); }
// public static com.mojang.serialization.Dynamic method_44319(com.mojang.serialization.Dynamic goatDynamic, ) { return net.minecraft.datafixer.fix.GoatMissingStateFix.method_44319(goatDynamic); }

}