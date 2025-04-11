package yarnwrap.datafixer.schema;
public class Schema501 { public net.minecraft.datafixer.schema.Schema501 wrapperContained; public Schema501(net.minecraft.datafixer.schema.Schema501 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema501(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema501(versionKey,parent); }
public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }

}