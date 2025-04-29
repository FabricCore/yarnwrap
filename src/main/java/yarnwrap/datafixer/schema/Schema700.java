package yarnwrap.datafixer.schema;
public class Schema700 { public net.minecraft.datafixer.schema.Schema700 wrapperContained; public Schema700(net.minecraft.datafixer.schema.Schema700 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema700(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema700(versionKey,parent); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema700.registerEntities(schema); }

}