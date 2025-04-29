package yarnwrap.datafixer.schema;
public class Schema1928 { public net.minecraft.datafixer.schema.Schema1928 wrapperContained; public Schema1928(net.minecraft.datafixer.schema.Schema1928 wrapperContained) { this.wrapperContained = wrapperContained; }

// public void targetEntityItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId) { wrapperContained.targetEntityItems(schema,map,entityId); }
// public static void targetEntityItems(com.mojang.datafixers.schemas.Schema schema,java.util.Map map,java.lang.String entityId, ) { net.minecraft.datafixer.schema.Schema1928.targetEntityItems(schema,map,entityId); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1928.registerEntities(schema); }

}