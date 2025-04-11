package yarnwrap.datafixer.schema;
public class Schema703 { public net.minecraft.datafixer.schema.Schema703 wrapperContained; public Schema703(net.minecraft.datafixer.schema.Schema703 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema703(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema703(versionKey,parent); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}