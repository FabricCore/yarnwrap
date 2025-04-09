package yarnwrap.datafixer.fix;
public class RenameBlockEntityFix { public net.minecraft.datafixer.fix.RenameBlockEntityFix wrapperContained; public RenameBlockEntityFix(net.minecraft.datafixer.fix.RenameBlockEntityFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public java.util.function.UnaryOperator renamer() { return wrapperContained.renamer; }
public com.mojang.datafixers.DataFix create(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.UnaryOperator renamer) { return wrapperContained.create(outputSchema,name,renamer); }

}