package yarnwrap.datafixer.schema;
public class Schema2509 { public net.minecraft.datafixer.schema.Schema2509 wrapperContained; public Schema2509(net.minecraft.datafixer.schema.Schema2509 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema2509.registerEntities(schema); }

}