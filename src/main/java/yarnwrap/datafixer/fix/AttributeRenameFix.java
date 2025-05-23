package yarnwrap.datafixer.fix;
public class AttributeRenameFix { public net.minecraft.datafixer.fix.AttributeRenameFix wrapperContained; public AttributeRenameFix(net.minecraft.datafixer.fix.AttributeRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.datafixer.fix.AttributeRenameFix.name; }
// public static void name(java.lang.String value, ) { net.minecraft.datafixer.fix.AttributeRenameFix.name = value; }

// public java.util.function.UnaryOperator renamer() { return wrapperContained.renamer; }
// public void renamer(java.util.function.UnaryOperator value) { wrapperContained.renamer = value; }
// public static java.util.function.UnaryOperator renamer() { return net.minecraft.datafixer.fix.AttributeRenameFix.renamer; }
// public static void renamer(java.util.function.UnaryOperator value, ) { net.minecraft.datafixer.fix.AttributeRenameFix.renamer = value; }

public AttributeRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.UnaryOperator renamer) { this.wrapperContained = new net.minecraft.datafixer.fix.AttributeRenameFix(outputSchema,name,renamer); }
// public com.mojang.datafixers.Typed applyToComponents() { return wrapperContained.applyToComponents(); }
// public static com.mojang.datafixers.Typed applyToComponents() { return net.minecraft.datafixer.fix.AttributeRenameFix.applyToComponents(); }
// public com.mojang.serialization.Dynamic applyToIdField() { return wrapperContained.applyToIdField(); }
// public static com.mojang.serialization.Dynamic applyToIdField() { return net.minecraft.datafixer.fix.AttributeRenameFix.applyToIdField(); }
// public com.mojang.datafixers.Typed applyToEntity() { return wrapperContained.applyToEntity(); }
// public static com.mojang.datafixers.Typed applyToEntity() { return net.minecraft.datafixer.fix.AttributeRenameFix.applyToEntity(); }
// public com.mojang.serialization.Dynamic applyToTypeField() { return wrapperContained.applyToTypeField(); }
// public static com.mojang.serialization.Dynamic applyToTypeField() { return net.minecraft.datafixer.fix.AttributeRenameFix.applyToTypeField(); }

}