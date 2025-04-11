package yarnwrap.datafixer.fix;
public class RenameBlockEntityFix { public net.minecraft.datafixer.fix.RenameBlockEntityFix wrapperContained; public RenameBlockEntityFix(net.minecraft.datafixer.fix.RenameBlockEntityFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.function.UnaryOperator renamer() { return wrapperContained.renamer; }
// public void renamer(java.util.function.UnaryOperator value) { wrapperContained.renamer = value; }
// public RenameBlockEntityFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.UnaryOperator renamer) { this.wrapperContained = new net.minecraft.datafixer.fix.RenameBlockEntityFix(outputSchema,name,renamer); }
public com.mojang.datafixers.DataFix create(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.UnaryOperator renamer) { return wrapperContained.create(outputSchema,name,renamer); }
// public com.mojang.datafixers.util.Pair method_49757(com.mojang.datafixers.util.Pair pair) { return wrapperContained.method_49757(pair); }
// public java.util.function.Function method_49758(com.mojang.serialization.DynamicOps ops) { return wrapperContained.method_49758(ops); }

}