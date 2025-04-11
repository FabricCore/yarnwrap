package yarnwrap.datafixer.schema;
public class Schema2100 { public net.minecraft.datafixer.schema.Schema2100 wrapperContained; public Schema2100(net.minecraft.datafixer.schema.Schema2100 wrapperContained) { this.wrapperContained = wrapperContained; }

// public void registerEntity(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.lang.String name) { wrapperContained.registerEntity(schema,entityTypes,name); }
public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}