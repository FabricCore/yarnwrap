package yarnwrap.datafixer.schema;
public class Schema100 { public net.minecraft.datafixer.schema.Schema100 wrapperContained; public Schema100(net.minecraft.datafixer.schema.Schema100 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema100(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema100(versionKey,parent); }
// public void targetEntityItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId) { wrapperContained.targetEntityItems(schema,map,entityId); }
// public static void targetEntityItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId, ) { net.minecraft.datafixer.schema.Schema100.targetEntityItems(schema,map,entityId); }
// public com.mojang.datafixers.types.templates.TypeTemplate targetItems(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.targetItems(schema); }
// public static com.mojang.datafixers.types.templates.TypeTemplate targetItems(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema100.targetItems(schema); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5197(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5197(name); }
// public static com.mojang.datafixers.types.templates.TypeTemplate method_5197(com.mojang.datafixers.schemas.Schema name, ) { return net.minecraft.datafixer.schema.Schema100.method_5197(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5198(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5198(name); }
// public static com.mojang.datafixers.types.templates.TypeTemplate method_5198(com.mojang.datafixers.schemas.Schema name, ) { return net.minecraft.datafixer.schema.Schema100.method_5198(name); }
// public com.mojang.datafixers.types.templates.TypeTemplate method_5199(com.mojang.datafixers.schemas.Schema name) { return wrapperContained.method_5199(name); }
// public static com.mojang.datafixers.types.templates.TypeTemplate method_5199(com.mojang.datafixers.schemas.Schema name, ) { return net.minecraft.datafixer.schema.Schema100.method_5199(name); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema100.registerEntities(schema); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }
// public static void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes, ) { net.minecraft.datafixer.schema.Schema100.registerTypes(schema,entityTypes,blockEntityTypes); }

}