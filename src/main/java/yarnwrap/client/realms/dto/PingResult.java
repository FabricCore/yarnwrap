package yarnwrap.client.realms.dto;
public class PingResult { public net.minecraft.client.realms.dto.PingResult wrapperContained; public PingResult(net.minecraft.client.realms.dto.PingResult wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List pingResults() { return wrapperContained.pingResults; }
public void pingResults(java.util.List value) { wrapperContained.pingResults = value; }
public java.util.List worldIds() { return wrapperContained.worldIds; }
public void worldIds(java.util.List value) { wrapperContained.worldIds = value; }

}