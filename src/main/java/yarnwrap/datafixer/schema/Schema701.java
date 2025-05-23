package yarnwrap.datafixer.schema;
public class Schema701 { public net.minecraft.datafixer.schema.Schema701 wrapperContained; public Schema701(net.minecraft.datafixer.schema.Schema701 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema701(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema701(versionKey,parent); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema701.registerEntities(schema); }

}