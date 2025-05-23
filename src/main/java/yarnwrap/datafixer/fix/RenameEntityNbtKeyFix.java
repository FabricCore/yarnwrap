package yarnwrap.datafixer.fix;
public class RenameEntityNbtKeyFix { public net.minecraft.datafixer.fix.RenameEntityNbtKeyFix wrapperContained; public RenameEntityNbtKeyFix(net.minecraft.datafixer.fix.RenameEntityNbtKeyFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map oldToNewKeyNames() { return wrapperContained.oldToNewKeyNames; }
// public void oldToNewKeyNames(java.util.Map value) { wrapperContained.oldToNewKeyNames = value; }
// public static java.util.Map oldToNewKeyNames() { return net.minecraft.datafixer.fix.RenameEntityNbtKeyFix.oldToNewKeyNames; }
// public static void oldToNewKeyNames(java.util.Map value, ) { net.minecraft.datafixer.fix.RenameEntityNbtKeyFix.oldToNewKeyNames = value; }

public RenameEntityNbtKeyFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.lang.String entityId,java.util.Map oldToNewKeyNames) { this.wrapperContained = new net.minecraft.datafixer.fix.RenameEntityNbtKeyFix(outputSchema,name,entityId,oldToNewKeyNames); }
public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fix(dynamic); }
// public static com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.RenameEntityNbtKeyFix.fix(dynamic); }

}