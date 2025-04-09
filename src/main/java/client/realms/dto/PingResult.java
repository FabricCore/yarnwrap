package yarnwrap.client.realms.dto;
public class PingResult { public net.minecraft.client.realms.dto.PingResult wrapperContained; public PingResult(net.minecraft.client.realms.dto.PingResult wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List pingResults() { return wrapperContained.pingResults; }
public java.util.List worldIds() { return wrapperContained.worldIds; }

}