package yarnwrap.datafixer.fix;
public class BlockNameFix { public net.minecraft.datafixer.fix.BlockNameFix wrapperContained; public BlockNameFix(net.minecraft.datafixer.fix.BlockNameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public BlockNameFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockNameFix(outputSchema,name); }
// public com.mojang.serialization.Dynamic fixBlockState(com.mojang.serialization.Dynamic blockStateDynamic) { return wrapperContained.fixBlockState(blockStateDynamic); }
public com.mojang.datafixers.DataFix create(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.Function rename) { return wrapperContained.create(outputSchema,name,rename); }
// public java.lang.String rename(java.lang.String oldName) { return wrapperContained.rename(oldName); }
// public java.lang.String fixFlatBlockState(java.lang.String flatBlockState) { return wrapperContained.fixFlatBlockState(flatBlockState); }

}