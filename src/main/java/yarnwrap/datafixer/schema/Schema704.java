package yarnwrap.datafixer.schema;
public class Schema704 { public net.minecraft.datafixer.schema.Schema704 wrapperContained; public Schema704(net.minecraft.datafixer.schema.Schema704 wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BLOCK_RENAMES() { return wrapperContained.BLOCK_RENAMES; }
// public void BLOCK_RENAMES(java.util.Map value) { wrapperContained.BLOCK_RENAMES = value; }
// public static java.util.Map BLOCK_RENAMES() { return net.minecraft.datafixer.schema.Schema704.BLOCK_RENAMES; }
// public static void BLOCK_RENAMES(java.util.Map value, ) { net.minecraft.datafixer.schema.Schema704.BLOCK_RENAMES = value; }

public Schema704(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema704(versionKey,parent); }
// public com.mojang.datafixers.types.Type getChoiceType(Object type,java.lang.String choiceName) { return wrapperContained.getChoiceType(type,choiceName); }
// public static com.mojang.datafixers.types.Type getChoiceType(Object type,java.lang.String choiceName, ) { return net.minecraft.datafixer.schema.Schema704.getChoiceType(type,choiceName); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }
// public static void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes, ) { net.minecraft.datafixer.schema.Schema704.registerTypes(schema,entityTypes,blockEntityTypes); }

}