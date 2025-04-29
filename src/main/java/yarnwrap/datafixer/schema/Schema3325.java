package yarnwrap.datafixer.schema;
public class Schema3325 { public net.minecraft.datafixer.schema.Schema3325 wrapperContained; public Schema3325(net.minecraft.datafixer.schema.Schema3325 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema3325.registerEntities(schema); }

}