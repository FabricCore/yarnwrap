package yarnwrap.datafixer.fix;
public class RenameChunkStatusFix { public net.minecraft.datafixer.fix.RenameChunkStatusFix wrapperContained; public RenameChunkStatusFix(net.minecraft.datafixer.fix.RenameChunkStatusFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.function.UnaryOperator mapper() { return wrapperContained.mapper; }
// public void mapper(java.util.function.UnaryOperator value) { wrapperContained.mapper = value; }
public RenameChunkStatusFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.UnaryOperator mapper) { this.wrapperContained = new net.minecraft.datafixer.fix.RenameChunkStatusFix(outputSchema,name,mapper); }
// public com.mojang.datafixers.Typed method_51290(com.mojang.datafixers.Typed typed) { return wrapperContained.method_51290(typed); }
// public com.mojang.serialization.Dynamic updateStatus(com.mojang.serialization.Dynamic status) { return wrapperContained.updateStatus(status); }
// public com.mojang.serialization.Dynamic method_51292(com.mojang.serialization.Dynamic chunk) { return wrapperContained.method_51292(chunk); }

}