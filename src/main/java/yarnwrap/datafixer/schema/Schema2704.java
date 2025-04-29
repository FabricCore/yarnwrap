package yarnwrap.datafixer.schema;
public class Schema2704 { public net.minecraft.datafixer.schema.Schema2704 wrapperContained; public Schema2704(net.minecraft.datafixer.schema.Schema2704 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema2704.registerEntities(schema); }

}