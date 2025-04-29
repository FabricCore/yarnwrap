package yarnwrap.client.realms.dto;
public class Ops { public net.minecraft.client.realms.dto.Ops wrapperContained; public Ops(net.minecraft.client.realms.dto.Ops wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Set ops() { return wrapperContained.ops; }
public void ops(java.util.Set value) { wrapperContained.ops = value; }
// public static java.util.Set ops() { return net.minecraft.client.realms.dto.Ops.ops; }
// public static void ops(java.util.Set value, ) { net.minecraft.client.realms.dto.Ops.ops = value; }

// public yarnwrap.client.realms.dto.Ops parse(java.lang.String json) { return new yarnwrap.client.realms.dto.Ops(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.Ops parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.Ops(net.minecraft.client.realms.dto.Ops.parse(json)); }

}