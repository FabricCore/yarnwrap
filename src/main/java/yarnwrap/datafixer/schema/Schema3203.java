package yarnwrap.datafixer.schema;
public class Schema3203 { public net.minecraft.datafixer.schema.Schema3203 wrapperContained; public Schema3203(net.minecraft.datafixer.schema.Schema3203 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema3203.registerEntities(schema); }

}