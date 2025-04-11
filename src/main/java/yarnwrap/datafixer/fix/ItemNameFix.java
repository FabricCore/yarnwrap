package yarnwrap.datafixer.fix;
public class ItemNameFix { public net.minecraft.datafixer.fix.ItemNameFix wrapperContained; public ItemNameFix(net.minecraft.datafixer.fix.ItemNameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public ItemNameFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemNameFix(outputSchema,name); }
public com.mojang.datafixers.DataFix create(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.Function rename) { return wrapperContained.create(outputSchema,name,rename); }
// public java.lang.String rename(java.lang.String input) { return wrapperContained.rename(input); }

}