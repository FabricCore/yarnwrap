package yarnwrap.datafixer.schema;
public class Schema1451v6 { public net.minecraft.datafixer.schema.Schema1451v6 wrapperContained; public Schema1451v6(net.minecraft.datafixer.schema.Schema1451v6 wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SPECIAL_TYPE() { return wrapperContained.SPECIAL_TYPE; }
// public void SPECIAL_TYPE(java.lang.String value) { wrapperContained.SPECIAL_TYPE = value; }
public static java.lang.String SPECIAL_TYPE() { return net.minecraft.datafixer.schema.Schema1451v6.SPECIAL_TYPE; }
// public static void SPECIAL_TYPE(java.lang.String value, ) { net.minecraft.datafixer.schema.Schema1451v6.SPECIAL_TYPE = value; }

// public java.util.Map method_37389(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.method_37389(schema); }
// public static java.util.Map method_37389(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1451v6.method_37389(schema); }
// public java.lang.String toDotSeparated(java.lang.String id) { return wrapperContained.toDotSeparated(id); }
// public static java.lang.String toDotSeparated(java.lang.String id, ) { return net.minecraft.datafixer.schema.Schema1451v6.toDotSeparated(id); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }
// public static void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes, ) { net.minecraft.datafixer.schema.Schema1451v6.registerTypes(schema,entityTypes,blockEntityTypes); }

}