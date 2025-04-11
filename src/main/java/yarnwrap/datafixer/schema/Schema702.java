package yarnwrap.datafixer.schema;
public class Schema702 { public net.minecraft.datafixer.schema.Schema702 wrapperContained; public Schema702(net.minecraft.datafixer.schema.Schema702 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema702(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema702(versionKey,parent); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}