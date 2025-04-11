package yarnwrap.client.realms.dto;
public class Ops { public net.minecraft.client.realms.dto.Ops wrapperContained; public Ops(net.minecraft.client.realms.dto.Ops wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Set ops() { return wrapperContained.ops; }
public void ops(java.util.Set value) { wrapperContained.ops = value; }
public yarnwrap.client.realms.dto.Ops parse(java.lang.String json) { return new yarnwrap.client.realms.dto.Ops(wrapperContained.parse(json)); }

}