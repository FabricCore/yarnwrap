package yarnwrap.datafixer.fix;
public class OptionFix { public net.minecraft.datafixer.fix.OptionFix wrapperContained; public OptionFix(net.minecraft.datafixer.fix.OptionFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.lang.String oldName() { return wrapperContained.oldName; }
// public void oldName(java.lang.String value) { wrapperContained.oldName = value; }
// public java.lang.String newName() { return wrapperContained.newName; }
// public void newName(java.lang.String value) { wrapperContained.newName = value; }
public OptionFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType,java.lang.String name,java.lang.String oldName,java.lang.String newName) { this.wrapperContained = new net.minecraft.datafixer.fix.OptionFix(outputSchema,changesType,name,oldName,newName); }
// public com.mojang.datafixers.Typed method_30019(com.mojang.datafixers.Typed optionsTyped) { return wrapperContained.method_30019(optionsTyped); }
// public com.mojang.serialization.Dynamic method_30020(com.mojang.serialization.Dynamic optionsDynamic) { return wrapperContained.method_30020(optionsDynamic); }
// public com.mojang.serialization.Dynamic method_30021(com.mojang.serialization.Dynamic setting) { return wrapperContained.method_30021(setting); }

}