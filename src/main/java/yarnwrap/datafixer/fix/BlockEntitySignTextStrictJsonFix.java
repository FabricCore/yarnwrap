package yarnwrap.datafixer.fix;
public class BlockEntitySignTextStrictJsonFix { public net.minecraft.datafixer.fix.BlockEntitySignTextStrictJsonFix wrapperContained; public BlockEntitySignTextStrictJsonFix(net.minecraft.datafixer.fix.BlockEntitySignTextStrictJsonFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntitySignTextStrictJsonFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntitySignTextStrictJsonFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_15581(com.mojang.serialization.Dynamic linesDynamic) { return wrapperContained.method_15581(linesDynamic); }
// public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic signDynamic,java.lang.String lineName) { return wrapperContained.fix(signDynamic,lineName); }

}