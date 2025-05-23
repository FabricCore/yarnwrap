package yarnwrap.datafixer.fix;
public class SimpleBlockPropertyRenameFix { public net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix wrapperContained; public SimpleBlockPropertyRenameFix(net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String targetId() { return wrapperContained.targetId; }
// public void targetId(java.lang.String value) { wrapperContained.targetId = value; }
// public static java.lang.String targetId() { return net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.targetId; }
// public static void targetId(java.lang.String value, ) { net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.targetId = value; }

// public java.lang.String oldPropertyName() { return wrapperContained.oldPropertyName; }
// public void oldPropertyName(java.lang.String value) { wrapperContained.oldPropertyName = value; }
// public static java.lang.String oldPropertyName() { return net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.oldPropertyName; }
// public static void oldPropertyName(java.lang.String value, ) { net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.oldPropertyName = value; }

// public java.lang.String newPropertyName() { return wrapperContained.newPropertyName; }
// public void newPropertyName(java.lang.String value) { wrapperContained.newPropertyName = value; }
// public static java.lang.String newPropertyName() { return net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.newPropertyName; }
// public static void newPropertyName(java.lang.String value, ) { net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.newPropertyName = value; }

// public java.util.function.UnaryOperator valueConverter() { return wrapperContained.valueConverter; }
// public void valueConverter(java.util.function.UnaryOperator value) { wrapperContained.valueConverter = value; }
// public static java.util.function.UnaryOperator valueConverter() { return net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.valueConverter; }
// public static void valueConverter(java.util.function.UnaryOperator value, ) { net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.valueConverter = value; }

public SimpleBlockPropertyRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.lang.String targetId,java.lang.String oldPropertyName,java.lang.String newPropertyName,java.util.function.UnaryOperator valueConverter) { this.wrapperContained = new net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix(outputSchema,name,targetId,oldPropertyName,newPropertyName,valueConverter); }
// public com.mojang.serialization.Dynamic method_66054(com.mojang.serialization.Dynamic value) { return wrapperContained.method_66054(value); }
// public static com.mojang.serialization.Dynamic method_66054(com.mojang.serialization.Dynamic value, ) { return net.minecraft.datafixer.fix.SimpleBlockPropertyRenameFix.method_66054(value); }

}