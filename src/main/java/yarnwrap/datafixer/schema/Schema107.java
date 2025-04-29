package yarnwrap.datafixer.schema;
public class Schema107 { public net.minecraft.datafixer.schema.Schema107 wrapperContained; public Schema107(net.minecraft.datafixer.schema.Schema107 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema107(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema107(versionKey,parent); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema107.registerEntities(schema); }

}