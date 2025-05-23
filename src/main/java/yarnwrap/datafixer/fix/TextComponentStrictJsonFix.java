package yarnwrap.datafixer.fix;
public class TextComponentStrictJsonFix { public net.minecraft.datafixer.fix.TextComponentStrictJsonFix wrapperContained; public TextComponentStrictJsonFix(net.minecraft.datafixer.fix.TextComponentStrictJsonFix wrapperContained) { this.wrapperContained = wrapperContained; }

public TextComponentStrictJsonFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.TextComponentStrictJsonFix(outputSchema); }
// public java.util.function.Function method_66133(com.mojang.serialization.DynamicOps ops) { return wrapperContained.method_66133(ops); }
// public static java.util.function.Function method_66133(com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.datafixer.fix.TextComponentStrictJsonFix.method_66133(ops); }

}